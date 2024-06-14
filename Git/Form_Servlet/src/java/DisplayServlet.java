import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String numStr = request.getParameter("num1");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Display Page</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Display the Number</h1>");
            if (numStr != null && !numStr.isEmpty()) {
                try {
                    int num = Integer.parseInt(numStr);
                    out.println("The number entered is: " + num);
                } catch (NumberFormatException e) {
                    out.println("Invalid input. Please enter a valid number.");
                }
            } else {
                out.println("No number to display.");
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
}