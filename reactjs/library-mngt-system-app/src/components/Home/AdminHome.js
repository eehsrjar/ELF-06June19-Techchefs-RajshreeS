import React, { Component } from 'react'
import '../login/login.css';
import AdminNavbar from '../navbar/AdminNavbar';

export default class AdminHome extends Component {
    constructor(props){
        super(props);
        this.state={
            bean:JSON.parse(localStorage.getItem("bean"))
            
        }
    }
    render() {
        return (
            <div className="background">
                <AdminNavbar ></AdminNavbar>
                <h4>{localStorage.getItem('nouser')}</h4>
                   <h2>{this.state.bean.firstName}</h2> 
            </div>
        )
    }
}
