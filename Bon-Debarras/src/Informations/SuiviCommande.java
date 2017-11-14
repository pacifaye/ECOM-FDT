package Informations;

import java.sql.Date;

public class SuiviCommande {
	int idcm;
	int idus;
	Date date;
	Float price;
	int state;

	public SuiviCommande(int idcm1,int idus1,Date date1,Float price1,int state1)
	{
		idcm= idcm1;
		idus= idus1;
		date= date1;
		price = price1;
		state = state1;
	}

	public int getIdcm() {
		return idcm;
	}

	public int getIdus() {
		return idus;
	}

	public Date getDate() {
		return date;
	}

	public Float getPrice() {
		return price;
	}

	public int getState() {
		return state;
	}

	public void setIdcm(int idcm) {
		this.idcm = idcm;
	}

	public void setIdus(int idus) {
		this.idus = idus;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public void setState(int state) {
		this.state = state;
	}


}
