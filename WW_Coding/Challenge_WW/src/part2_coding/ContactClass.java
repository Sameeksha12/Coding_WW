package part2_coding;

import java.util.*;
import java.io.*;

class Contact {

	private int id;
	private String name;
	private String phone;
	private String address;

	public Contact(int id, String name, String phone, String address) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	// get data method as per requirement which returns the data
	public String printData() {
		return String.format("ID: %d  NAME: %s  PHONE: %s  ADDRESS: %s", this.id, this.name, this.phone, this.address);
	}
}

public class ContactClass {
	public static void main(String args[]) throws IOException {
		ArrayList<Contact> contactList = new ArrayList<>();
		Contact c1 = new Contact(12,"Sami","6414515195","Shorewood DR,Seattle");
		Contact c2 = new Contact(19, "Moon", "8572947715", "1000 N 4th St, Iowa");
		Contact c3 = new Contact(113, "Chan","1234567890", "109 Pike St, Texas");

		contactList.add(c1);
		contactList.add(c2);
		contactList.add(c3);

		Iterator<Contact> iterator = contactList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next().printData());
		}
	}
}
