package nl.fs.servletdemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Product
 */
@WebServlet("/Product")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    private String getErrorID(int x){
    	switch(x){
    	case 101: 
    		return "Nononono 100 Nononono"; 
    	//case 200: 
    		//return "Nononono 200 Nononono"; 
    	case 400: 
    		return "Nononono 400 Nononono"; 
    	case 404: 
    		return "Nononono 404 Nononono"; 
    	case 418: 
    		return "Nononono 418 Nononono"; 
    	case 500: 
    		return "Nononono 500 Nononono"; 
    	default: 
    		return "A default error?!?!?"; 
    	}	
    }
   
    private int rekenen(int i, int j, String op){
    	//getOperator(op);
    		switch(op){
    		case"add":
    			return i + j;
    		case"min":
    			return i - j;
    		case"div":
    			return i / j;
    		case"mul":
    			return i * j;	
    		default: return 0;		
    		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int i = Integer.parseInt(request.getParameter("getalLinks"));
		//int j = Integer.parseInt(request.getParameter("getalRechts"));
		//String op = request.getParameter("operator");
		
		//response.getWriter().append("Jouw wachtwoord is: "+request.getParameter("pw"));
		//response.getWriter().append("Jouw rekensom is: "+ rekenen(i,j,op));

		int x = Integer.parseInt(request.getParameter("errorID"));
		response.sendError( x , getErrorID(x));
		//response.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
