import React from 'react'
import {BrowserRouter as Router,Route} from 'react-router-dom';
import HomePage from '../HomePage/homePage';
import Login from '../Login/login';
export default function Navbar(props) {
    
        return (
            <Router>
            <Route exact path='/' component={Login}></Route>
               <Route path='/home' component={HomePage}></Route>
           </Router>
        )
    
}
