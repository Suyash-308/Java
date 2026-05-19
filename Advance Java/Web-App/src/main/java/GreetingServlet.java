import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/greet")

public class GreetingServlet implements Servlet {

    public  GreetingServlet(){
        System.out.println("greetingServlet - constructor ");
    }


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
        servletResponse.getWriter().println("Hello"+ LocalDateTime.now());
    }


    @Override
    public void destroy() {
        System.out.println("distroy");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public String getServletInfo() {
        return "";
    }


}
