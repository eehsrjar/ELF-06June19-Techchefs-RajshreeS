<%!
	public String name="Lenovo";
	public double cost=10000.00;
	{
		System.out.println("Inside a block");
	}
	
	public String getName(){
		return name;
	}
	public double getCost(){
		return cost;
	}
	public String getName(String name){
		return "New Mobile Handset"+name;
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Tags Demo</title>
</head>
<body>
	<h1>JSP Tags Demo</h1>
	<br><br>
	Name1: <%=name %><br>
	Name 2 :<%=getName() %><br>
	Name3 :<%= getName("ABC") %><br><br>
	Cost :<%= cost %><br>
	
</body>
</html>