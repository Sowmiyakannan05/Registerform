
import java.sql.*;


public class accountcheck {
    public static boolean validate(String email,String password)throws Exception
    {
       boolean status=false;
       try
       {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
           PreparedStatement ps=con.prepareStatement("select * from project where email=? and password=?");
           ps.setString(1,email);
           ps.setString(2,password);
           ResultSet rs=ps.executeQuery();
           status=rs.next();                        
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
       return status;
    }
}
