/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Entity.DomainFacade;
import Entity.Accounts;
import Entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
            HttpSession session = request.getSession(true);
            DomainFacade df = new DomainFacade();
            boolean accountfound = false;
            boolean passwordmatch = false;
            int i;
            
            
            Accounts acc = new Accounts();
            ArrayList<Customer> customers = new ArrayList<>();
            df.readCustomers(acc);
            customers = acc.getCustomers();
            
            Customer currentcustomer = new Customer();
            
            
            
        try (PrintWriter out = response.getWriter()) {
            String origin = request.getParameter("origin");
            switch(origin){
                case "login":
                    String username = request.getParameter("username");
                    String pass = request.getParameter("pass");
                    
                    
                    for( i = 0 ; i< customers.size(); i++)
                        if(customers.get(i).getUsername().equals(username))
                        {
                            accountfound = true;
                            if(customers.get(i).getPassword().equals(pass))
                            {
                                currentcustomer = new Customer(
                                        customers.get(i).getCid(),
                                        customers.get(i).getUsername(),
                                        customers.get(i).getPassword(),
                                        customers.get(i).getFirstname(),
                                        customers.get(i).getLastname(),
                                        customers.get(i).getMail(),
                                        customers.get(i).getTel(),
                                        customers.get(i).getCity(),
                                        customers.get(i).getAddress(),
                                        customers.get(i).getZip());
                                request.getSession().setAttribute("currentcustomer",currentcustomer);
                                passwordmatch=true;
                                response.sendRedirect("loggedin.jsp");
                                return;
                            }
                        }
                    
                    
                    if(!passwordmatch)
                        request.getSession().setAttribute("message", "You entered the wrong password. Please try again.");
                    if(!accountfound)
                        request.getSession().setAttribute("message", "Account not found.");
                    response.sendRedirect("feedback.jsp");
                    return;
                case "customer":
                    String usrn = request.getParameter("usrn");
                    String pwd = request.getParameter("pwd");
                    String fn = request.getParameter("fn");
                    String ln = request.getParameter("ln");
                    String email = request.getParameter("email");
                    String tel = request.getParameter("tel");
                    String city = request.getParameter("city");
                    String caddress = request.getParameter("caddress");
                    String zip = request.getParameter("zip");
                    
                    
                    
                    for( i = 0 ; i< customers.size(); i++)
                        if(customers.get(i).getUsername().equals(usrn))
                        {
                            response.sendRedirect("usernametaken.jsp");
                            return;
                        }
                    
                    
                    df.addCustomer(usrn, pwd, fn, ln, email, tel, city, caddress, zip);
                    
                    response.sendRedirect("mainpage.jsp");
                    return;
                case "report":
                    return;
                case "buildingpage":
                    response.sendRedirect("building.jsp");
                    return;
                case "customerpage":
                    response.sendRedirect("customer.jsp");
                    return;
                case "reportpage":
                    response.sendRedirect("reportpage.jsp");
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
