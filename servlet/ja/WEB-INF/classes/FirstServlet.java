import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/first")
public class FirstServlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {

        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>テストサーブレット</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>サーブレットテスト</h1>");
        out.println("</body>");
        out.println("</html>");

    }
    
}
