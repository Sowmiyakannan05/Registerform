
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String username=request.getParameter("username");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String confirm=request.getParameter("confirm");
        try (PrintWriter out = response.getWriter()) {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
            PreparedStatement ps=con.prepareStatement("insert into project values(?,?,?,?)");
            ps.setString(1, username);
            ps.setString(2,email);
            ps.setString(3,password);
            ps.setString(4, confirm);   
            
            if(ps.executeUpdate()>0)
            {
                out.println("You are succefully registered");
            }
        }
        catch(Exception se)
        {
            se.printStackTrace();
        }
    }
}
