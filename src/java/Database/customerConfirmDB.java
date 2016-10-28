/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Nathie
 */
public class customerConfirmDB {
    
    public void update(String tour_ID,int book)
    {
    
     String sql="UPDATE Trip SET bookingConformed=1 WHERE tour_ID="+tour_ID;
     String sql2="UPDATE hotel,trip,tour SET bookings="+ book +" WHERE tour.trip_ID=trip.tour_ID and hotel.town_ID=tour.overnight_stop and trip.tour_ID="+tour_ID;
    
     try {
            Connection con = DBConnection.getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
            PreparedStatement ps2 = (PreparedStatement) con.prepareStatement(sql2);
            
            ps2.executeUpdate();
            ps.executeUpdate();
		}
		catch(Exception e){
                }   
     
    }
    
    
}
