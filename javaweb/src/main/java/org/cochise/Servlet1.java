package org.cochise;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if("forward".equals(req.getParameter("action"))){
            // 转发到servlet2
            req.getRequestDispatcher("/servlet2").forward(req, resp);
        }
        if("redirect".equals(req.getParameter("action"))){
            // 重定向到servlet3
            resp.sendRedirect(req.getContextPath()+"/servlet3");
        }
        if("jsAjaxRequest".equals(req.getParameter("action"))){
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write("已接收到Ajax请求");
        }




    }



}
