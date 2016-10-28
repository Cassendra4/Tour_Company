/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Database.BillDB;
import Database.TourDisplayDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;
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
public class Bill extends HttpServlet {

     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String billRef=request.getParameter("tour_ID");
        String billDate="2015.4.13";
        
        List<String> hot_name = new TourDisplayDB().getHotelName(billRef);
        String hotel_name=hot_name.get(0);
        
        String hote_name="\""+hotel_name+"\"";
        
        List<String> hot_email = new TourDisplayDB().getHotelEmail(hote_name);
        String email=hot_email.get(0);
       
         int noOfpersons=Integer.getInteger((String) request.getAttribute("pas_no"));
         int no_of_Dates=1;
         int amount=Integer.getInteger((String) request.getAttribute("bill"));
       
         BillDB b=new BillDB();
        // b.setBill(billRef, billDate, hotel_name, email, no_of_Dates, noOfpersons, amount);
     
            RequestDispatcher view = request.getRequestDispatcher("final.jsp");
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
