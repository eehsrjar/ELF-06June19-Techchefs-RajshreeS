import React, { Component } from 'react';
import { Navbar, Nav, Form, FormControl, Button } from 'react-bootstrap';
import Axios from 'axios';
import { withRouter, Link } from 'react-router-dom';
import LinkContainer from 'react-router-bootstrap';


class AdminNavbar extends Component {
    constructor(props) {
        super(props);
        this.state = {
            search: '',
            bean: JSON.parse(localStorage.getItem("bean"))
        }
        this.search = this.search.bind(this);
    }
    search(e) {
        e.preventDefault();
        console.log("this.state.search:", this.state.search);
        Axios.get('http://localhost:8080/searchByName?name=' + this.state.search).then((response) => {
            console.log('Response Object', response.data);
            if (response.data.message === "success") {
                localStorage.setItem("beans", JSON.stringify(response.data.beans));
                this.props.history.push('/allUsers');

            } else {
                this.props.history.push('/AdminHome');
                localStorage.setItem('nouser', response.data.description);
            }
        }).catch((error) => {
            console.log('Error', error);
        })
    }
    logout(e) {
        e.preventDefault();
        Axios.get('http://localhost:8080/logout', null
        ).then((response) => {
            console.log('Response Object', response.data);
            if (response.data.message === "success") {
                console.log(this.props);
                this.props.history.push('/');
                localStorage.setItem('msg', response.data.description);
            }

        }).catch((error) => {
            console.log('Error', error);
        })
    }
    render() {
        return (
            <div>
                <Navbar bg="light" expand="lg">
                    <Navbar.Brand href="">Library Portal</Navbar.Brand>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="mr-auto">                            
                            <Link className="nav-link" to="/adminHome">Home</Link>                            
                            {/*  <LinkContainer to="/viewUsers">View Users</LinkContainer> */}
                            <Link className="nav-link" to="/viewUsers">View users</Link>

                        </Nav>
                        <Form onSubmit={this.search} inline className=" mr-auto">
                            <FormControl type="text" name="search" onChange={(event) => { this.setState({ search: event.target.value }) }} value={this.state.search} placeholder="Search" className="mr-sm-2" />
                            <Button type='submit' variant="outline-success">Search</Button>
                        </Form>
                        <Navbar.Text>Welcome  {this.state.bean.firstName}</Navbar.Text>
                        <Button variant="link" onClick={this.logout.bind(this)}>Logout</Button>
                    </Navbar.Collapse>
                </Navbar>
            </div>
        )
    }
}
export default withRouter(AdminNavbar)
