/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Nathie
 */
public class BillDB {
  
    public void setBill(String billRef,String billDate,String hotel_name,String email,int no_of_Dates,int noOfpersons,int amount){
        
      
        
         String sql = "INSERT INTO HotelBill(billRef, billDate, hotel_name, email, no_of_DatesUsed, noOfpersons, amount) VALUES(?,?,?,?,?,?,?)";     
    
     try {
            Connection con = DBConnection.getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
          
                // no_Of_dates=Integer.toString(no_of_Dates);
               // String noOfPersons=Integer.toString(noOfpersons);
                ps.setString(1,billRef);
		ps.setString(2,billDate);
		ps.setString(3,hotel_name);
                ps.setString(4, email);
		ps.setInt(5, no_of_Dates);
		ps.setInt(6, noOfpersons);
                ps.setInt(7, amount);
		
                int i= ps.executeUpdate(); 
                ps.close();
                con.close();
                
            ps.executeUpdate();
		}
		catch(Exception e){
                }   
    }
}
    
    
    
    

