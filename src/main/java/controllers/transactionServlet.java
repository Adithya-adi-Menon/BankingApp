package controllers;

import models.customerDao;
import models.customers;
import org.hibernate.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class transactionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String action = request.getParameter("action");
        switch (action){

            case "transact":
                gettouserbal(request, response);
                break;
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void gettouserbal(HttpServletRequest request, HttpServletResponse response)throws IOException ,ServletException
    {
        int id = Integer.parseInt(request.getParameter("user"));
        customers customer = new customerDao().getcustomer(id);
        int bal = customer.getCurrentbal();
        int amount = Integer.parseInt(request.getParameter("amount"));
        int total = amount+bal;

        customers customer2 = new customerDao().updatecustomer(id,total);
        response.getWriter().println(customer2.getCurrentbal());
        getfromuserbal(response,request);
    }

    private void getfromuserbal(HttpServletResponse response, HttpServletRequest request)throws IOException ,ServletException
    {
        int curr_userid = Integer.parseInt(request.getParameter("curr_userid"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        response.getWriter().println(amount);
        response.getWriter().println(curr_userid);
        customers customer = new customerDao().getcustomer(curr_userid);
        int bal = customer.getCurrentbal();
        int total = bal-amount;

        customers customer2 = new customerDao().updatecustomer(curr_userid,total);
        response.getWriter().println(customer2.getCurrentbal());
//        request.getRequestDispatcher("transactsuccess.jsp").forward(request,response);
            response.sendRedirect("transactsuccess.jsp");
    }
}
