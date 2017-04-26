

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			String action = request.getParameter("action");
			
			
			/*if(action.equals("login")){
				response.getWriter().append("if statement").append(request.getContextPath());
			}else{
				response.getWriter().append("else statement").append(request.getContextPath());
					}
			
			*/
			
			String nextPage=request.getParameter("nextPage");
			User a = new User();
			a.username = "Ned Stark";
			a.email = "nedstark@gmail.com";
			a.password = "1234";
			a.motto = "Winter is coming!";
			
			//add the user to the session
			HttpSession session = request.getSession();
			session.setAttribute("user", a);
			
			
			// Redirect to next page as indicated by the value of the next URL variable
			response.sendRedirect(request.getContextPath() +  "/" + nextPage);
				
		}
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
