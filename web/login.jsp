<%-- 
    Document   : login
    Created on : May 26, 2020, 10:05:54 PM
    Author     : SOWMIYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login page</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet"> 

    </head>
    <body>
        <form action="login" method="post">
        <center>
        <h1><u>LOGIN</u></h1>
        <br>
        <table>
            <tr>
                <td>Email</td>
                <td><input type="text" name="email"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password"></td>
            </tr>
        </table>
        <br>
        <button type="submit" name="login">LOGIN</button>     
    </center>
            
        </form>
        
    </body>
</html>
