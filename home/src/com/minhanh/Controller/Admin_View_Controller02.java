package com.minhanh.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Admin_View_Controller02")
public class Admin_View_Controller02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Admin_View_Controller02() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//goi den trang chinh Admin2
				RequestDispatcher rd= getServletContext().getRequestDispatcher("/admin/indexadmin2.jsp");
				rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
