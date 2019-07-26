			<!DOCTYPE html>                                                                        
			
<%@page import="com.techchefs.emp.dto.EmployeeInfoBean"%>
<%@page import="java.util.ArrayList"%>
<html>                                                                                 
			<head>                                                                                 
			<meta charset="ISO-8859-1">                                                          
			<title>Insert title here</title>                                                       
			<link rel="stylesheet"                                                               
				href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"       
				integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"   
				crossorigin="anonymous">                                                              
			<script                                                                            
				src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" 
				></script>
			</head>                                                                            
			<body>                                                                             
			<nav class="navbar navbar-expand-lg navbar-light bg-light">                      
			  <a class="navbar-brand" href="welcome">EMP</a>                               
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navrSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>                                       
			  </button>                                                                           
			                                                                                      
			                                                                                      
			    <form class="form-inline my-2 my-lg-0" action="./search" method="GET">                                  
			      <input class="form-control mr-sm-2" type="search" placeholder="Search" name="id" aria-labelSearch>
			      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			    </form>                                                                           
			
			    <div><a class="ml-auto" href="./logout">Logout</a>   </div>                   
			</nav> 
			<%ArrayList<EmployeeInfoBean> arrId=(ArrayList<EmployeeInfoBean>)request.getAttribute("ArrayIds"); %>                                                                               
			 <div class="card-body"> 
			 <h3>List of Employees</h3>                                                           
			<table class="table table-borderless">  
			
			  <thead>                              
			    <tr>                               
			      <th >Employee Id</th>  
			      <th >Name</th>         
			    </tr>                           
			  </thead>                             
			  <tbody>                              
			<% for (EmployeeInfoBean employeeInfoBean : arrId) {%>
			    <tr>                                
			      <td><a href="./fetch?emp=<%=employeeInfoBean.getId() %>"><%=employeeInfoBean.getId() %></a></td>              
			      <td><%=employeeInfoBean.getEmpName() %></td>                    
			    </tr>                               
			<%} %>
			  </tbody>                              
			</table>                                
			 </div >                                
			</body>                                 
			</html>            