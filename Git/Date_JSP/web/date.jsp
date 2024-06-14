<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Current Date</title>
</head>
<body>
    <h2>Current Date:</h2>
    <%
        // Create Date object for the current date and time
        Date date = new Date();

        // Format the date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Print the formatted date
        out.println(sdf.format(date));
    %>
</body>
</html>