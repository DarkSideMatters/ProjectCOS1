/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Entity.DomainFacade;
import Entity.Accounts;
import Entity.Admin;
import Entity.Building;
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
            String FieldError;
            
            
            Accounts acc = new Accounts();
            ArrayList<Customer> customers = new ArrayList<>();
            ArrayList<Building> buildings = new ArrayList<>();
            ArrayList<Admin> admins = new ArrayList<>();
            acc.reinitCustomers();
            acc.reinitAdmins();
            df.readCustomers(acc);
            df.readAdmins(acc);
            request.getSession().setAttribute("accounts", acc);
            customers = acc.getCustomers();
            buildings = new ArrayList<>();
            admins = acc.getAdmins();
            
            Customer currentcustomer = new Customer();
            Admin currentadmin = new Admin();
            
            
            
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
                case "adminlogin":
                    String ausername = request.getParameter("username");
                    String apass = request.getParameter("pass");
                    System.out.println(ausername);
                    System.out.println(apass);
                    
                    for( i = 0 ; i< admins.size(); i++)
                        if(admins.get(i).getUsername().equals(ausername))
                        {
                            accountfound = true;
                            if(admins.get(i).getPassword().equals(apass))
                            {
                                currentadmin = new Admin(
                                        admins.get(i).getAid(),
                                        admins.get(i).getUsername(),
                                        admins.get(i).getPassword(),
                                        admins.get(i).getFirstname(),
                                        admins.get(i).getLastname(),
                                        admins.get(i).getMail(),
                                        admins.get(i).getTel());
                                        
                                request.getSession().setAttribute("currentadmin",currentadmin);
                                passwordmatch=true;
                                response.sendRedirect("adminpage.jsp");
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
                    String cusrn = request.getParameter("usrn");
                    String cpwd = request.getParameter("pwd");
                    String fn = request.getParameter("fn");
                    String ln = request.getParameter("ln");
                    String cemail = request.getParameter("email");
                    String tel = request.getParameter("tel");
                    String ccity = request.getParameter("city");
                    String caddress = request.getParameter("caddress");
                    String czip = request.getParameter("zip");
                    
                    FieldError = df.checkCFields(cusrn,cpwd,fn,ln,cemail,tel,ccity,caddress,czip);
                    System.out.println(FieldError);
                    if(FieldError!=null){
                        request.getSession().setAttribute("message", FieldError);
                        response.sendRedirect("feedback.jsp");
                        return;
                    }
                    
                    for( i = 0 ; i< customers.size(); i++)
                        if(customers.get(i).getUsername().equals(cusrn))
                        {
                            request.getSession().setAttribute("message", "Username Taken.");
                            response.sendRedirect("feedback.jsp");
                            return;
                        }
                    
                    
                    df.addCustomer(cusrn, cpwd, fn, ln, cemail, tel, ccity, caddress, czip);
                    
                    response.sendRedirect("login.jsp");
                    return;
                case "adminreg":
                    response.sendRedirect("adminreg.jsp");
                    return;
                case "admin":
                    String ausrn = request.getParameter("usrn");
                    String apwd = request.getParameter("pwd");
                    String afn = request.getParameter("fn");
                    String aln = request.getParameter("ln");
                    String aemail = request.getParameter("email");
                    String atel = request.getParameter("tel");
                    
                    FieldError = df.checkAFields(ausrn,apwd,afn,aln,aemail,atel);
                    System.out.println(FieldError);
                    if(FieldError!=null){
                        request.getSession().setAttribute("message", FieldError);
                        response.sendRedirect("feedback.jsp");
                        return;
                    }
                    
                    for( i = 0 ; i< admins.size(); i++)
                        if(admins.get(i).getUsername().equals(ausrn))
                        {
                            request.getSession().setAttribute("message", "Username Taken.");
                            response.sendRedirect("feedback.jsp");
                            return;
                        }
                    
                    
                    df.addAdmin(ausrn, apwd, afn, aln, aemail, atel);
                    
                    response.sendRedirect("adminlogin.jsp");
                    return;
                    
                case "building":
                    String bname = request.getParameter("name");
                    String bcity = request.getParameter("city");
                    String baddress = request.getParameter("address");
                    String bzip = request.getParameter("zip");
                    String year = request.getParameter("year");
                    String size = request.getParameter("size");
                    
                    
                    FieldError = df.checkBFields(bname,bcity,baddress,bzip,year,size);
                    System.out.println(FieldError);
                    if(FieldError!=null){
                        request.getSession().setAttribute("message", FieldError);
                        response.sendRedirect("feedback.jsp");
                        return;
                    }
                    
                    currentcustomer = (Customer)request.getSession().getAttribute("currentcustomer");
                    
                    df.addBuilding( currentcustomer.getCid(), bname, bcity, baddress, bzip, year, size);
                    
                    currentcustomer.reinitBuildings();
                    df.readBuildings(currentcustomer);
                    request.getSession().setAttribute("currentcustomer",currentcustomer);
                    
                    response.sendRedirect("buildinglist.jsp");
                    return;
                case "customerlist":
                    acc = (Accounts) request.getSession().getAttribute("accounts");
                    acc.reinitCustomers();
                    df.readCustomers(acc);
                    request.getSession().setAttribute("accounts",acc);
                    
                    response.sendRedirect("customerlist.jsp");
                    return;
                case "buildinglist":
                    
                    
                    currentcustomer = (Customer)request.getSession().getAttribute("currentcustomer");
                    currentcustomer.reinitBuildings();
                    df.readBuildings(currentcustomer);
                    request.getSession().setAttribute("currentcustomer",currentcustomer);
                    
                    response.sendRedirect("buildinglist.jsp");
                    return;
                case "buildingoption":
                    String bbtn = request.getParameter("btn");
                    int bid = Integer.parseInt(request.getParameter("buildingnr"));
                    request.getSession().setAttribute("bid", bid);
                    
                    
                    if(bbtn.equals("Delete")){
                        df.deleteBuilding(bid);
                        currentcustomer = (Customer)request.getSession().getAttribute("currentcustomer");
                        currentcustomer.reinitBuildings();
                        df.readBuildings(currentcustomer);
                        request.getSession().setAttribute("currentcustomer",currentcustomer);
                        response.sendRedirect("buildinglist.jsp");
                    }
                    if(bbtn.equals("Edit"))
                        response.sendRedirect("editbuilding.jsp");
                    if(bbtn.equals("View Report"))
                        //df.getReport();
                        response.sendRedirect("buildinglist.jsp");
                        
                    return;
                case "editbuilding":
                    String ebname = request.getParameter("name");
                    String ebcity = request.getParameter("city");
                    String ebaddress = request.getParameter("address");
                    String ebzip = request.getParameter("zip");
                    String eyear = request.getParameter("year");
                    String esize = request.getParameter("size");
                    
                    bid = (int)request.getSession().getAttribute("bid");
                    
                    
                    currentcustomer = (Customer)request.getSession().getAttribute("currentcustomer");
                    
                    System.out.println(bid + " " + ebname + " " + ebcity + " " + ebaddress + " " + ebzip + " " + eyear + " " + esize);
                    
                    df.editBuilding(bid, ebname, ebcity, ebaddress, ebzip, eyear, esize);
                    
                    currentcustomer.reinitBuildings();
                    df.readBuildings(currentcustomer);
                    request.getSession().setAttribute("currentcustomer",currentcustomer);
                    
                    response.sendRedirect("buildinglist.jsp");
                    return;
                case "customeroption":
                    String cbtn = request.getParameter("btn");
                    int cid = Integer.parseInt(request.getParameter("cmnr"));
                    request.getSession().setAttribute("cid", cid);
                    
                    
                    if(cbtn.equals("Delete")){
                        //df.deleteCustomer(cid);
                        currentcustomer = (Customer)request.getSession().getAttribute("currentcustomer");
                        currentcustomer.reinitBuildings();
                        df.readBuildings(currentcustomer);
                        request.getSession().setAttribute("currentcustomer",currentcustomer);
                        response.sendRedirect("customerlist.jsp");
                    }
                    if(cbtn.equals("Edit"))
                        response.sendRedirect("editcustomer.jsp");
                    if(cbtn.equals("View Report"))
                        //df.getReport();
                        response.sendRedirect("customer.jsp");
                        
                    return;
                case "report":
                    response.sendRedirect("loggedin.jsp");
                    return;
                case "buildingpage":
                    response.sendRedirect("building.jsp");
                    return;
                case "customerpage":
                    response.sendRedirect("customer.jsp");
                    return;
                case "adminregpage":
                    response.sendRedirect("adminreg.jsp");
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
