import React, { Component } from 'react';
import AdminNavbar from '../navbar/AdminNavbar';


export default class AllUsers extends Component {
    constructor(props){
        super(props);
        this.state={
            beans:null
        }
        if(localStorage.getItem("beans")!=null)
    {
        this.state.beans=JSON.parse(localStorage.getItem("beans"));
    }
    }

    // componentDidMount(){
    //     Axios.get('http://localhost:8080/getAllUsers').then((response)=>{
    //         console.log('Response Object',response.data);
    //         if(response.data.message === "success"){
    //           localStorage.setItem("beans",JSON.stringify(response.data.beans));
    //           this.props.history.push('/allUsers');          
    //         }else{
    //           this.props.history.push('/AdminHome');
    //           localStorage.setItem('nouser',response.data.description);
    //         }
    //     }).catch((error)=>{
    //         console.log('Error',error);
    //     })
    // }

    deleteUser(e){

    }
    editUser(e){

    }
    render() {
        return (
            <div>
                 <AdminNavbar></AdminNavbar>
                <div>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">Name</th>
                            <th scope="col">Email</th>
                            <th scope="col">Phone number</th>
                            <th scope="col">User Type</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.beans.map((bean) => {
                                return <tr key={bean.userId}>
                                    <td>{bean.firstName}</td>
                                    <td>{bean.email}</td>
                                    <td>{bean.phoneNo}</td>
                                    <td>{bean.userType}</td>
                                    <td>
                                        <button onClick={this.deleteUser.bind(this, bean)} className='btn btn-danger'>Delete</button>
                                    </td>
                                    <td>
                                        <button onClick={this.editUser.bind(this, bean)} className='btn btn-success'>Edit</button>
                                    </td>
                                </tr>
                            })

                        }
                    </tbody>
                </table>
                </div>
            </div>
        )
    }
}
