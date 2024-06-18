package homework9.task9_2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/check_age")
public class AgeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("""
                <html>
                    <body>
                        <form action="check_age" method="post">
                            <label for="age">
                                <h2>Input yor age: <input type="text" name="age"></h2>
                            </label>
                        </form>
                    </body>
                </html>""");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        if (Integer.parseInt(req.getParameter("age")) >= 18)
            writer.println("""
                <html>
                    <body>
                        <h2>Congratulations! You are of age!</h2>
                    </body>
                </html>""");
        else writer.println("""
                <html>
                    <body>
                        <h2>Oops, You are underage ...</h2>
                    </body>
                </html>""");
    }
}
