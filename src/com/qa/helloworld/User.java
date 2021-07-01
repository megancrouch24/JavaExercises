package com.qa.helloworld;

import java.util.ArrayList;

public class User {

	// private state
	private String Forename;
	private String Surname;
	private int Age;
	private String Email;
	private String TelephoneNo;
	private ArrayList<String> MiddleNames;

//public accessors getters/setters
	public String getforename() {
		return this.Forename;
	}

	public void setForename(String Forename) {
		this.Forename = Forename;
	}

	public String getsurname() {
		return this.Surname;
	}

	public void setSurname(String Surname) {
		this.Surname = Surname;
	}

	public int getAge() {
		return this.Age;
	}

	public void setAge(int Age) {
		this.Age = Age;

	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getTelephoneNo() {
		return this.TelephoneNo;
	}

	public void setTelephoneNo(String TelephoneNo) {
		this.TelephoneNo = TelephoneNo;

	}

	public ArrayList<String> getMiddleNames() {
		return this.MiddleNames;
	}

	public void setMiddleNames(ArrayList<String> MiddleNames) {
		this.MiddleNames = MiddleNames;
	}

	public void addMiddleNames(String MiddleName) {
		this.MiddleNames.add(MiddleName);
	}

	@Override
	public String toString() {
		return "User [ForeName=" + ForeName + ", SurName=" + Surname ", Email=" + Email +
				" + TelephoneNo=" + TelephoneNo + ", " MiddleNames=" + MiddleNames + ", age=" + Age +"]";
		+ " " + setTelephoneNo();
 	}

}
