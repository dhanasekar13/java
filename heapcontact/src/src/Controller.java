package src;
import java.util.Scanner;

public class Controller {

	Name name = new Name();
	Email email = new Email();
	Number number = new Number();
	SocailMedia socailMediaProfile = new SocailMedia();
	Address address = new Address();
	static Contact contact = new Contact();
	static Application application = new Application();

	static Scanner input = new Scanner(System.in);

	public void setEmail(String group, String emails) {
		email.setEmail(group, emails);
	}

	public void setSocialMediaProfiles(String group, String profiles) {
		socailMediaProfile.setSocialMediaProfiles(group, profiles);
	}

	public void setAddress(String group, String add) {
		address.setAddress(group, add);
	}

	public void setNumber(String group, String num) {
		number.setNumber(group, num);
	}

	public void setFirstNames(String first) {
		name.setFirstname(first);
	}
	public void setContact() {
		String user = name.getFirstName();
		contact.newContact(user, email.getEmails());
		contact.newContact(user, number.getNumbers());
		contact.newContact(user, socailMediaProfile.getProfiles());
		contact.newContact(user, address.getAddress());
	}
	public static void main(String args[]) {
		int choice;
		do {
			System.out.println("Enter 1 to add contact");
			System.out.println("Enter 2 to display contact");
			System.out.println("Enter 0 to exit");
			System.out.println("Enter your choice");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				application.addNewContact();
				break;
			case 2:
				application.display(contact.getEnitreContact());
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice:");
			}
		} while (true);
	}
}
