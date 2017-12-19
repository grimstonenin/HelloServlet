package com.bharath.trainings.servlet;

import javax.activation.MimeType;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends GenericServlet{
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.setContentType("text/html");
        PrintWriter out = servletResponse.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>HELLO WORLD</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
