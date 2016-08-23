package servlets;

import crud.CustomerCrud;
import entities.CustomersEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by hovercat on 22.08.16.
 */
public class RegistrationServlet extends HttpServlet {

    private CustomersEntity customer = new CustomersEntity();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("registration.jsp").forward(req, resp);

        CustomersEntity customer = new CustomersEntity();

        customer.setCompany(req.getParameter("company"));
        customer.setCreditLimit(BigDecimal.valueOf(Long.parseLong(req.getParameter("creditLimit"))));
        customer.setCustRep(Integer.valueOf(req.getParameter("custRep")));

        CustomerCrud.addCustomer(customer);

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}