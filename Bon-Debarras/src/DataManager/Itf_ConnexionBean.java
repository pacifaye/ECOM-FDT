/**
 * 
 */
package DataManager;

import javax.ejb.Remote;

@Remote
public interface Itf_ConnexionBean {
	
	public boolean isAuthGood(String log, String pw);
	
	

}
