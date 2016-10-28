/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Database.TourDisplayDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nathie
 */
public class SelectedTour extends HttpServlet {

    

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String temp=request.getParameter("ToursSelect");
  
        List<String> tourss = new TourDisplayDB().getTours(temp);
        String tours=tourss.get(0);
        request.setAttribute("tours", tours);

        List<String> tours_dates = new TourDisplayDB().getTourDate(temp);
        String tours_date=tours_dates.get(0);
        request.setAttribute("tours_date", tours_date);

        List<String> hotel_names = new TourDisplayDB().getHotelName(temp);
        String hotel_name=hotel_names.get(0);
        request.setAttribute("hotel_name", hotel_name);
        
        List<String> hotel_nums = new TourDisplayDB().getHotelNum(temp);
        String hotel_num=hotel_nums.get(0);
        request.setAttribute("hotel_num", hotel_num);
       // List<String> client_name = new TourDisplayDB().getClientName(temp);
       // request.setAttribute("client_name", client_name);

       // List<String> driver_ID = new TourDisplayDB().getDriverID(temp);
       // request.setAttribute("driver_ID", driver_ID);

      //  List<String> driver_name = new TourDisplayDB().getDriverName(temp);
      //  request.setAttribute("driver_name", driver_name);

       // List<String> clientEmail = new TourDisplayDB().getEmail(temp);
       // request.setAttribute("clientEmail", clientEmail);

        List<String> passengers = new TourDisplayDB().getPassenger(temp);
        String pas_no=passengers.get(0);
        request.setAttribute("numPas ", pas_no);

        RequestDispatcher view = request.getRequestDispatcher("hotelConfirmation.jsp");
        view.forward(request, response);
       
    }

}
