package Services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DataManager.ConnexionBean;



public class Connexion_serv extends HttpServlet {

	public static String LastLogged ="";  
	
	@EJB
	private ConnexionBean data;
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException {
		PrintWriter out;
		
		String Login = req.getParameter("login");
		String password = req.getParameter("mdp");
		System.out.println("datas = "+Login+"/"+password);
		boolean checking = data.isAuthGood(Login,password);
		System.out.println("test checking = "+checking);
		
		if(checking){
			LastLogged = Login;
	        //req.getRequestDispatcher("/MenuPrincipal.jsp").forward(req, resp); pour plus tard
			resp.sendRedirect("index.html");
			
		}else{
			out = resp.getWriter();
			out.println("<html>");
			out.println("<head>");
			out.println("<title> error authentification </title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<center>Authentification error : mot de passe et/ou email errone </center>");	
			out.println("</body>");
			out.println("</html>");

			//resp.sendRedirect("index.html");
		}
	
	}
	
}
