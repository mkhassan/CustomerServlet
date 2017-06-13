

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessCustomer
 */
@WebServlet("/customerdata")
public class ProcessCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public MySQLHelper db;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    


	public  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cust_id = request.getParameter("cust_id");
		db.readDataBase(cust_id);
		
		
		String nextUrl = "/output.jsp";
		String message ="The customer id is "+cust_id;
		request.setAttribute("message", message);
		getServletContext().getRequestDispatcher(nextUrl).forward(request, response);
				
		//doGet(request, response);
	}

}
