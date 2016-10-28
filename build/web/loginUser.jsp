<%-- 
    Document   : loginUser
    Created on : Apr 22, 2015, 1:36:27 AM
    Author     : Cassendra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" type="text/css" href="style.css">
        <style>
            img {
                position: absolute;
                left: 200px;
                top: 100px;
                z-index: 1;
            }
        </style>
        <title>System Login Page</title>
    </head>
    <body>
         <thead>
                <tr>
                    <th><p>System Login</p></th>

         <form method="POST" action="LoginServlet">
    <label for="userName"> User Name: </label><input id="userName" name="userName" type="text" style="height:45px; width:200px"/><br/>
    <label for="pass"> Password:  </label><input id="pass" name="pass" type="text"style="height:45px; width:200px"/><br/>
    <input type="submit" value="Send"/>
</form>
          <img src="images/dream-tours3-450x327.png" width="500" height="400" alt="dream-tours3-450x327"/>  
    </body>
</html>
