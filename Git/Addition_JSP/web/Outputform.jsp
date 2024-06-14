<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Sum Result</title>
</head>
<body>
    <h2>Sum of the Two Numbers</h2>
    <%
        // Retrieve the form parameters
        String num1Str = request.getParameter("number1");
        String num2Str = request.getParameter("number2");

        // Convert the parameters to integers
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        out.println("<p>Number 1: " + num1 + "</p>");
        out.println("<p>Number 2: " + num2 + "</p>");
        out.println("<h3>Sum: " + sum + "</h3>");
    %>
</body>
</html>