package servlets;

import crud.CustomerCrud;
import entities.CustomersEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by hovercat on 15.08.16.
 */
public class CustomerServlet extends javax.servlet.http.HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CustomersEntity> userList;
        userList = CustomerCrud.getAllCust();
        req.setAttribute("users", userList);
        req.getRequestDispatcher("table.jsp").forward(req, resp);

    }
}
