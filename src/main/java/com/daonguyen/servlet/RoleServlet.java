package com.daonguyen.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "roleServlet", urlPatterns = {"/role", "/role/add"})
public class RoleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String action = req.getServletPath();

        switch (action) {
            case "/role":
                req.getRequestDispatcher("/WEB-INF/view/role/index.jsp").forward(req, resp);
                break;
            case "/role/add":
                req.getRequestDispatcher("/WEB-INF/view/role/add.jsp").forward(req, resp);
                break;
            default:
                break;
        }
    }
}
