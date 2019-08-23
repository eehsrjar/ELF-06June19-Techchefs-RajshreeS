import React, { Component } from 'react';
import ImageUploader from 'react-images-upload';
import {Alert } from 'react-bootstrap';
import Axios from 'axios';
import {Link} from 'react-router-dom';
import '../login/login.css';

export default class AddUser extends Component {
    constructor() {
        super();
        this.state = {
            fields: {},
            errors: {},
            setShow:false,
            pass:''
        }

        this.handleChange = this.handleChange.bind(this);
        this.submituserRegistrationForm = this.submituserRegistrationForm.bind(this);

    };

    handleChange(e) {
        let fields = this.state.fields;
        fields[e.target.name] = e.target.value;
        this.setState({
            fields
        });

    }

    submituserRegistrationForm(e) {
        e.preventDefault();
        if (this.validateForm()) {
            let fields = {};
            fields["firstName"] = "";
            fields["lastName"] = "";            
            fields["email"] = "";
            fields["phoneNo"] = "";
            fields["address"] = "";
            fields["userImage"]= "";
            this.setState({ fields: fields });
            //alert("Form submitted");
        }
        let fields = {};
        let postData=this.state.fields;
        console.log("THIS atate",this.state.fields);
        Axios.post('http://localhost:8080/addUser',postData).then((response) => {
            console.log('Response Object', response.data);
            if (response.data.message === "success") {
               this.setState({setShow:true,pass:response.data.beans[0].password})
               
                }
            
        }).catch((error) => {
            console.log('Error', error);
        })
    }

    validateForm() {

        let fields = this.state.fields;
        let errors = {};
        let formIsValid = true;

        if (!fields["firstName"]) {
            formIsValid = false;
            errors["firstName"] = "*Please enter your username.";
        }

        if (typeof fields["firstName"] !== "undefined") {
            if (!fields["firstName"].match(/^[a-zA-Z ]*$/)) {
                formIsValid = false;
                errors["firstName"] = "*Please enter alphabet characters only.";
            }
        }

        if (!fields["lastName"]) {
            formIsValid = false;
            errors["lastName"] = "*Please enter your username.";
        }

        if (typeof fields["lastName"] !== "undefined") {
            if (!fields["lastName"].match(/^[a-zA-Z ]*$/)) {
                formIsValid = false;
                errors["lastName"] = "*Please enter alphabet characters only.";
            }
        }
        if (!fields["email"]) {
            formIsValid = false;
            errors["email"] = "*Please enter your email-ID.";
        }

        if (typeof fields["email"] !== "undefined") {
            //regular expression for email validation
            var pattern = new RegExp(/^(("[\w-\s]+")|([\w-]+(?:\.[\w-]+)*)|("[\w-\s]+")([\w-]+(?:\.[\w-]+)*))(@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$)|(@\[?((25[0-5]\.|2[0-4][0-9]\.|1[0-9]{2}\.|[0-9]{1,2}\.))((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\.){2}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\]?$)/i);
            if (!pattern.test(fields["emailid"])) {
                formIsValid = false;
                errors["emailid"] = "*Please enter valid email-ID.";
            }
        }

        if (!fields["phoneNo"]) {
            formIsValid = false;
            errors["phoneNo"] = "*Please enter your mobile no.";
        }

        if (typeof fields["phoneNo"] !== "undefined") {
            if (!fields["phoneNo"].match(/^[0-9]{10}$/)) {
                formIsValid = false;
                errors["phoneNo"] = "*Please enter valid mobile no.";
            }
        }      

        this.setState({
            errors: errors
        });
        return formIsValid;
    }

    
    render() {
        return (
            <div className="background">
               <div className="row">
                    <div className="col-md-4"></div> 
                    <div className="col-md-4">
                    <div className="card">
                        <div className="card-header">
                            <h3>  User Registration</h3>
                        </div>
                        <div className="card-body">
                       

                        <Alert show={this.state.setShow} variant="primary" onClose={() => this.setState({setShow:false})} dismissible>
                               Login with Password : {this.state.pass}
                               <Link className="nav-link" to="/">Go to Login Page</Link>
                            </Alert>
                        <form method="post" name="userRegistrationForm" onSubmit={this.submituserRegistrationForm} >
                        <div className="form-group">
                        <label>First Name</label>
                        <input type="text" name="firstName" className="form-control" value={this.state.fields.firstName} onChange={this.handleChange} />
                        <div className="errorMsg">{this.state.errors.firstName}</div>
                        </div>
                        <div className="form-group">
                        <label>Last Name</label>
                        <input type="text" name="lastName" className="form-control" value={this.state.fields.lastName} onChange={this.handleChange} />
                        <div className="errorMsg">{this.state.errors.lastName}</div>
                        </div>
                        <div className="form-group">
                        <label>Email ID</label>
                        <input type="text" name="email" className="form-control" value={this.state.fields.email} onChange={this.handleChange} />
                        <div className="errorMsg">{this.state.errors.email}</div>
                        </div>
                        <div className="form-group">
                        <label>Phone No</label>
                        <input type="text" name="phoneNo" className="form-control" value={this.state.fields.phoneNo} onChange={this.handleChange} />
                        <div className="errorMsg">{this.state.errors.phoneNo}</div>
                        </div>
                        <div className="form-group">
                        <label>Address</label>
                        <textarea className="form-control" name="address" rows='2'value={this.state.fields.address} onChange={this.handleChange} />
                        <div className="errorMsg">{this.state.errors.address}</div>
                        </div>
                        <div className="form-group">
                        <ImageUploader
                withIcon={true}
                buttonText='Choose images'
                name="userImage"
                value={this.state.fields.userImage}
               
                imgExtension={['.jpg', '.gif', '.png', '.gif']}
                maxFileSize={5242880}
            />
            </div>
            <div className="form-group">
                        <input type="submit" className="btn btn-primary" value="Register" /> 
                        </div>                     
                    </form>
                </div>
               </div>
               </div> 
            </div>
            </div>
        );
    }


}



