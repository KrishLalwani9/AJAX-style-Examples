package com.krish.lalwani.hr.servlets;
import com.krish.lalwani.hr.dl.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ServletTwo extends HttpServlet
{
public void doGet(HttpServletRequest request,HttpServletResponse response)
{
try
{
PrintWriter pw=response.getWriter();
response.setContentType("text/plain");
int code=Integer.parseInt(request.getParameter("code"));
try
{
DesignationDTO designation=new DesignationDAO().getByCode(code);
pw.print(designation.getCode()+","+designation.getTitle());
}catch(DAOException daoException)
{
pw.print("Invalid");
}
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
public void doPost(HttpServletRequest request,HttpServletResponse response)
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