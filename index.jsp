<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="index/html; charset=ISO-8859-1">
<link rel="stylesheet" href="index.css">
<title>CALCULATOR APP</title>
</head>
<body>
<center>
<h1>CALCULATOR</h1>
<form action="/CalculatorServiet" method="post">

<input type="text" name="num1" placeholder="1-st Value" />
<br>
<br>
<input type="text" name="num2" placeholder="2-nd Value" />
<br>
<br>
<input type="submit" name="button" value="+"  />
<br>
<br>
<input type="submit" name="button" value="-"  />
<br>
<br>
<input type="submit" name="button" value="*"  />
<br>
<br>
<input type="submit" name="button" value="/"  />
<br>
</form>
<%

if(request.getParameter("q")!=null)
{
	out.print("result is "+request.getParameter("q"));
}

%>
</center>
</body>
</html>