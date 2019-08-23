import React, { Component } from 'react';
import {Navbar,Nav,NavDropdown,Form,FormControl,Button} from 'react-bootstrap';
import Axios from 'axios';

export default class HomeNavbar extends Component {
    constructor(props){
        super(props);
        this.state={
            searchId:''
        }
        this.search=this.search.bind(this);
    }
    search(e){
        e.preventDefault();
        console.log("this.state.searchId:",this.state.searchId);
        Axios.get('http://localhost/emp-springrest/controller/getEmployeesById?id='+this.state.searchId).then((response)=>{
      console.log('Response Object',response.data);
      if(response.data.message === "Successfull"){
    //   this.props.history.push('/home');
    //   localStorage.setItem("bean",JSON.stringify(response.data.beans[0]));
    //   }else{
    //     this.props.history.push('/');
      }
  }).catch((error)=>{
      console.log('Error',error);
  })
    }
    render() {
        return (
            <div>
                <Navbar bg="light" expand="lg">
                    <Navbar.Brand href="/home">EMP Portal</Navbar.Brand>
                    <Navbar.Toggle aria-controls="basic-navbar-nav" />
                    <Navbar.Collapse id="basic-navbar-nav">
                        <Nav className="mr-auto">
                            <Nav.Link href="#home">Home</Nav.Link>
                            <Nav.Link href="#link">Link</Nav.Link>
                            
                        </Nav>
                        <Form onSubmit={this.search} inline className=" mr-auto">
                            <FormControl type="text" name="searchId" onChange={(event)=>{this.setState({searchId:event.target.value})}} value={this.state.searchId} placeholder="Search" className="mr-sm-2" />
                            <Button type='submit' variant="outline-success">Search</Button>
                        </Form>
                        <Navbar.Text>Welcome  {this.props.name}</Navbar.Text>
                        <NavDropdown title="Settings" id="basic-nav-dropdown">
                                <NavDropdown.Item href="/home">Update Profile</NavDropdown.Item>
                                
                                <NavDropdown.Divider />
                                <Button className="ml-auto">Logout</Button>
                               {/*  <NavDropdown.Button>Logout</NavDropdown.Button> */}
                            </NavDropdown>
                    </Navbar.Collapse>
                </Navbar>
            </div>
        )
    }
}
