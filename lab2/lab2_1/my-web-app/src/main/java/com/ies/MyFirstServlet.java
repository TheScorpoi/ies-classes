package com.ies;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "MyFirstServlet", urlPatterns = { "/MyFirstServlet" })
public class MyFirstServlet extends HttpServlet {

    private static final long serialVersionUID = -1915463532411657451L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Map<String, String> data = getData();

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (data.get("username") == null) {
            throw new NullPointerException("There isn't a usernane!");
        } else {
            try {
                // Write some content
                out.println("<html>");
                out.println("<head>");
                out.println("<title>CalendarServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h2>Hello " + data.get("username") + ", " + data.get("message") + "</h2>");
                out.println("<h2>The time right now is : " + new Date() + "</h2>");
                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }
        }
    }

    // This method will access some external system as database to get user name,
    // and his personalized message
    private Map<String, String> getData() {
        Map<String, String> data = new HashMap<String, String>();
        data.put("username", "Paulo");
        data.put("message", "Welcome to my first web app using the Apache Tomcat!!");
        return data;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Do some other work
    }
}