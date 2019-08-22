import React from 'react'
import {BrowserRouter as Router,Route} from 'react-router-dom';
import Login from '../login/login';
import UserNavbar from './UserNavbar';
import AdminHome from '../Home/AdminHome';
import LibrarianNavbar from './LibrarianNavbar';
import AllUsers from '../AdminSearch/AllUsers';
export default function Navbar(props) {
    
        return (
            <Router>
            <Route exact path='/' component={Login}></Route>
               <Route path='/adminHome' component={AdminHome}></Route>
               <Route path='/librarianHome' component={LibrarianNavbar}></Route>
               <Route path='/userHome' component={UserNavbar}></Route>
               <Route path='/allUsers' component={AllUsers}></Route>
           </Router>
        )
    
}