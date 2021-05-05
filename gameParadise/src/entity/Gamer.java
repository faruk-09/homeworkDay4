package entity;

import java.util.Date;

public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private Date birtday;
	private String nationalId;
	private String email;
	
	public Gamer() {
		
	}
	
	public Gamer (int id , String firstName, String lastName , Date birtday, String nationalId, String email ) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.birtday  = birtday;
	this.nationalId = nationalId;
	this.email = email;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirtday() {
		return birtday;
	}

	public void setBirtday(Date birtday) {
		this.birtday = birtday;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

