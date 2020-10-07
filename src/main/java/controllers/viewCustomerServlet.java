package controllers;

import models.customerDao;
import models.customers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class viewCustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        switch (action){
            case "customer":
                customer(request,response);
                break;
        }
    }

    private void customer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int id = Integer.parseInt(request.getParameter("id"));
        customers customer = new customerDao().getcustomer(id);
        request.setAttribute("customer",customer);
        request.getRequestDispatcher("singlecustomer.jsp").forward(request,response);
    }
}
