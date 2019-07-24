
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./loginNew" method="post">
		User ID  :<input type="text" name="id" required="required">
		Password :<input type="password" name="password" required="required">
		<button type="submit" >Login</button>
	</form>
</body>
</html> -->
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
<script>
window.onload=function(){
	
};
function validateForm(){
    var id=document.forms[0].id.value;   
    var pass=document.forms[0].password.value;
    
    if(id.length >=1 && pass.length >= 4){
        document.forms[0].loginButton.disabled=false;
    }else {
    	document.getElementById('div2').innerHTML='<p>Please enter valid employee Id and password</p>';
        document.forms[0].loginButton.disabled=true;
    }
}
</script>
</head>
<body>
	<h2 class="text-center">Employee Management Portal</h2>
	<% String msg=request.getParameter("msg"); %>
	<div class="col-md-4 offset-4 text-black">
		<div class="card-body">
			<div id="div2"> <%if(msg != null || !msg.isEmpty()){ %>
						<%=msg %>
						<%} %>
			</div>
			<form action="/emp/loginNew" method="POST">

				<div class="form-group">
					<label for="Id">Employee Id</label> <input type="number" id="id"
						name="id" placeholder="Enter Employee Id" class="form-control"
						onkeyup="validateForm()" required>
				</div>
				<div class="form-group">
					<label for="name">Password</label> <input type="password"
						id="password" name="password" placeholder="Enter Password"
						class="form-control" onkeyup="validateForm()" required>
				</div>

				<div class="form-group">
					<button type="submit" id="loginButton" class="btn btn-primary"
						disabled>Login</button>
				</div>
				<div class="form-group">
					<button type="button" id="newAcBtn" class="btn btn-default">
						<a href="html/createEmployee.html">Create Account</a>
					</button>
					<button type="button" id="forgotpass" class="btn btn-default">Forgot
						Password</button>
				</div>
			</form>
		</div>
	</div>
	<!-- 	<script type="text/javascript" src="./js/login.js"></script> -->
</body>
</html>