package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})
public class SimpleHelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        PrintWriter out = resp.getWriter(); out.print("Simple hello!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String hour = req.getParameter("hour");
        int stringHour = Integer.parseInt((hour));
        if (stringHour<0 || stringHour>24) {
            req.setAttribute("messages", "l'heure n'est pas bonne");
        }else if (stringHour>=0 && stringHour<12) {
            req.setAttribute("messages", "Bonjour "+ surname + " "+name);
        }else if (stringHour>=12 && stringHour<24) {
            req.setAttribute("messages", "Bonsoir "+ surname + " "+name);
        }

        req.getRequestDispatcher("/WEB-INF/custom-hello.jsp").forward(req, resp);
    }
}
