import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/login")

public class LoginServlet extends GenericServlet {


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service");

       String username = servletRequest.getParameter("username");
       String password = servletRequest.getParameter("password");


       servletResponse.getWriter().println(username+ "\t" + LocalDateTime.now());
    }


}
