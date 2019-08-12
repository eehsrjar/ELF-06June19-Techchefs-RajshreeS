import React, { Component } from 'react';
import Axios from 'axios';
export class CreateAccount extends Component {
    constructor(props){
        super(props);
        this.state={
            name:'',
            email:'',
            phoneno:'',
            password:''
        }
        this.postData=this.postData.bind(this);
    }
    postData(event){
        event.preventDefault();
        console.log('Post Data',this.state);
        let accountData=this.state;
        Axios.post('https://emp-app-2863b.firebaseio.com/accounts.json',accountData).then((response)=>{
            console.log('Response Object',response);
            this.setState({
                name:'',
                email:'',
                phoneno:'',
                password:''
            })
        }).catch((error)=>{
            console.log('Error',error);
        })
    }
    render() {
        return (
            <div>
                <form onSubmit={this.postData} style={{marginTop:50,marginLeft:200,marginRight:200}} >
                    <div className="row">
                        <div className="col">
                        <input type="text" onChange={(event)=>{this.setState({name:event.target.value})}} 
                        value={this.state.name} className="form-control" placeholder="Name"/>
                        </div>
                        <div className="col">
                        <input type="text" onChange={(event)=>{this.setState({email:event.target.value})}}
                         value={this.state.email} className="form-control" placeholder="Email"/>
                        </div>
                    </div>
                    <br/>
                    <div className="row">
                        <div className="col">
                        <input type="number" onChange={(event)=>{this.setState({phoneno:event.target.value})}}
                         value={this.state.phoneno} className="form-control" placeholder="Phone number"/>
                        </div>
                        <div className="col">
                        <input type="password" onChange={(event)=>{this.setState({password:event.target.value})}}
                        value={this.state.password} className="form-control" placeholder="Password"/>
                        </div>
                    </div>
                    <div style={{marginLeft:560,marginTop:20}}>
                        <button className="btn btn-success btn-lg"  type="submit">Create</button>
                    </div>
                </form>
            </div>
        )       
    }
}

export default CreateAccount
