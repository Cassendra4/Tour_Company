package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TourDisplayDB {

    public ResultSet getCon(String sql) {

        try {
            Connection con = DBConnection.getCon();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);

            ResultSet rs = (ResultSet) ps.executeQuery();

            return rs;

        } catch (Exception e) {
            return null;
        }

    }

    public List<String> getClientEmail(String para) {

        String sql = "SELECT email FROM trip,individual WHERE trip.tour_ID=" + para + " and trip.individual_ID=individual.individual_ID";

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("email");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getClientName(String para) {

        String sql = "SELECT name FROM trip,individual WHERE trip.tour_ID=" + para + " and trip.individual_ID=individual.individual_ID";

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("name");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getTripPrice(String para) {

        String sql = "SELECT price FROM trip,tour WHERE trip.tour_ID=" + para + " and trip.trip_ID=tour.trip_ID";

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("price");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getTripID(String para) {

        String sql = "SELECT trip_ID FROM trip WHERE trip.tour_ID=" + para;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("trip_ID");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getTours(String para) {

        String sql = "SELECT tour_ID FROM trip WHERE trip.tour_ID=" + para;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("tour_ID");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getTours1() {

        String sql = "SELECT tour_ID FROM trip WHERE trip.shedulingConformed=1 and trip.bookingConformed=0";

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("tour_ID");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getTourDate(String para) {

        String sql = "SELECT start_Date FROM trip WHERE trip.tour_ID=" + para;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("start_Date");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getTourDate1() {

        String sql = "SELECT start_Date FROM trip WHERE trip.shedulingConformed=1 and trip.bookingConformed=0";

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("start_Date");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getEmail(String para) {

        String sql = "SELECT contactEmail FROM trip WHERE trip.tour_ID+" + para;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("contactEmail");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getPassenger(String para) {

        String sql = "SELECT no_of_passengers FROM trip WHERE trip.tour_ID=" + para;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("no_of_passengers");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getHotelName(String para) {

        String sql = "select hotel_name from hotel,trip,tour where tour.trip_ID=trip.tour_ID and hotel.town_ID=tour.overnight_stop and trip.tour_ID=" + para;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("hotel_name");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getHotelNum(String para) {

        String sql = "select contact_no from hotel,trip,tour where tour.trip_ID=trip.tour_ID and hotel.town_ID=tour.overnight_stop and trip.tour_ID=" + para;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("contact_no");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getBookings(String para) {

        String sql = "SELECT bookings FROM hotel WHERE hotel_name=" + para;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("bookings");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getHotelEmail(String para) {

        String sql = "SELECT email FROM hotel WHERE hotel_name=" + para;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("email");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public List<String> getCapacity(String hotel_name) {
        String sql = "SELECT capacity FROM hotel WHERE hotel_name=" + hotel_name;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("capacity");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<String> getPrice(String para2) {
        String sql = "SELECT price FROM hotel WHERE hotel_name=" + para2;

        ResultSet rs = getCon(sql);
        ArrayList<String> list = new ArrayList<String>();

        try {
            while (rs.next()) {
                String str1 = rs.getString("price");
                list.add(str1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDisplayDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }
}
