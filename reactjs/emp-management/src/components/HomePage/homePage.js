import React, { Component } from 'react'
import HomeNavbar from '../Navbar/homeNavbar';
import {Nav} from 'react-bootstrap';

export default class HomePage extends Component {
    constructor(props) {
        super(props);
        this.state = {
            bean: JSON.parse(localStorage.getItem("bean"))
        }
    }
    render() {
        return (
            <div>
                <HomeNavbar name={this.state.bean.empName} />
                <Nav fill variant="tabs" defaultActiveKey="/home">
                    <Nav.Item>
                        <Nav.Link to="/info">Primary Information</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link to="/otherInfo">Secondary Information</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link to="/addressInfo">Address</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link to="/experienceInfo" >ExperienceInfo</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link to="/educationInfo">Education</Nav.Link>
                    </Nav.Item>
                    <Nav.Item>
                        <Nav.Link to="/trainingInfo" >TrainingInfo</Nav.Link>
                    </Nav.Item>
                </Nav>
                <h1>Welcome</h1>
                <h1>{this.state.bean.empName}</h1>
            </div>
        )
    }
}

