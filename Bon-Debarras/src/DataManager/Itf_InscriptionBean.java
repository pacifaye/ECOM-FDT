package DataManager;


import javax.ejb.Remote;

import Informations.Utilisateur;


@Remote
public interface Itf_InscriptionBean {
	
	public void setUserInfo(Utilisateur u);
	public void SubscribeRequest();

}
