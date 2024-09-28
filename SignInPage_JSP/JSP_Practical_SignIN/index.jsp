<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>Welcome, <%= request.getParameter("username") %>!</h1>
    <p>This is the main page after signing in.</p>
    <a href="signin.jsp">Sign In</a> |
    <a href="signup.jsp">Sign Up</a>
</body>
</html>
