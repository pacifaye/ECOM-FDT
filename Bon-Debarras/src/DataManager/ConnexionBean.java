package DataManager;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Session Bean implementation class ConnexionBean
 */
@Stateless
public class ConnexionBean implements Itf_ConnexionBean{

	// Gestion de la persistance des données
	@PersistenceContext(unitName="User")
	 private EntityManager EM; 

	@Override
	public boolean isAuthGood(String log, String pw) {
		boolean check = false;
			String sql = "SELECT PASSWORD FROM Utilisateur WHERE EMAIL ='"+log+"';";
			Query query = EM.createQuery(sql);	 
			String password =(String) query.getSingleResult();	
			
			if(password.equals(pw))
				check = true;		
		
		return check;
	}

}
