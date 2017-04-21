/**==========================================================================
  Copyright © Infosys Limited  
  All rights Reserved. The contents of this file are a part of the Infosys 
  Reusable Assets Repository. You get a non exclusive, limited right to use 
  this file for the purpose for which it is delivered, solely in accordance 
  with the written agreement we have with you in respect of the same.
  This block on IP declaration must be retained
=============================================================================*/

/**
 * Filename :   CssServlet.java
 * Description: This class is used to save the css contents and overwrites the css
 * file
 *  
 *
 * Modification Log
 * Version      Date 			  Author 				Description
 * *************************************************************************************
 * 0.00a       	26-May-2012       Shradha_Rao	      Created Version
 * 0.00b      	25-Jul-2012       Shradha_Rao	      Modified Version
 * 
 * 
 * 
 */
package org.letstagon.servlet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * CssServlet.java is java class which implements the methods of HttpServlet
 * class
 * 
 * @author Shradha_Rao
 * 
 */
public class AppServlet extends HttpServlet {

	/**
		* 
		*/
	private static final long serialVersionUID = 1L;

	private static ServletConfig config=null;
	
	/**
	 * @return config
	 */
	@SuppressWarnings({ "unused", "static-access" })
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		
		// System.out.println("inside init method");

	}

	/**
		 * 
		 */
	public void destroy() {

		// System.out.println("inside destroy method");

	}

	/**
	 * @param HttpServletRequest
	 *            , HttpServletResponse
	 * @exception ServletException
	 *                ,IOException
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		System.out.println("inside doGet method");

	}

	/**
	 * @param HttpServletRequest
	 *            , HttpServletResponse
	 * @exception ServletException
	 *                ,IOException
	 */
	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//System.out.println("inside doPost method");

		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html");
		
		String username = request.getParameter("name");
		
		String mailId=request.getParameter("mail");
		
	
		
			
		      try{  
		       //Need to implemnet mail
		  
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}

	}

}
