import React from 'react'
import {BrowserRouter as Router,Route} from 'react-router-dom';
import Login from '../login/login';
import AdminHome from '../Home/AdminHome';
import AllUsers from '../AdminSearch/AllUsers';
import ViewUsers from '../Users/ViewUsers';
import LibrarianHome from '../Home/LibrarianHome';
import NormalUserHome from '../Home/NormalUserHome';
import AddUser from '../Users/AddUser';
export default function Navbar(props) {
    
        return (
            <Router>
            <Route exact path='/' component={Login}></Route>
               <Route path='/adminHome' component={AdminHome}></Route>
               <Route path='/librarianHome' component={LibrarianHome}></Route>
               <Route path='/userHome' component={NormalUserHome}></Route>
               <Route path='/allUsers' component={AllUsers}></Route>
               <Route path='/viewUsers' component={ViewUsers}></Route>
               <Route path='/addUser' component={AddUser}></Route>
           </Router>
        )
    
}