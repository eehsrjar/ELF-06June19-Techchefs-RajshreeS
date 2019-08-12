import React, { Component } from 'react';
import Axios from 'axios';

export class ViewAccounts extends Component {

    constructor(props){
        super(props);
        this.state={
            accounts:[]
        }
    }
    componentDidMount(){
        Axios.get('https://emp-app-2863b.firebaseio.com/accounts.json').then((response)=>{
            console.log('Response data',response.data);
            let fetchedAccount=[];
            for(let key in response.data){
                console.log(response.data[key])
                    fetchedAccount.push({
                        ...response.data[key],
                        id:key
                    })
            }
            console.log('fetchedAccount',fetchedAccount);
            this.setState={
                accounts:fetchedAccount
            }
        }).catch((error)=>{
            console.log('Error',error);
        })
    }
    render() {
       
        return (
            <div>
                <table className="table table-striped">
                    <thead>
                        <tr>
                        <th scope="col">Name</th>
                        <th scope="col">Email</th>
                        <th scope="col">Phone number</th>
                        <th scope="col">Password</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                        <tr >
                        <th scope="row">1</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td>@mdo</td>
                        </tr>
                        }  
                    </tbody>
                    </table>
            </div>
        )
    }
}

export default ViewAccounts
