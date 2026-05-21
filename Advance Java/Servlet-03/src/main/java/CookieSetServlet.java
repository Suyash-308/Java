import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdk.internal.net.http.frame.Http2Frame;

import java.io.IOException;

@WebServlet("/search")
public class CookieSetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String query= req.getParameter("query");
        Cookie cookie=new Cookie("cookie",query);
        resp.addCookie(cookie);
         resp.getWriter().println("cookie are set successfully" +query);

    }
}
