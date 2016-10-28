<%-- 
    Document   : index
    Created on : Apr 9, 2015, 7:42:32 AM
    Author     : Nathie
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
        <title>Login Page</title>
    </head>
    <body>

        <h1>Tour Management System</h1>
        <table border="0">
            <thead>
                <tr>
                    <th><p>System Login</p></th>
    </tr>
</thead>
<tbody>
    <tr>
        <td> <form method="POST" action="LoginController">
                <input type="submit"  value="Customer Management" name="submit1" style="height:45px; width:200px" />
                <p></p>
                <p></p>
            </form>
            <form method="POST" action="LoginController">
                <input type="submit"  value="Driver and Coach Reservation" name="submit2" style="height:45px; width:200px" />
                <p></p>
                <p></p>
            </form>
            <form  method="POST" action="Tourdisplay">
                <input type="submit"  value="Hotel Booking and Reservation" name="submit3" style="height:45px; width:200px"  />
           
 </form>
        <img src="images/dream-tours3-450x327.png" width="500" height="400" alt="dream-tours3-450x327"/>    
            


        </td>
    </tr>
</tbody>
</table>



</body>
</html>
