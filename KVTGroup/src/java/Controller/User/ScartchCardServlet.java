/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.User;

import Models.DAO.ScratchCardDAO;
import Models.Entities.User;
import Models.utilize.MailModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * handle get card number and send via mail
 * @author KhangNVCE140224
 */
@WebServlet(name = "ScartchCardServlet", urlPatterns = {"/ScartchCardServlet"})
public class ScartchCardServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ScartchCardServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ScartchCardServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
            throws ServletException, IOException {
        int charge = Integer.parseInt(request.getParameter("charge")); //get parameter charge 
        ScratchCardDAO scratchCardDAO = new ScratchCardDAO();

        int count;
        switch (charge) { //the value of cards is 50000,100000, 200000, 500000
            case 50000: 
            case 100000: 
            case 200000:
            case 500000:
                count = scratchCardDAO.getSumCardNumber(charge); //get number of card each card value

                if (count > 0) { //if card available right now 
                    request.setAttribute("message", "Please check your Email to get the code");
                    request.setAttribute("showGoToCharge", true);
                    String cartNumber = scratchCardDAO.getCard(charge); //get card is not used
                    scratchCardDAO.setCardTaken(cartNumber); 
                    //-------------- Send mail ------------------
                    String message = "Thanks for Charging from KVT Shop ^_^ <br/>"
                            + "your cardNumber is : " + cartNumber + "<br/> with value of : " + charge + "VND"
                            + "<br/> to charge your cart <a href='http://localhost:8080/KVTGroup/ConfirmScratchCard.jsp'> click here </a>";
                    User user = (User) request.getSession().getAttribute("LoginUser");
                    new MailModel(user.getuEmail(), "Successfull Payment", message).sendMail();
                    //redirect to success
                    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Success.jsp");
                    dispatcher.forward(request, response);
                    break;
                }
            default: //if value of card is not 50000,100000, 200000, 500000 then show message and redirect to failed
                request.setAttribute("message", "Sorry this Scratch Card is not available right now, Please try again later");
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Failed.jsp");
                dispatcher.forward(request, response);
        }

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
