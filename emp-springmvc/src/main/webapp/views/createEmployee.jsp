<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function add() {
		document.getElementById("otherId").value = document
				.getElementById("id").value;
	}
</script>

</head>
<body style="background: lightgoldenrodyellow">
	<h1>Employee Management Portal</h1>

	<div class="container">
		<button data-toggle="collapse" data-target="#empInfo">Employee
			Information</button>
		<!--  <button data-toggle="collapse" data-target="#empOtherInfo">Employee
			Other Information</button>  -->
		<div id="empInfo" class="collapse">
			<div class="container">
				<p class="h3" style="text-align: center;">EMPLOYEE INFORMATION</p>
				<hr>
				<form action="./create" method="POST">
					<div class="row">
						<div class="col">
							<label for="Employee Id">ID</label> <input type="number"
								class="form-control" onkeyup="add()" id="id" name="id"
								placeholder="ID">
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
							<label for="Salary">SALARY</label> <input type="number"
								class="form-control" name="salary" placeholder="SALARY">
						</div>
						<div class="col">
							<label for="DeptId">DEPAETMENT ID</label> <input type="number"
								class="form-control" name="departmentId" placeholder="DEPAETMENT ID">
						</div>
					</div>
					<div class="row">
						<div class="col">
							<label for="Phone">PHONE NUMBER</label> <input type="tel"
								class="form-control" name="phone" placeholder="PHONE NUMBER">
						</div>
						<div class="col">
							<label for="Manager">MANAGER ID</label> <input type="number"
								class="form-control" name="managerId" placeholder="MANAGER ID">
						</div>
					</div>
					<div class="row">

						<div class="col-6">
							<label for="Joining Date">JOINING DATE</label> <input type="date"
								class="form-control" name="joiningDate"
								placeholder="JOINING DATE">
						</div>
						<div class="col-3">
							<br>
							<!-- <button type="submit"
								class="form-control btn btn-outline-success">Submit</button> -->

							<input type="button" data-toggle="collapse"
								class="form-control btn btn-outline-success"
								data-target="#empOtherInfo" value="Add" />
						</div>
						<div class="col-3">
							<br>
							<button type="reset"
								class="form-control btn btn-outline-secondary">reset</button>
						</div>

					</div>
					
					<div id="empOtherInfo" class="collapse">
						<!-- <div class="container"> -->
						<p class="h3" style="text-align: center;">EMPLOYEE OTHER
							INFORMATION</p>
						<hr>
						<!-- <form action="/create" method="POST"> -->
						<div class="row">
							<div class="col">
								<label for="Id">ID</label> <input type="number"
									class="form-control" name="otherInfoBean.id" id="otherId"
									readonly="readonly">
							</div>
							<div class="col">
								<label for="exampleInputemergenum">Emergency Contact
									Number</label> <input type="tel" class="form-control"
									name="otherInfoBean.emergencyContactNumber"
									placeholder="Please Enter Emergency Contact Number">
							</div>
							<div class="col">
								<label for="exampleInputmotname">Mother Name</label> <input
									type="text" class="form-control" id="mothername" name="otherInfoBean.motherName"
									placeholder="Please Enter Mother Name">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="exampleInputPan">Pan Number</label> <input
									type="text" class="form-control" name="otherInfoBean.pan"
									placeholder="Please Enter Pan Number">
							</div>
							<div class="col">
								<label for="exampleInputemergeName">Emergency Contact
									Name</label> <input type="text" class="form-control"
									name="otherInfoBean.emergencyContactName"
									placeholder="Please Enter Emergency Contact Name">
							</div>
							<div class="col">
								<label for="exampleInputspouse">Spouse Name</label> <input
									type="text" class="form-control" name="otherInfoBean.spouseName"
									placeholder="Please Enter Spouse Name">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputStatus">Marrital Status</label> <select
									name="otherInfoBean.inputStatus" class="form-control">
									<option selected>Married</option>
									<option value="1">Married</option>
									<option value="0">Unmarried</option>

								</select>
							</div>
							<div class="col">
								<label for="inputnationality">Nationality</label> <select
									name="otherInfoBean.inputnationality" class="form-control">
									<option selected>---Select One---</option>
									<option value="indian">Indian</option>
									<option value="other">Other</option>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputpassport">Passport Number</label> <input
									type="text" class="form-control" name="otherInfoBean.passport"
									placeholder="Please Enter Passport Number">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<label for="inputbloodgrp">Blood Group</label> <select
									name="otherInfoBean.inputbloodgrp" class="form-control">
									<option selected>---Select One---</option>
									<option value="AB+">AB+</option>
									<option value="AB-">AB-</option>
									<option value="A+">A+</option>
									<option value="A-">A-</option>
									<option value="o+">o+</option>
									<option value="o-">o-</option>
								</select>
							</div>
							<div class="col">
								<label for="inputreligion">Religion</label> <select
									name="otherInfoBean.inputreligion" class="form-control">
									<option selected>---Select One---</option>
									<option value="hindu">Hindu</option>
									<option value="christian">Christian</option>
									<option value="muslim">Muslim</option>
								</select>
							</div>
							<div class="col">
								<label for="exampleInputaadhar">Aadhar Number</label> <input
									type="text" class="form-control" name="otherInfoBean.adharnumber"
									placeholder="Please Enter Aadhar Number">
							</div>
						</div>
						<div class="row">
							<div class="col-4">
								<label for="inputphysicallych">Physically Challenged</label> <select
									name="otherInfoBean.physicallyChallenged" class="form-control">
									<option selected>---Select One---</option>
									<option value="yes">Yes</option>
									<option value="no">No</option>
								</select>
							</div>
							<div class="col-4">
								<label for="exampleInputfather">Father Number</label> <input
									type="text" class="form-control" name="otherInfoBean.fathername"
									placeholder="Please Enter Father Number">
							</div>

							<div class="col-2">
								<br>
								<button type="submit"
									class="form-control btn btn-outline-success">Submit</button>

							</div>
							<div class="col-2">
								<br>
								<button type="reset"
									class="form-control btn btn-outline-secondary">reset</button>
							</div>
							</div>
				</form>
			</div>
		</div>
	</div>
</body>



</html>