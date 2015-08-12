package ilen;

import java.util.Calendar;

public class Person implements Comparable<Person> {
	private String strFirstName;
	private String strLastName;
	private int iDoB;
	
	public Person(String strFirstName, String strLastName, int iDoB) {
		this.strFirstName = strFirstName;
		this.strLastName = strLastName;
		this.iDoB = iDoB;
	}
	
	public String getFistName() {
		return strFirstName;
	}
	
	public String getLastName() {
		return strLastName;
	}
	
	public int getDoB() {
		return iDoB;
	}
	
	public int getAge() {
		int curretnYear = Calendar.getInstance().get(Calendar.YEAR);
		return curretnYear - iDoB;
	}
	
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		int value = this.strLastName.compareTo(other.strLastName);
		
		// if object's last name is not equals
		if(value!=0)
			return value;
		// if object's last name is equals, continue compare first name
		value = this.strFirstName.compareTo(other.strFirstName);
		return value;
	}
}
