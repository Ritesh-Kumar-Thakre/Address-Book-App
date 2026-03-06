package com.bridgelabz;


public class Contact {
	protected String firstName;
	protected String lastNames;
	protected String address;
	protected String city;
	protected String state;
	protected int zip;
	protected int phoneNumber;
	protected String email;

	public Contact(String firstName, String lastNames, String address, String city, String state, int zip,
			int phoneNumber, String email) {
		this.firstName = firstName;
		this.lastNames = lastNames;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	@Override
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastNames + "\nAddress: " + address + "\nCity: " + city
				+ "\nState: " + state + "\nZip: " + zip + "\nPhone Number: " + phoneNumber + "\nEmail: " + email;
	}
}