import React, { Component } from 'react'
import UserNavbar from '../navbar/UserNavbar';


export default class NormalUserHome extends Component {
    constructor(props){
        super(props);
        this.state={
            bean:JSON.parse(localStorage.getItem("bean"))
            
        }
    }
    render() {
        return (
            <div>
                <UserNavbar></UserNavbar>
                <h4>{localStorage.getItem('nouser')}</h4>
                   <h2>{this.state.bean.firstName}</h2> 
            </div>
        )
    }
}