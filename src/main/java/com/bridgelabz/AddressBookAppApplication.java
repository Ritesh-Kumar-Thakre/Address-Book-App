package com.bridgelabz;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookAppApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook ab = new AddressBook();
		Map<String, AddressBook> addressBooks = new HashMap<>();
		System.out.println("Welcome to Address Book Program\n");

		System.out.println("**************Operations****************\n");
		System.out.println(
				"To add new address book press --> 1\nTo work on specific address book press --> 2\nTo exit press -->3\n");
		while (true) {
			System.out.print("Enter your choise: ");
			int operation = sc.nextInt();
			sc.nextLine();
			switch (operation) {
			case 1:
				System.out.print("Enter address book name: ");
				String name = sc.nextLine();
				if (!addressBooks.containsKey(name)) {
					addressBooks.put(name, ab);
				} else {
					System.out.println("Address book already exist");
					break;
				}
				break;
			case 2:
				System.out.println("Enter address book name to select");
				String name1 = sc.nextLine();
				AddressBook select = addressBooks.get(name1);
				System.out.print("Enter your choice:\n ");
				System.out.println("1 -> Add Contacts\n 2 -> Edit Contact By Name\n 3 -> Delete Contact By Name\n ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					select.addContacts();
					break;
				case 2:
					System.out.println(select.editContactByName());
					break;
				case 3:
					System.out.println(select.deleteContactByName());
					break;
				default:
					System.out.println("Wrong choice!!");
				}
				break;
			case 3:
				return;
			default:
				System.out.println("Wrong operation!!");
			}
		}
	}
}
