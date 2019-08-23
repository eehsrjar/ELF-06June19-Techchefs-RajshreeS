import React, { Component } from 'react';

import Axios from 'axios';

export default class ViewUsers extends Component {
   
    componentDidMount(){
        Axios.get('http://localhost:8080/getAllUsers').then((response)=>{
            console.log('Response Object11',response.data);
            if(response.data.message === "success"){
              localStorage.setItem("beans",JSON.stringify(response.data.beans));
              this.props.history.push('/allUsers');          
            }else{
              this.props.history.push('/AdminHome');
              localStorage.setItem('nouser',response.data.description);
            }
        }).catch((error)=>{
            console.log('Error',error);
        })
    }
    render() {
        return (
            <div>
              
            </div>
        )
    }
}
