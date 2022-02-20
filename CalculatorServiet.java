package scr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServiet")
public class CalculatorServiet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CalculatorServiet() {
        super();
    }

	
	protected synchronized void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		int value=0;
		if(request.getParameter("button").equals("+"))
		{
		value= a+b;
		}
		else if(request.getParameter("button").equals("-"))
		{
		 value=a-b;	
		}
		else if(request.getParameter("button").equals("*"))
		{
		  value=a*b;	
		}
		else if(request.getParameter("button").equals("/"))
		{
			value=(a==0||b==0)? 0:a/b;
		}
		
		response.sendRedirect("additionexample.jsp?q="+value);
		//out.print(value);
	}

}