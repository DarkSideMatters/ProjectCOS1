/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Entity.*;
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
    
    boolean adminloggedin = false;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession(true);
            DomainFacade df = new DomainFacade();
            boolean accountfound = false;
            boolean passwordmatch = false;
            int i,bid;
            String FieldError;
            
            
            Accounts acc = new Accounts();
            ArrayList<Customer> customers = new ArrayList<>();
            ArrayList<Admin> admins = new ArrayList<>();
            ArrayList<Building> buildings = new ArrayList<>();
            ArrayList<Floor> floors = new ArrayList<>();
            ArrayList<Room> rooms = new ArrayList<>();
            ArrayList<BReport> breports = new ArrayList<>();
            acc.reinitCustomers();
            acc.reinitAdmins();
            df.readCustomers(acc);
            df.readAdmins(acc);
            request.getSession().setAttribute("accounts", acc);
            customers = acc.getCustomers();
            admins = acc.getAdmins();
            
            Customer currentcustomer = new Customer();
            Admin currentadmin = new Admin();
            Building currentbuilding = new Building();
            Floor currentfloor = new Floor();
            Room currentroom = new Room();
            BReport currentbreport = new BReport();
            
            System.out.println("NEW RUN");
            
            
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
                                response.sendRedirect("loggedin.jsp");
                                return;
                            }
                        }
                    
                    
                    if(!passwordmatch)
                        request.getSession().setAttribute("message", "You entered the wrong password. Please try again.");
                    if(!accountfound)
                        request.getSession().setAttribute("message", "Account not found.");
                    accountfound = false;
                    response.sendRedirect("feedback.jsp");
                    return;
                case "adminlogin":
                    String ausername = request.getParameter("username");
                    String apass = request.getParameter("pass");
                    
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
                                adminloggedin = true;
                                response.sendRedirect("adminpage.jsp");
                                return;
                            }
                        }
                    
                    
                    if(!passwordmatch)
                        request.getSession().setAttribute("message", "You entered the wrong password. Please try again.");
                    if(!accountfound)
                        request.getSession().setAttribute("message", "Account not found.");
                    
                    accountfound = false;
                    
                    response.sendRedirect("feedback.jsp");
                    return;
                case "editadmin":
                    String aeusrn = request.getParameter("usrn");
                    String aepwd = request.getParameter("pwd");
                    String aefn = request.getParameter("fn");
                    String aeln = request.getParameter("ln");
                    String aemail = request.getParameter("email");
                    String aetel = request.getParameter("tel");
                    
                    
                    for( i = 0 ; i< admins.size(); i++)
                        if(admins.get(i).getUsername().equals(aeusrn))
                        {
                            request.getSession().setAttribute("message", "Username Taken.");
                            response.sendRedirect("feedback.jsp");
                            return;
                        }
                    
                    currentadmin = (Admin)request.getSession().getAttribute("currentadmin");
                    
                    df.editAdmin(currentadmin.getAid(), aeusrn, aepwd, aefn, aeln, aemail, aetel);
                    
                    response.sendRedirect("adminpage.jsp");
                    return;
                case "editpadmin":
                    response.sendRedirect("adminedit.jsp");
                    return;
                case "editcustomer":
                    String ecusrn = request.getParameter("usrn");
                    String ecpwd = request.getParameter("pwd");
                    String efn = request.getParameter("fn");
                    String eln = request.getParameter("ln");
                    String ecemail = request.getParameter("email");
                    String etel = request.getParameter("tel");
                    String eccity = request.getParameter("city");
                    String ecaddress = request.getParameter("caddress");
                    String eczip = request.getParameter("zip");
                    
                    currentcustomer = (Customer)request.getSession().getAttribute("currentcustomer");
                    
                    for( i = 0 ; i< customers.size(); i++)
                        if(customers.get(i).getUsername().equals(ecusrn))
                        {
                            request.getSession().setAttribute("message", "Username Taken.");
                            response.sendRedirect("feedback.jsp");
                            return;
                        }
                    
                    df.editCustomer(currentcustomer.getCid(), ecusrn, ecpwd, efn, eln, ecemail, etel, eccity, ecaddress, eczip);
                    
                    if(adminloggedin){
                        acc.reinitCustomers();
                        df.readCustomers(acc);
                        response.sendRedirect("customerlist.jsp");
                    }
                    else
                        response.sendRedirect("loggedin.jsp");
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
                    
                    
                    df.editBuilding(bid, ebname, ebcity, ebaddress, ebzip, eyear, esize);
                    
                    currentcustomer.reinitBuildings();
                    df.readBuildings(currentcustomer);
                    request.getSession().setAttribute("currentcustomer",currentcustomer);
                    
                    response.sendRedirect("buildinglist.jsp");
                    return;
                case "editbreport":
                    currentadmin = (Admin)request.getSession().getAttribute("currentadmin");
                    String ebrdate = request.getParameter("date");
                    String ebruc = request.getParameter("usagecomment");
                    String ebrrc = request.getParameter("roofcomment");
                    String ebrewc = request.getParameter("extwallscomment");
                    String ebrpe = currentadmin.getFirstname() + " " + currentadmin.getLastname();
                    String ebrconmng = request.getParameter("conmanager");
                    String ebrgrade = request.getParameter("grade");
                    
                    
                    df.editBReport((int)request.getSession().getAttribute("brepid"),ebrdate,ebruc,ebrrc,ebrewc,ebrpe,ebrconmng,ebrgrade);
                    
                    currentbuilding.reinitReports();
                    df.readBReports(currentbuilding);
                    request.getSession().setAttribute("currentbuilding", currentbuilding);
                    
                    if(adminloggedin)
                        response.sendRedirect("abreportlist.jsp");
                    else
                        response.sendRedirect("breportlist.jsp");
                    return;
                case "editfloor":
                    String efname = request.getParameter("fname");
                    
                        
                    
                    df.editFloor((int)request.getSession().getAttribute("fid"), efname);
                    
                    currentbuilding = (Building)request.getSession().getAttribute("currentbuilding");
                    currentbuilding.reinitFloors();
                    df.readFloors(currentbuilding);
                    request.getSession().setAttribute("currentbuilding", currentbuilding);
                    
                    response.sendRedirect("floorslist.jsp");
                    return;
                case "addcustomer":
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
                    
                    if(adminloggedin)
                        response.sendRedirect("customerlist.jsp");
                    else
                        response.sendRedirect("login.jsp");
                    return;
                case "adminreg":
                    response.sendRedirect("adminreg.jsp");
                    return;
                case "addadmin":
                    String ausrn = request.getParameter("usrn");
                    String apwd = request.getParameter("pwd");
                    String afn = request.getParameter("fn");
                    String aln = request.getParameter("ln");
                    String amail = request.getParameter("email");
                    String atel = request.getParameter("tel");
                    
                    FieldError = df.checkAFields(ausrn,apwd,afn,aln,amail,atel);
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
                    
                    
                    df.addAdmin(ausrn, apwd, afn, aln, amail, atel);
                    
                    response.sendRedirect("adminlogin.jsp");
                    return;
                    
                case "addbuilding":
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
                    if(adminloggedin)
                        response.sendRedirect("abuildinglist.jsp");
                    else
                        response.sendRedirect("buildinglist.jsp");
                    return;
                case "addbreport":
                    currentadmin = (Admin)request.getSession().getAttribute("currentadmin");
                    String brdate = request.getParameter("date");
                    String bruc = request.getParameter("usagecomment");
                    String brrc = request.getParameter("roofcomment");
                    String brewc = request.getParameter("extwallscomment");
                    String brpe = currentadmin.getFirstname() + " " + currentadmin.getLastname();
                    String brconmng = request.getParameter("conmanager");
                    String brgrade = request.getParameter("grade");
                    
                    System.out.println(brpe);
                    
                    FieldError = df.checkBRFields(brdate,bruc,brrc,brewc,brconmng,brgrade);
                    System.out.println(FieldError);
                    if(FieldError!=null){
                        request.getSession().setAttribute("message", FieldError);
                        response.sendRedirect("feedback.jsp");
                        return;
                    }
                    
                    df.addBReport((int)request.getSession().getAttribute("bid"),brdate,bruc,brrc,brewc,brpe,brconmng,brgrade);
                    
                    currentbuilding = (Building)request.getSession().getAttribute("currentbuilding");
                    currentbuilding.reinitReports();
                    df.readBReports(currentbuilding);
                    request.getSession().setAttribute("currentbuilding", currentbuilding);
                    
                    if(adminloggedin)
                        response.sendRedirect("abuildinglist.jsp");
                    else
                        response.sendRedirect("buildinglist.jsp");
                    return;
                case "addfloor":
                    String fname = request.getParameter("fname");
                    
                    if(fname.equals("")){
                        request.getSession().setAttribute("message", "You did not complete the only field needed to create a floor. Go back and do that.");
                        response.sendRedirect("feedback.jsp");
                        return;
                    }
                        
                    
                    df.addFloor((int)request.getSession().getAttribute("bid"), fname);
                    
                    currentbuilding = (Building)request.getSession().getAttribute("currentbuilding");
                    currentbuilding.reinitFloors();
                    df.readFloors(currentbuilding);
                    request.getSession().setAttribute("currentbuilding", currentbuilding);
                    
                    response.sendRedirect("floorslist.jsp");
                    return;
                case "floorslist":
                    response.sendRedirect("floorlist.jsp");
                    return;
                case "flooroption":
                    String fbtn = request.getParameter("btn");
                    int fid = Integer.parseInt(request.getParameter("fid"));
                    request.getSession().setAttribute("fid", fid);
                    
                    currentbuilding = (Building)request.getSession().getAttribute("currentbuilding");
                    floors = currentbuilding.getFloors();
                    
                    for(i=0;i<floors.size();i++)
                        if(floors.get(i).getFid()==fid){
                            currentfloor=floors.get(i);
                            request.getSession().setAttribute("currentfloor", currentfloor);
                        }
                    
                    if(fbtn.equals("Edit"))
                        response.sendRedirect("editfloor.jsp");
                    if(fbtn.equals("Delete")){
                        request.getSession().setAttribute("disthing", "Floor");
                        request.getSession().setAttribute("message", "Are you sure you want to delete this " + "Floor" + "?");
                        response.sendRedirect("ays.jsp");
                    }
                    if(fbtn.equals("List Rooms"))
                        response.sendRedirect("roomslist.jsp");
                    return;
                case "breplist":
                    if(adminloggedin)
                        response.sendRedirect("abreportlist.jsp");
                    else
                        response.sendRedirect("breportlist.jsp");
                    return;
                case "breportoption":
                    String brepbtn = request.getParameter("btn");
                    int brepid = Integer.parseInt(request.getParameter("brnum"));
                    request.getSession().setAttribute("brepid",brepid);
                    
                    currentbuilding = (Building)request.getSession().getAttribute("currentbuilding");
                    breports = currentbuilding.getReports();
                    
                    for(i=0;i<breports.size();i++)
                        if(breports.get(i).getBrepid()==brepid){
                            currentbreport=breports.get(i);
                            request.getSession().setAttribute("currentbreport", currentbreport);
                        }
                    
                    if(brepbtn.equals("View"))
                        response.sendRedirect("breportview.jsp");
                    if(brepbtn.equals("Delete")){
                        request.getSession().setAttribute("disthing", "Building Report");
                        request.getSession().setAttribute("message", "Are you sure you want to delete this " + "Building Report" + "?");
                        response.sendRedirect("ays.jsp");
                    }
                    if(brepbtn.equals("Edit"))
                        response.sendRedirect("editbreport.jsp");
                    return;
                case "customerlist":
                    acc = (Accounts) request.getSession().getAttribute("accounts");
                    acc.reinitCustomers();
                    df.readCustomers(acc);
                    request.getSession().setAttribute("accounts",acc);
                    
                    response.sendRedirect("customerlist.jsp");
                    return;
                case "customeroption":
                    String cbtn = request.getParameter("btn");
                    int cid = Integer.parseInt(request.getParameter("cmnr"));
                    request.getSession().setAttribute("cid", cid);
                    
                    
                    for(i = 0; i < customers.size();i++)
                        if(customers.get(i).getCid()==cid){
                            currentcustomer = customers.get(i);
                            currentcustomer.reinitBuildings();
                            df.readBuildings(currentcustomer);
                            request.getSession().setAttribute("currentcustomer", currentcustomer);
                        }
                    
                    if(cbtn.equals("Delete")){
                        request.getSession().setAttribute("disthing", "Customer Account");
                        request.getSession().setAttribute("message", "Are you sure you want to delete this " + "Customer Account" + "?");
                        response.sendRedirect("ays.jsp");
                    }
                    if(cbtn.equals("Edit"))
                        response.sendRedirect("editcustomer.jsp");
                    if(cbtn.equals("List Buildings")){
                        response.sendRedirect("abuildinglist.jsp");
                    }
                        
                    return;
                case "buildinglist":
                    currentcustomer = (Customer)request.getSession().getAttribute("currentcustomer");
                    currentcustomer.reinitBuildings();
                    df.readBuildings(currentcustomer);
                    request.getSession().setAttribute("currentcustomer",currentcustomer);
                    
                    if(adminloggedin)
                        response.sendRedirect("abuildinglist.jsp");
                    else
                        response.sendRedirect("buildinglist.jsp");
                    return;
                case "buildingoption":
                    String btn = request.getParameter("btn");
                    bid = Integer.parseInt(request.getParameter("buildingnr"));
                    request.getSession().setAttribute("bid", bid);
                    
                    currentcustomer = (Customer)request.getSession().getAttribute("currentcustomer");
                    
                    buildings = currentcustomer.getBuildings();
                        
                    for(i=0;i<buildings.size();i++)
                        if(buildings.get(i).getBid()==bid){
                            currentbuilding = buildings.get(i);
                            currentbuilding.reinitReports();
                            currentbuilding.reinitFloors();
                            df.readFloors(currentbuilding);
                            df.readBReports(currentbuilding);
                            request.getSession().setAttribute("currentbuilding",currentbuilding);
                        }
                    
                    
                    if(btn.equals("Delete")){
                        request.getSession().setAttribute("disthing", "Building");
                        response.sendRedirect("ays.jsp");
                    }
                    if(btn.equals("Edit"))
                        response.sendRedirect("editbuilding.jsp");
                    if(btn.equals("List Floors"))
                            response.sendRedirect("floorslist.jsp");
                    if(btn.equals("List Reports"))
                        if(adminloggedin)
                            response.sendRedirect("abreportlist.jsp");
                        else
                            response.sendRedirect("breportlist.jsp");
                    if(btn.equals("Add Report")){
                        response.sendRedirect("breport.jsp");
                    }
                    return;
                case "buildingpage":
                    response.sendRedirect("building.jsp");
                    return;
                case "customerpage":
                    response.sendRedirect("customer.jsp");
                    return;
                case "editcustomerpage":
                    response.sendRedirect("editcustomer.jsp");
                    return;
                case "adminregpage":
                    response.sendRedirect("adminreg.jsp");
                    return;
                case "reportpage":
                    response.sendRedirect("reportpage.jsp");
                    return;
                case "adminpage":
                    response.sendRedirect("adminpage.jsp");
                    return;
                case "adminloginpage":
                    adminloggedin=false;
                    response.sendRedirect("adminlogin.jsp");
                    return;
                case "loggedinpage":
                    response.sendRedirect("loggedin.jsp");
                    return;
                case "loginpage":
                    response.sendRedirect("login.jsp");
                    return;
                case "customerlistpage":
                    response.sendRedirect("customerlist.jsp");
                    return;
                case "floorpage":
                    response.sendRedirect("createfloor.jsp");
                    return;
                case "ays":
                    String disthing = (String)request.getSession().getAttribute("disthing");
                    request.getSession().setAttribute("message", "Are you sure you want to delete this " + disthing + "?");
                    response.sendRedirect("ays.jsp");
                    return;
                case "imsure":
                    String thisthing = (String)request.getSession().getAttribute("disthing");
                    if(thisthing.equals("Administrator Account")){
                        df.deleteAdmin(currentadmin.getAid());
                        response.sendRedirect("adminlogin.jsp");
                    }
                    if(thisthing.equals("Customer Account")){
                        df.deleteCustomer(currentcustomer.getCid());
                        if(adminloggedin)
                            response.sendRedirect("adminpage.jsp");
                        else
                            response.sendRedirect("login.jsp");
                    }
                    if(thisthing.equals("Building")){
                        df.deleteBuilding(currentbuilding.getBid());
                        currentcustomer = (Customer)request.getSession().getAttribute("currentcustomer");
                        currentcustomer.reinitBuildings();
                        df.readBuildings(currentcustomer);
                        request.getSession().setAttribute("currentcustomer",currentcustomer);
                        if(adminloggedin)
                            response.sendRedirect("abuildinglist.jsp");
                        else
                            response.sendRedirect("buildinglist.jsp");
                    }
                    if(thisthing.equals("Building Report")){
                        df.deleteBReport((int)request.getSession().getAttribute("brepid"));
                        currentbuilding = (Building)request.getSession().getAttribute("currentbuilding");
                        currentbuilding.reinitReports();
                        df.readBReports(currentbuilding);
                        request.getSession().setAttribute("currentbuilding",currentbuilding);
                        if(adminloggedin)
                            response.sendRedirect("abreportlist.jsp");
                        else
                            response.sendRedirect("breportlist.jsp");
                    }
                    if(thisthing.equals("Floor")){
                        df.deleteFloor((int)request.getSession().getAttribute("fid"));
                        currentbuilding = (Building)request.getSession().getAttribute("currentbuilding");
                        currentbuilding.reinitFloors();
                        df.readFloors(currentbuilding);
                        request.getSession().setAttribute("currentbuilding", currentbuilding);
                        response.sendRedirect("floorslist.jsp");
                    }
//                    if(thisthing.equals("Room")
//                    if(thisthing.equals("Room Report")
                    return;     
                case "imnotsure":
                    thisthing = (String)request.getSession().getAttribute("disthing");
                    if(thisthing.equals("Administrator Account"))
                        response.sendRedirect("adminpage.jsp");
                    if(thisthing.equals("Customer Account"))
                        response.sendRedirect("loggedin.jsp");
                    if(thisthing.equals("Building"))
                        if(adminloggedin)
                            response.sendRedirect("abuildinglist.jsp");
                        else
                            response.sendRedirect("buildinglist.jsp");
                    if(thisthing.equals("Building Report"))
                        if(adminloggedin)
                            response.sendRedirect("abreportlist.jsp");
                        else
                            response.sendRedirect("breportlist.jsp");
                    if(thisthing.equals("Floor"))
                        response.sendRedirect("floorslist.jsp");
//                    if(thisthing.equals("Room"))
//                    if(thisthing.equals("Room Report"))
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
