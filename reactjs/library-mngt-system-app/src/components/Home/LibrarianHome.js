import React, { Component } from 'react'

import LibrarianNavbar from '../navbar/LibrarianNavbar';

export default class LibrarianHome extends Component {
    constructor(props){
        super(props);
        this.state={
            bean:JSON.parse(localStorage.getItem("bean"))
            
        }
    }
    render() {
        return (
            <div className="background">
                <LibrarianNavbar></LibrarianNavbar>
                <h4>{localStorage.getItem('nouser')}</h4>
                   <h2>{this.state.bean.firstName}</h2> 
            </div>
        )
    }
}