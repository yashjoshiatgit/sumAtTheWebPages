import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

//@WebServlet("/add")
public class AddServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1Str = request.getParameter("num1");
		String num2Str = request.getParameter("num2");

		try {
			int num1 = Integer.parseInt(num1Str);
			int num2 = Integer.parseInt(num2Str);
			int sum = num1 + num2;

			// Set the content type to HTML
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang=\"en\">");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<title>Addition Result</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Sum: " + sum + "</h1>");
			out.println("</body>");
			out.println("</html>");
		} catch (NumberFormatException e) {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang=\"en\">");
			out.println("<head>");
			out.println("<meta charset=\"UTF-8\">");
			out.println("<title>Error</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Invalid input, please enter valid integers.</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
}