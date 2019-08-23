import React, { Component } from 'react';

import Axios from 'axios';

import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import AppBar from 'material-ui/AppBar';
import RaisedButton from 'material-ui/RaisedButton';
import TextField from 'material-ui/TextField';
class Login extends Component {
constructor(props){
  super(props);
  this.state={
  id:'',
  password:''
  }
  this.handleClick=this.handleClick.bind(this);
 }
 handleClick(event){
  event.preventDefault();
 
  //let accountData=this.state;
  Axios.post('http://localhost:80/emp-springrest/login/authenticate',null,{
    params:{
      id:this.state.id,
      password:this.state.password
    }
  }).then((response)=>{
      console.log('Response Object',response.data);
      if(response.data.message === "Successfull"){
      this.props.history.push('/home');
      localStorage.setItem("bean",JSON.stringify(response.data.beans[0]));
      }else{
        this.props.history.push('/');
      }
  }).catch((error)=>{
      console.log('Error',error);
  })
 }
render() {
    return (
      <div>
        <MuiThemeProvider>
          <div>
          <AppBar
             title="Login"
           />
           <TextField
             hintText="Enter your Username"
             floatingLabelText="Id"
             onChange = {(event,newValue) => this.setState({id:newValue})}
             />
           <br/>
             <TextField
               type="password"
               hintText="Enter your Password"
               floatingLabelText="Password"
               onChange = {(event,newValue) => this.setState({password:newValue})}
               />
             <br/>
             <RaisedButton label="Submit" primary={true} style={style} onClick={(event) => this.handleClick(event)}/>
         </div>
         </MuiThemeProvider>         
      </div>
    );
  }
}
const style = {
 margin: 15,
};
export default Login;