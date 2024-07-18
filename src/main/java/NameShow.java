import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/displayname")
public class NameShow extends HttpServlet  {

    @Override
    public void doPost (HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException , IOException {
        servletResponse.setContentType("text/html");


        PrintWriter out = servletResponse.getWriter();

        String name = servletRequest.getParameter("name");

        out.println("<h1>Welcome "+name+"</h1>");

        out.close();

    }

}
