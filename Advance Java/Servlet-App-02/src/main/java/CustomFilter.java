import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = {"/s1", "/s2", "/s3"})
public class CustomFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Custom filter");
       String username= servletRequest.getParameter("username");
       String password= servletRequest.getParameter("password");

        if("admin".equalsIgnoreCase(username)  && "admin".equalsIgnoreCase(password)){
            filterChain.doFilter(servletRequest,servletResponse);

        }else {
            servletResponse.getWriter().println("Invalid Credential");
        }


    }
}
