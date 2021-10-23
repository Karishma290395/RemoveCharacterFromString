package test5;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String countStringChar = "";
		System.out.println("Please enter the String");
		String inputString = sc.nextLine(); 
		for (int i = 0; i < inputString.length(); i++) {

			if (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z'
					|| inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z' || inputString.charAt(i) ==' ') {

				countStringChar = countStringChar + inputString.charAt(i);
			} else {
				System.out.println("Please enter Alphabetic letters only");
				inputString = sc.nextLine();
				i--;
			}
		}
		System.out.println("Please enter the characters you want to remove");
		String subString = sc.nextLine();// is
		for (int i = 0; i < inputString.length(); i++) {
			boolean charPresent = false;
			for (int j = 0; j < subString.length(); j++) {
				if (inputString.charAt(i) == subString.charAt(j)) {
					charPresent = true;
				}
			}

			if (!charPresent) {
				System.out.print(inputString.charAt(i));
			}
		}

		sc.close();
	}
}
