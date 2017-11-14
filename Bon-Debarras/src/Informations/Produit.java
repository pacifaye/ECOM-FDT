package Informations;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

public class Produit {

    private int pnumero;;
    private int vnumero;
    private String pnom;
    private String image;
    private Text description;
    private float pmin;
    private float pmax;
    
	public int getPnumero() {
		return pnumero;
	}
	public void setPnumero(int pnumero) {
		this.pnumero = pnumero;
	}
	public int getVnumero() {
		return vnumero;
	}
	public void setVnumero(int vnumero) {
		this.vnumero = vnumero;
	}
	public String getPnom() {
		return pnom;
	}
	public void setPnom(String pnom) {
		this.pnom = pnom;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Text getDescription() {
		return description;
	}
	public void setDescription(Text description) {
		this.description = description;
	}
	public float getPmin() {
		return pmin;
	}
	public void setPmin(double d) {
		this.pmin = (float) d;
	}
	public float getPmax() {
		return pmax;
	}
	public void setPmax(double pmax) {
		this.pmax = (float) pmax;
	}
}
