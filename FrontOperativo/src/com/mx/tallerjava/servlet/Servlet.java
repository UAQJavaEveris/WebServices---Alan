package com.mx.tallerjava.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 * Servlet implementation class Servlet
 */
@WebServlet(description = "ey", urlPatterns = { "/Servlet" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   // @WebServiceRef
	//private SaludosSerivece service SAludos;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doGet");
		String nombre = request.getParameter("nombre");
		System.out.println(nombre);
		/*
		 * Saludos port = serviceSaludos.getSaludosPort();
		System.out.println(port.getSaludo);
		System.out.println(port.getSaludoByName);
		 * 
		 * 
		 * 
		 * Sumas portSUmas = serviceSUmas.getSUmasPort();
		 * System.out.println(port.getSaludo);
		 * */
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost");
	}

}
