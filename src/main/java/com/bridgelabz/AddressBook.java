package com.bridgelabz;

import java.util.*;

public class AddressBook {
	List<Contact> addressBook = new ArrayList<>();

	public void addAddressBook(Contact c) {
		addressBook.add(c);
	}

	public List<Contact> getAddressBook() {
		return addressBook;
	}
}
