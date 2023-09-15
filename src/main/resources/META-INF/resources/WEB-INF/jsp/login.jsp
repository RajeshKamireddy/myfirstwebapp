<html>
	<head>
		<title>Login Page</title>
	</head>
	<body>
	Welcome to login page JSP!
		<pre>${errorMessage}</pre>
		<form method="post">
			UserName :<input type="text" name="name" required=true>
			Password :<input type="password" name="password" required=true>
			<input type="Submit">
		</form>
	</body>
</html>