package controllers;

import models.customerDao;
import models.customers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class customersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        switch (action)
        {
            case "ViewCustomers":
                viewcustomers(request,response);
        }
    }

    private void viewcustomers(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        List<customers> customer = new customerDao().listcustomers();
        request.setAttribute("customers",customer);
        request.getRequestDispatcher("viewcustomers.jsp").forward(request,response);

    }
}
