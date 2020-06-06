
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class login extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
         try{
             PrintWriter out = response.getWriter();
         
            String email=request.getParameter("email");
            String password=request.getParameter("password");
             
            if(accountcheck.validate(email,password)){
               
               out.println("Welcome to My Page");     
            }
            else
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Invalid username or password');");
                out.println("</script>");
                RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                rd.include(request,response);
            }
             out.close();
         }
         catch(Exception e)
         {
             System.out.println(e);
         }
    }
}
