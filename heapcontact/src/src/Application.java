package src;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Application {
	static Controller contact = new Controller();
	static Scanner input = new Scanner(System.in);
	public static void addEmails() {
		System.out.println("Enter group name and corresponding emails");
		String group = input.next();
		String mail = input.next();
		contact.setEmail(group, mail);
	}
	public static void addProfiles() {

		System.out.println("Enter group and corresponding Socail media profiles");
		String group = input.next();
		String profile = input.next();
		contact.setSocialMediaProfiles(group, profile);
	}
	public static void addAddress() {

		System.out.println("Enter group and corresponding address");
		String group = input.next();
		String address = input.next();
		contact.setAddress(group, address);

	}
	public static void addNumbers() {

		System.out.println("Enter group and corresponding numbers");
		String group = input.next();
		String number = input.next();

		contact.setNumber(group, number);
	}
	public static void addName() {
		System.out.println("Enter you first name");
		String user = input.next();
		contact.setFirstNames(user);
	}

	public void addNewContact() {

		addName();
		addNumbers();
		addAddress();
		addProfiles();
		addEmails();

		contact.setContact();
	}

	public void display(HashMap<String, HashSet<HashMap<String, HashSet<String>>>> newContact) {

		System.out.println("....... Contact Details......");

		Set<String> keys = newContact.keySet();
		for (String key : keys) {
			System.out.println(key + " Details");
			HashSet<HashMap<String, HashSet<String>>> details = newContact.get(key);
			Iterator<HashMap<String, HashSet<String>>> itr = details.iterator();
			while (itr.hasNext()) {
				HashMap<String, HashSet<String>> ent = itr.next();
				Set<String> keys1 = ent.keySet();
				for (String key1 : keys1) {
					System.out.println(key1);
					System.out.println(ent.get(key1));
				}
			}

		}

	}
}
