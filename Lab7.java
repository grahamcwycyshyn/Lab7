import java.util.Scanner;

public class Lab7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a valid name:");

		String name = input.nextLine();

		if (name.matches("[A-Z]{1}[a-z]{1,29}")) {
			System.out.println("Name is valid!");
		} else {
			System.out.println("Sorry, name is not valid!");
		}

		System.out.println("Please enter a valid email:");

		String email = input.nextLine();

		if (email.matches("[A-Za-z\\d]{5,30}[@][A-Za-z\\d]{5,10}[.][A-Za-z]{2,3}")) {
			System.out.println("Email is valid!");
		} else {
			System.out.println("Sorry, email is not valid!");
		}

		System.out.println("Please enter a valid phone number:");

		String number = input.nextLine();

		if (number.matches("\\d{3}[-]\\d{3}[-]\\d{4}")) {
			System.out.println("Phone number is valid!");
		} else {
			System.out.println("Phone number is not valid!");
		}

		System.out.println("Please enter a valid date:");

		String date = input.nextLine();

		if (date.matches("\\d{2}[/]\\d{2}[/]\\d{4}")) {
			System.out.println("Date is valid!");
		} else {
			System.out.println("Date is not valid!");
		}
		
		System.out.println("Please enter a valid html element:");
		
		String html = input.nextLine();
		
		if(html.matches("[<][^<>]+[>][^<>]*[<][^<>]+[/][>]")) {
			System.out.println("Html is valid!");
		} else {
			System.out.println("Html is not valid!");
		}
			
		input.close();
		
	}
}