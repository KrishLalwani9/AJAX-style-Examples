package com.krish.lalwani.hr.servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ServletThree extends HttpServlet
{
public void doPost(HttpServletRequest request,HttpServletResponse response)
{
try
{
PrintWriter pw=response.getWriter();
response.setContentType("text/plain");
String firstName=request.getParameter("firstName");
String lastName=request.getParameter("lastName");
int age=Integer.parseInt(request.getParameter("age"));
pw.print(firstName+","+lastName+","+age);
}catch(Exception exception)
{
try
{				       
response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
}catch(IOException ioException) // checked Exception ServletException
{
//do Nothing
}
}
}
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
}catch(IOException ioException)
{
//do Nothing
}
}
}