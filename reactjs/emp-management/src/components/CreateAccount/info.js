import React, { Component } from 'react'

export default class Info extends Component {
    render() {
        return (
            <div>

                <div class="container">
                    <p class="h3" style="text-align: center;">EMPLOYEE INFORMATION</p>
                    <hr>
                        <form method="POST">
                            <div class="row">
                                <div class="col">
                                    <label for="Employee Id">ID</label> <input type="number"
                                        class="form-control" onkeyup="add()" id="id" name="id"
                                        placeholder="ID" />
                                </div>
                                <div class="col">
                                    <label for="Account Number">ACCOUNT NUMBER</label> <input
                                        type="number" class="form-control" name="accountNumber"
                                        placeholder="ACCOUNT NUMBER">
						</div>
                                </div>
                                <div class="row">
                                    <div class="col">
                                        <label for="Emp Name">NAME</label> <input type="text"
                                            class="form-control" name="empName" placeholder="NAME">
						</div>
                                        <div class="col">
                                            <label for="Email">EMAIL ID</label> <input type="email"
                                                class="form-control" name="email" placeholder="EMAIL ID">
						</div>
                                        </div>
                                        <div class="row">
                                            <div class="col">
                                                <label for="password">Password</label> <input type="password"
                                                    class="form-control" name="password" placeholder="Password">
						</div>
                                                <div class="col">
                                                    <label for="confirmPassword">Confirm Password</label> <input
                                                        type="password" class="form-control" name="cnfPass"
                                                        placeholder="Confirm Password">
						</div>
                                                </div>
                                                <div class="row">
                                                    <div class="col">
                                                        <label for="Age">AGE</label> <input type="number"
                                                            class="form-control" name="age" placeholder="AGE">
						</div>
                                                        <div class="col">
                                                            <label for="Designation">DESIGNATION</label> <input type="text"
                                                                class="form-control" name="designation"
                                                                placeholder="DESIGNATION">
						</div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col">
                                                                <label for="inputGender">Gender</label> <select
                                                                    class="form-control" name="gender">
                                                                    <option selected>--select one--</option>
                                                                    <option value="male">male</option>
                                                                    <option value="female">female</option>
                                                                    <option value="other">other</option>
                                                                </select>
                                                            </div>
                                                            <div class="col">
                                                                <label for="DOB">Date of Birth</label> <input type="date"
                                                                    class="form-control" name="dob" placeholder="yyyy-mm-dd">
						</div>
                                                            </div>
                                                            <div class="row">
                                                                <div class="col">
                                                                    <label for="Salary">SALARY</label> <input type="text"
                                                                        class="form-control" name="salary" placeholder="SALARY">
						</div>
                                                                    <div class="col">
                                                                        <label for="DeptId">DEPAETMENT ID</label> <input type="number"
                                                                            class="form-control" name="departmentId"
                                                                            placeholder="DEPAETMENT ID">
						</div>
                                                                    </div>
                                                                    <div class="row">
                                                                        <div class="col">
                                                                            <label for="Phone">PHONE NUMBER</label> <input type="tel"
                                                                                class="form-control" name="phone" placeholder="PHONE NUMBER">
						</div>
                                                                            <div class="col">
                                                                                <label for="Manager">MANAGER ID</label> <input type="number"
                                                                                    class="form-control" name="mngId" placeholder="MANAGER ID">
						</div>
                                                                            </div>
                                                                            <div class="row">

                                                                                <div class="col-6">
                                                                                    <label for="Joining Date">JOINING DATE</label> <input type="date"
                                                                                        class="form-control" name="joiningDate"
                                                                                        placeholder="JOINING DATE">
						</div>
                                                                                    <div class="col-3">
                                                                                        <br> <input type="button" data-toggle="collapse"
                                                                                            class="form-control btn btn-outline-success"
                                                                                            data-target="#empOtherInfo" value="Emplyee Other Info" />
						</div>
                                                                                        <div class="col-3">
                                                                                            <br>
                                                                                                <button type="reset"
                                                                                                    class="form-control btn btn-outline-secondary">reset</button>
						</div>
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                                )
                                                                            }
                                                                        }
                                                                        
