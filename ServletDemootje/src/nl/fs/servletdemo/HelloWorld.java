package nl.fs.servletdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.*;

import nl.fs.winkelservlet.Product;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld/index.html")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList <Product> lijstProd = new ArrayList<>();
	
	
	
       int i = 0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
       
    protected void vulLijst(){
    	int counter = 1;
		lijstProd.add(new Product("Product A","https://pbs.twimg.com/profile_images/578073915693494273/Kvm9b-aX.jpeg",counter++));
		lijstProd.add(new Product("Product B","https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQKT6OWSPDg1j7vvjHcLr4tUlQgW0RoAL4Zm5ZIgLKwg5uZK7lw3A",counter++));
		lijstProd.add(new Product("Product C","C:\\Users\\Student\\Pictures\\kittens.jpg",counter++));    }
       
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String direction(){
    	double d = Math.random();
    	if(d>0.5){
    		//System.out.println("Go to: ");
    		return "Left ";
    	}else{
    		//System.out.println("Go to: ");
    		return "Right ";
    	}
    	
    }
    
    private String changeCSS(){
    	long time = LocalTime.now().getSecond();
    	if (time < 30){
    		return "3px solid red ";
    	}else{
    		return "3px solid blue ";
    	}
    }
    
    private String myHTML() {
    	vulLijst();
    	
    	//long timeSecs = time.getSecond();
    	//int counter = 0;
    		return "<html>"
    				+ "<head>"
    				+"<style>"
    				+"li img{ width: 100px; height:100px; border: "+ changeCSS() +";}"
    				+ ".left{ float: left; position:relative; margin-left: 25%; border: 3px solid black;}"
    				+ ".right{ float: right; position:relative; margin-right: 25%; border: 3px solid black; text-align:right;}"
    				+ "header{ clear: both; border: 3px solid black; margin-left: 25%;margin-right: 25%;}"
    				+ "footer{ clear: both; border: 3px solid black; margin-left: 25%; margin-right: 25%;}"
    				+"</style>"
    				+ "</head>"
    				+ "<header>"
    				+ direction()
    				+ "</header>"
    				+ "<body>"
    				+"<div class=left><ol>"
    				+"<li><img src=\""+lijstProd.get(0).getImgUrl()+"\">" + "<a href=\"../Product?id="+ lijstProd.get(0).getID() +"\">"+lijstProd.get(0).getName()+"</a>"
    				+"<li><img src=\""+lijstProd.get(1).getImgUrl()+"\">" + "<a href=\"../Product?id="+ lijstProd.get(1).getID() +"\">"+lijstProd.get(1).getName()+"</a>"
    				+"<li><img src=\""+lijstProd.get(2).getImgUrl()+"\">" + "<a href=\"../Product?id="+ lijstProd.get(2).getID() +"\">"+lijstProd.get(2).getName()+"</a>"
    				+"</ol></div>"
    				+"<div class=right>"
    				+ "<form method=get action=\"../Product\">"
    				+ "Name <input type=text name=user>"
    				+ "<p>Password <input type=password name=pw></p>"
    				+ "<br><input type=submit value=Send>"
    				+ "</form>"
    				+"</div>"
    				+"<div class=right>"
    				+ "<form method=get action=\"../Product\">"
    				+ "Choose your Error:"
    				+ "<br>100<input type=radio name=errorID value=100>"
    				+ "<br>200<input type=radio name=errorID value=200>"
    				+ "<br>400<input type=radio name=errorID value=400>"
    				+ "<br>404<input type=radio name=errorID value=404>"
    				+ "<br>418<input type=radio name=errorID value=418>"
    				+ "<br>500<input type=radio name=errorID value=500>"
    				+ "<br><input type=submit value=Send>"
    				+ "</form>"
    				+ "<form method=get action=\"../Product\">"
    				+ "get rekt:"
    				+ "<br><input type=text name=getalLinks>"
    				+ "<select name=operator>"
    				+ "<option value=add>+</option>"
    				+ "<option value=min>-</option>"
    				+ "<option value=div>/</option>"
    				+ "<option value=mul>*</option>"
    				+ "</select>"
    				+ "<input type=text name=getalRechts>"
    				+ "<p><input type=submit value=Send></p>"
    				+ "</form>"
    				+"</div>"
    				+ "</body>"
    				+ "<footer>"
    				+ "<p>Hallooo</p>"
    				+ "</footer>"
    				+ "</html>";
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append(direction() + i++);
		//System.out.println(request.getPathInfo());
		response.getWriter().append(myHTML());
		//response.getWriter().append(direction() + i++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
