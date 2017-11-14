package Services;

import java.io.IOException;
import java.time.LocalDate;

import javax.ejb.EJB;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DataManager.InscriptionBean;
import Informations.Utilisateur;

public class Inscription_serv extends HttpServlet {
	
		private String ID;
		@EJB
		private InscriptionBean DataStore;
		
		public void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException {
		   ID = req.getParameter("id");
		   //System.out.println("Identifiant = "+ID);
		   resp.sendRedirect("Inscription.jsp");
		}
		
		public void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException{
			
			String nom = req.getParameter("nom");
			String prenom = req.getParameter("prenom");
			int BP = Integer.parseInt(req.getParameter("bp"));
			int phone = Integer.parseInt(req.getParameter("phone"));
			String email = req.getParameter("email");
			String password = req.getParameter("mdp");		
			
			/* Affichage */
			
			//System.out.println("Identifiant : 				"+IDcli); passer en auto increment sur BD
			System.out.println("Nom : 				"+nom);
			System.out.println("Prenom : 			"+prenom);
			System.out.println("Boite postale : 			"+BP);
			System.out.println("Telephone	:			"+phone);
			System.out.println("email	:			"+email);
			System.out.println("local date :	"+LocalDate.now());
		
			/* Stockage des infos recuperées dans le bean d' inscription */
			Utilisateur user = new Utilisateur(nom,prenom,email,phone,LocalDate.now(),BP,password);
			DataStore.setUserInfo(user);
			
			/* Effectuer la requête d insertion au niveau de la base */
			
			DataStore.SubscribeRequest();
			
			/* Retour à la page principale*/
			
			resp.sendRedirect("index.html");
			
		}

}






