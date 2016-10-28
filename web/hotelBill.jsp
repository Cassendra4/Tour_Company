<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : hotelConfirmation
    Created on : Apr 11, 2015, 4:48:07 PM
    Author     : Nathie
--%>


<c:set var="tourDetails" value="${tours}"/>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title> Hotel Bill: ${tour_ID}</title>
    </head>
    <body>
        <h1>Hotel Bill: ${tour_ID}</h1>
        
 
<form method="post" action="finalServlet">
   <table cellpadding="2" cellspacing="0" border="1" width="500">
     
      <tr>
         <td width="250">Bill Reference Number:</td>
         <td colspan="3"><input class="left" type="text" name="bill_ref" value=${bill_ref} style="width: 150px;"></td>
      </tr>      
      <tr>
          <td>Bill Date:</td>
         <td colspan="3"><input class="left" type="text" name="bill_date" value=${bill_date} style="width: 150px;"></td>
      </tr>
      <tr>
          <td>Hotel Name:</td>
         <td colspan="3"><input class="left" type="text" name="hotel_name" value=${hotel_name} style="width: 150px;"></td>
      </tr>
  
        <tr>
          <td>Email:</td>
         <td colspan="3"><input class="left" type="text" name="email" value=${email} style="width: 150px;"></td>
      </tr>
       <tr>
          <td>No of individuals:</td>
          <td colspan="3"><input class="left" type="text" name="pas_no" value=${pas_no}  style="width: 150px;"></td>
      </tr>
      <tr>
          <td>No of Days:</td>
          <td colspan="3"><input class="left" type="text" name="days" value=${days}  style="width: 150px;"></td>
      </tr>
     
      
         <tr>
          <td>Bill Amount:</td>
          <td colspan="3"><input class="left" type="text" name="bill" value=${bill}  style="width: 150px;"></td>
      </tr>

        
     
  
      <tr>
          <td colspan="4" align="center"><input type="submit" value="Create Bill" style="margin-left: 20px; width: 250px "></td>
    
        </td>
      </tr>
  
   </table>
</form>
</body>
</html>
