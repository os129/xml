import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CurrentDateServlet")
public class CurrentDateServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // Get the current date and time
        Date currentDate = new Date();

        // Create a date formatter
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Format the date
        String formattedDate = sdf.format(currentDate);

        // Generate the HTML response
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Current Date</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Current Date:</h2>");
            out.println("<p>" + formattedDate + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
