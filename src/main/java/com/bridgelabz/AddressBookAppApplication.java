package com.bridgelabz;

import java.util.*;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookAppApplication {
	static Scanner sc = new Scanner(System.in);

	// method to add contacts
	public static void addContacts(List<Contact> addressBook) {
		System.out.println("Enter number of contact to add: ");
		int num = sc.nextInt();
		sc.nextLine();
		while (num != 0) {
			System.out.println("Enter details:- ");
			System.out.print("First name: ");
			String firstName = sc.nextLine();
			System.out.print("Last name: ");
			String lastName = sc.nextLine();
			System.out.print("Address: ");
			String address = sc.nextLine();
			System.out.print("City: ");
			String city = sc.nextLine();
			System.out.print("State: ");
			String state = sc.nextLine();
			System.out.print("Zip code: ");
			int zip = sc.nextInt();
			System.out.println("Phone number: ");
			long phoneNumber = sc.nextInt();
			sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			Contact c = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
			addressBook.add(c);
			num--;
		}
	}

	// method to edit contacts using name
	public static String editContactByName(List<Contact> list) {
		System.out.println("\n================ EDIT CONTACT BY NAME ================\n");
		System.out.print("Enter full name of the Contact: ");
		String name = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			String fullName = list.get(i).firstName + " " + list.get(i).lastNames;
			if (fullName.equals(name)) {
				while (true) {
					System.out.println(
							"Enter the area of edit: -->firstName, lastName, address, city, state, zip, phoneNumber, email<-- -->EXIT<--");
					String edit = sc.nextLine();
					switch (edit) {
					case "firstName":
						System.out.print("Enter new first name: ");
						list.get(i).firstName = sc.nextLine();
						break;
					case "lastName":
						System.out.print("Enter new last name: ");
						list.get(i).lastNames = sc.nextLine();
						break;
					case "address":
						System.out.print("Enter new address: ");
						list.get(i).address = sc.nextLine();
						break;
					case "city":
						System.out.print("Enter new city: ");
						list.get(i).city = sc.nextLine();
						break;
					case "state":
						System.out.print("Enter new state: ");
						list.get(i).state = sc.nextLine();
						break;
					case "zip":
						System.out.print("Enter new zip: ");
						list.get(i).zip = sc.nextInt();
						break;
					case "phoneNumber":
						System.out.print("Enter new phone number: ");
						list.get(i).phoneNumber = sc.nextLong();
						break;
					case "email":
						System.out.print("Enter new email: ");
						list.get(i).email = sc.nextLine();
						break;
					case "EXIT":
						return "Contact edited";
					default:
						System.out.println("Invalid option selected.");
						break;
					}
				}
			}
		}
		return "No contact found";
	}

	// method to delete contacts using name
	public static String deleteContactByName(List<Contact> list) {
		System.out.println("\n================ DELETE CONTACT BY NAME ================\n");
		System.out.print("Enter full name of the Contact: ");
		String name = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			String fullName = list.get(i).firstName + " " + list.get(i).lastNames;
			if (fullName.equals(name)) {
				list.remove(list.get(i));
				return "Contact removed";
			}
		}
		return "No contact found";
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook ab = new AddressBook();
		addContacts(ab.addressBook);
		System.out.println(editContactByName(ab.addressBook));
		System.out.println(deleteContactByName(ab.addressBook));
	}
}
