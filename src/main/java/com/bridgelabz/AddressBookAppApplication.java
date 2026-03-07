package com.bridgelabz;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookAppApplication {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook ab = new AddressBook();
		ab.addContacts();
		System.out.println(ab.editContactByName());
		System.out.println(ab.deleteContactByName());
	}
}
