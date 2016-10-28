/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Database.customerConfirmDB;
import Database.TourDisplayDB;
import java.io.IOException;
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
public class customerConfirm extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            /* TODO output your page here. You may use following sample code. */
            
            String tour_id=request.getParameter("tour_ID");
            
            String rooms=request.getParameter("roomNo");
            int RoomN=Integer.parseInt(rooms);
          
            List<String> hot=new TourDisplayDB().getHotelName(tour_id);
            String hotNam=hot.get(0);
            
            String para="\""+hotNam+"\"";
            
            List<String> book2=new TourDisplayDB().getBookings(para);
            String booking=book2.get(0);
            
            int bookings=Integer.parseInt(booking);
            
                        
            int book=RoomN+bookings;           
            customerConfirmDB temp=new customerConfirmDB();
            temp.update(tour_id,book);
            
            List<String> trip_ID = new TourDisplayDB().getTripID(tour_id);
            String pack_no=trip_ID.get(0);
           
            List<String> packP = new TourDisplayDB().getTripPrice(tour_id);
            String pack_price=packP.get(0);
            int p_price=Integer.parseInt(pack_price);
            
            List<String> cli_name = new TourDisplayDB().getClientName(tour_id);
            String client_name=cli_name.get(0);
            
            List<String> cli_e = new TourDisplayDB().getClientEmail(tour_id);
            String cli_email=cli_e.get(0);
            
            List<String> pass = new TourDisplayDB().getPassenger(tour_id);
            String pas_no=pass.get(0);
            int passengers=Integer.parseInt(pas_no);
            
            int bill=p_price*passengers;
            
            request.setAttribute("bill", bill);
            request.setAttribute("pas_no", pas_no);
            request.setAttribute("client_name", client_name);
            request.setAttribute("pack_price", pack_price);
            request.setAttribute("pack_no", pack_no);
            request.setAttribute("tour_date", request.getParameter("date"));
            request.setAttribute("tour_ID", tour_id);
            request.setAttribute("cli_email", cli_email);
            
            RequestDispatcher view = request.getRequestDispatcher("customerConfirmation.jsp");
            view.forward(request, response);
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
