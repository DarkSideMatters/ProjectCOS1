/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Entity.DomainFacade;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Mircea
 */
@WebServlet(name = "Presentation", urlPatterns = {"/UIServlet"})
public class UIServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            DomainFacade df = new DomainFacade();
        try (PrintWriter out = response.getWriter()) {
            String origin = request.getParameter("origin");
            switch(origin){
                case "building":
                    String name = request.getParameter("name");
                    String address = request.getParameter("address");
                    int pno = Integer.parseInt(request.getParameter("parcelno"));
                    String size = request.getParameter("size");
                    String cname = request.getParameter("cname");
                    df.addBuilding(name, address, pno, size, cname);
                    response.sendRedirect("mainpage.jsp");
                    return;
                case "customer":
                    String cuname = request.getParameter("cuname");
                    String email = request.getParameter("email");
                    int telephone = Integer.parseInt(request.getParameter("telephone"));
                    String caddress = request.getParameter("caddress");
                    df.addCustomer(cuname,email,telephone,caddress);
                    response.sendRedirect("mainpage.jsp");
                    return;
                case "report":
                    int reportno = Integer.parseInt(request.getParameter("reportno"));
                    String rdate = request.getParameter("rdate");
                    String bname = request.getParameter("bname");
                    String rcomment = request.getParameter("rcomment");
                    df.addReport(reportno,rdate,bname,rcomment);
                    response.sendRedirect("mainpage.jsp");
                    return;
                case "buildingpage":
                    response.sendRedirect("building.jsp");
                    return;
                case "customerpage":
                    response.sendRedirect("building.jsp");
                    return;
                case "reportpage":
                    response.sendRedirect("building.jsp");
                    return;
            }
        }
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
            throws ServletException, IOException{
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
            throws ServletException, IOException{
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
