package Informations;

public class Commande {

	int idcm;
	int idpr;
	int idus;
	Float price;
	public Commande (int idcm1,int idpr1,int idus1,Float price1)
	{
		 idcm = idcm1;
		 idpr = idpr1;
		 idus =idus1;
		 price = price1;
	}
	public int getIdcm() {
		return idcm;
	}
	public void setIdcm(int idcm) {
		this.idcm = idcm;
	}
	public int getIdpr() {
		return idpr;
	}
	public void setIdpr(int idpr) {
		this.idpr = idpr;
	}
	public int getIdus() {
		return idus;
	}
	public void setIdus(int idus) {
		this.idus = idus;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	
}
