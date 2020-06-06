<%-- 
    Document   : index
    Created on : May 26, 2020, 6:32:41 PM
    Author     : SOWMIYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register page</title>
          <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet"> 

    </head>
    <body>
        <form method="POST" action="register">
             <center>
        <h1><u>SIGN UP</u></h1>
        <br>
        <table>
            <tr>
                <td>Username</td>
                <td><input type="text" name="username"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>Confirm password</td>
                <td><input type="password" name="confirm"></td>
            </tr>
        </table>
        <br>
        <div>
            <button type="submit" name="signup" class="btn btn-success" >SIGN UP</button> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button type="reset" name="reset" class="btn btn-success">RESET</button>
        </div><br>
        <div>
            <p><a href="login.jsp">Already have an account?</a></p>
        </div>
       
    </center>
        </form>
        
    </body>
</html>
