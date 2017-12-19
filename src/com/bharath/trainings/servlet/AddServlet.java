package com.bharath.trainings.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends GenericServlet {

    private int number1 = 0;
    private int number2 = 0;

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        number1 = Integer.parseInt(servletRequest.getParameter("number1"));
        number2 = Integer.parseInt(servletRequest.getParameter("number2"));
        int result = number1+number2;

        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();


        out.println("<h2>Result is: " + result +"</h2>");

    }
}
