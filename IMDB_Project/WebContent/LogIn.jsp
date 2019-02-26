<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<script type="text/javascript">

function validate()
{
	var x = document.myForm.nm.value;
	if(x=='')
		{
			alert("Name cannot be empty");
			return false;
		}
	if(!isNaN(x))
		{
			alert("Name cannot have number");
			return false;
		}
	
}

</script>

<body>

<h1>Create Account</h1>

<form action="">
Name : <input type="text" name="nm"><br><br>
Email : <input type="email" name="em"><br><br>
Password : <input type="password" name="pswd"><br><br>
Confirm Password : <input type="password" name="cp"><br><br>

<input type="submit" value="Create your IMDb account" onclick="return validate()">
</form>

</body>
</html>