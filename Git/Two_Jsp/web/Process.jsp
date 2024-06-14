<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.IOException"%>
<%
    String numStr = request.getParameter("num1");
    if (numStr != null) {
        request.setAttribute("num1", numStr);
        request.getRequestDispatcher("display.jsp").forward(request, response);
    } else {
        out.println("No input received. Please go back and enter a number.");
    }
%>
