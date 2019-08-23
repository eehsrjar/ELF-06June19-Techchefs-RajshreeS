import React, { Component } from 'react';
import AdminNavbar from '../navbar/AdminNavbar';
import Axios from 'axios';
import { Modal, Button } from 'react-bootstrap';

export default class AllUsers extends Component {
    constructor(props) {
        super(props);
        this.state = {
            beans: [],
            id: '',
            show: false
        }
        if (localStorage.getItem("beans") != null) {
            this.state.beans = JSON.parse(localStorage.getItem("beans"));
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

    deleteUser(bean) {

        console.log("account id" + bean.userId);
        Axios.put('http://localhost:8080/deactivateUser', null, {
            params: {
                id: bean.userId
            }
        }).then((response) => {
            console.log("response" + response);
            alert('Deleted Successfully');
            let allBeans = this.state.beans;
            let index = allBeans.indexOf(bean);
            let newBeans = allBeans.splice(index, 1);
            console.log('newAccounts' + newBeans);
            this.setState({ beans: allBeans })
        })
            .catch((error) => {
                alert('Deletion failed');
            })

    }
    editUser(bean) {

        this.setState({
            firstName: bean.firstName,
            lastName: bean.lastName,
            email: bean.email,
            phoneNo: bean.phoneNo,
            address: bean.address,
            userType:bean.userType,
            show: !this.state.show,
            userId: bean.userId
        })
    }
    handleClose() {
        this.setState({ show: !this.state.show })
    }
    updateUserData() {
        const beans = this.state;
        const userData = beans;
        console.log('AccountData', userData);
        Axios.put('http://localhost:8080/updateUser' ,userData).then((response) => {
            console.log('Updated Successfully');
            this.handleClose();

        }).catch((error) => {
            console.log('Error', error);
        })
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
                    <div>

                        <Modal show={this.state.show} onHide={this.handleClose.bind(this)}>
                            <Modal.Header closeButton>
                                <Modal.Title>Modal heading</Modal.Title>
                            </Modal.Header>
                            <Modal.Body>
                                <div className="row">
                                    <div className="col">
                                        <input type="text" onChange={(event) => { this.setState({ firstName: event.target.value }) }}
                                            value={this.state.firstName} className="form-control" readOnly/>
                                    </div>
                                    <div className="col">
                                        <input type="text" onChange={(event) => { this.setState({ lastName: event.target.value }) }}
                                            value={this.state.lastName} className="form-control" readOnly/>
                                    </div>
                                    <div className="col">
                                        <input type="text" onChange={(event) => { this.setState({ email: event.target.value }) }}
                                            value={this.state.email} className="form-control" readOnly/>
                                    </div>
                                </div>
                                <br />
                                <div className="row">
                                    <div className="col">
                                        <input type="number" onChange={(event) => { this.setState({ phoneNo: event.target.value }) }}
                                            value={this.state.phoneNo} className="form-control" readOnly/>
                                    </div>
                                    <div className="col">
                                        <input type="text" onChange={(event) => { this.setState({ address: event.target.value }) }}
                                            value={this.state.address} className="form-control" readOnly/>
                                    </div>
                                    <div className="col">
                                        <input type="text" onChange={(event) => { this.setState({ userType: event.target.value }) }}
                                            value={this.state.userType} className="form-control"/>
                                    </div>
                                </div>

                            </Modal.Body>
                            <Modal.Footer>
                                <Button variant="secondary" onClick={this.handleClose.bind(this)}>
                                    Close
</Button>
                                <Button variant="primary" onClick={this.updateUserData.bind(this)}>
                                    Save Changes
</Button>
                            </Modal.Footer>
                        </Modal>
                    </div>
                </div>
            </div>
        )
    }
}
