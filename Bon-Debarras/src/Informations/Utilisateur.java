package Informations;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="Utilisateur")
public class Utilisateur implements Serializable {  // le rendre Serialisable si on veut faire des echanges Remote
	
    private int idus;
	// Pour les autres variables la gestion des valeurs saisies(obligatoire/optionnel) sera gérée coté Interface
	private String name;
	private String fname;
	private String email;
	private int phone;
	private LocalDate savedate;
	private int state;
	private String password;
	
	// Constructeurs (avec/sans arguments)
	public Utilisateur(String name1,String fname1,String email1,int phone1,LocalDate savedate1,int state1,String password1){
		this.name = name1;
		this.fname = fname1;
		this.email = email1;
		this.phone = phone1;
		this.savedate = savedate1;
		this.state = state1;
		this.password = password1;
	}
	
	public Utilisateur(){
		super();		
	}

	/**
	 * @return the idus
	 */
	@Id						// specifier que cette Variable est la clé primaire de la table
    @GeneratedValue 		// specifier que cette Variable est en Auto-Increment dans la table( donc gérée par MySQL)
    @Column(name="idus")	// mapper la colonne dans la table associée à cette variable
	public int getIdus() {
		return idus;
	}

	/**
	 * @return the name
	 */
	@Column(name="name")
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the fname
	 */
	@Column(name="fname")
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the email
	 */
	@Column(name="email")
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	@Column(name="phone")
	public int getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}

	/**
	 * @return the savedate
	 */
	@Column(name="savedate")
	public LocalDate getSavedate() {
		return savedate;
	}

	/**
	 * @param savedate the savedate to set
	 */
	public void setSavedate(LocalDate savedate) {
		this.savedate = savedate;
	}

	/**
	 * @return the state
	 */
	@Column(name="state")
	public int getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 * @return the password
	 */
	@Column(name="password")
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
		
}
