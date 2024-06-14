import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the form parameters from the request attributes
        String num1Str =  request.getParameter("number1");
        String num2Str =  request.getParameter("number2");

        // Convert the parameters to integers
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Calculate the sum
        int sum = num1 + num2;

        // Set the content type and write the response
        response.setContentType("text/html");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Sum of the Two Numbers</h2>");
        response.getWriter().println("<p>Number 1: " + num1 + "</p>");
        response.getWriter().println("<p>Number 2: " + num2 + "</p>");
        response.getWriter().println("<h3>Sum: " + sum + "</h3>");
        response.getWriter().println("</body></html>");
    }
}
