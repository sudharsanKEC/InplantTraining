
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ServletLifecycle extends HttpServlet {

    public void init() {
        System.out.println("Servlet Initialized");
    }

    protected void service(HttpServletRequest req,
                           HttpServletResponse res) {
        System.out.println("Request Processed");
    }

    public void destroy() {
        System.out.println("Servlet Destroyed");
    }
}
