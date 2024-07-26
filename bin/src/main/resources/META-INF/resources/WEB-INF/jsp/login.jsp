<html>
	<head>
		<title> Login page</title>
	</head>
	<body>
		<h1>Welcome to the login page ${name}!</h1>
		<pre>${ErrorMessage}</pre>
		<form method="post">
			Name: <input type="text" name="name">
			Password: <input type="password" name="password" id="">
			<input type="submit">
		</form>
	</body>
</html>