import React, { Component } from 'react'
import {Navbar,Nav,NavDropdown,Form,FormControl,Button} from 'react-bootstrap';
export default class HeaderComponent extends Component{
render(){
    return(
        <div>
<Navbar collapseOnSelect expand="lg" bg="dark" variant="dark">
  <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
  <Navbar.Toggle aria-controls="basic-navbar-nav" />
  <Navbar.Collapse id="basic-navbar-nav">
    
   
  </Navbar.Collapse>
</Navbar>
</div>)
}
}