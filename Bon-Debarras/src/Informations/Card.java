package Informations;

import java.sql.Date;

public class Card {
	
	int idcd;
	int idcm;
	int numbers;
	String name;
	Date date;
	int code;

	public Card(int idcd1,int idcm1,int numbers1,String name1,Date date1,int code1)
	{
	idcd = idcd1;
	idcm = idcm1;
	numbers =numbers1;
	name = name1;
	date = date1;
	code = code1;
	}

	public int getIdcd() {
		return idcd;
	}

	public int getIdcm() {
		return idcm;
	}

	public int getNumbers() {
		return numbers;
	}

	public String getName() {
		return name;
	}

	public Date getDate() {
		return date;
	}

	public void setIdcd(int idcd) {
		this.idcd = idcd;
	}

	public void setIdcm(int idcm) {
		this.idcm = idcm;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	
}
