<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Output Page</title>
</head>
<body>
    <h2>Submitted Details</h2>
    <%
        // Get form parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Display the submitted details
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Email: " + email + "</p>");
    %>
</body>
</html>