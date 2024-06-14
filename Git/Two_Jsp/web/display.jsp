<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Page</title>
    </head>
    <body>
        <h1>Display the Number</h1>
        <%
            String numStr = (String) request.getAttribute("num1");
            if (numStr != null) {
                try {
                    int num = Integer.parseInt(numStr);
                    out.print("The number entered is: " + num);
                } catch (NumberFormatException e) {
                    out.println("Invalid input. Please enter a valid number.");
                }
            } else {
                out.println("No number to display.");
            }
        %>
    </body>
</html>