import React, { Component } from 'react';
import AdminNavbar from '../navbar/AdminNavbar';


export default class AllUsers extends Component {
    constructor(props){
        super(props);
        this.state={
            beans:JSON.parse(localStorage.getItem("beans"))
        }
    }
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
