
import java.io.*;
import jakarta.servlet.http.*;

public class RequestAndResponse extends HttpServlet {

    protected void doPost(HttpServletRequest req,
                          HttpServletResponse res)
                          throws IOException {

        String name = req.getParameter("name");

        PrintWriter out = res.getWriter();

        out.println("Welcome " + name);
    }
}
