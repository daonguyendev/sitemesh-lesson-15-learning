package com.daonguyen.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "userServlet", urlPatterns = {"/user", "/user/add"})
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String action = req.getServletPath();

        switch (action) {
            case "/user":
                req.getRequestDispatcher("/WEB-INF/view/user/index.jsp").forward(req, resp);
                break;
            case "/user/add":
                req.getRequestDispatcher("/WEB-INF/view/user/add.jsp").forward(req, resp);
                break;
            default:
                break;
        }
    }
}
