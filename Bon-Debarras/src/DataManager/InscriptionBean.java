package DataManager;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Informations.Utilisateur;

/**
 * Session Bean implementation class InscriptionBean
 */
@Stateless // à changer en Stateful si conflit
public class InscriptionBean implements Itf_InscriptionBean {

	private Utilisateur UserInfo;
	
	// Gestion de la persistance des données
	@PersistenceContext(unitName="User")
	 private EntityManager EM; 
	

	public void setUserInfo(Utilisateur u) {
		this.UserInfo = u;
		
	}
	
	public void SubscribeRequest(){
		// Requete d' insert au niveau de la base
		//String s = UserInfo.getName()+"','"+UserInfo.getFname()+"','"+UserInfo.getEmail()+"',"+UserInfo.getPhone()+",'"+UserInfo.getSavedate()+"',"+UserInfo.getState()+",'"+UserInfo.getPassword()+"'";
		//String sql = "INSERT INTO Utilisateur (IDUS,NAME,FNAME,EMAIL,PHONE,SAVEDATE,STATE,PASSWORD) VALUES ("+s+");";
		//Query query = EM.createQuery(sql);
		
		// Directement utiliser la methode persistance du Entity Manager
		EM.persist(UserInfo);
		
	}

	
}
