
import java.io.*;
import jakarta.servlet.http.*;

public class GetAndPostMethods extends HttpServlet {

    protected void doGet(HttpServletRequest req,
                         HttpServletResponse res)
                         throws IOException {

        res.getWriter().println("GET Request");
    }

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
                          throws IOException {

        res.getWriter().println("POST Request");
    }
}
