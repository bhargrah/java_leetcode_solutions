package problems;

/**
 * @author rahulbhargava
 * @category 929. Unique Email Addresses
 * @see https://leetcode.com/problems/unique-email-addresses/
 */


import java.util.HashSet;
import java.util.Set;

public class Solution_929 {

	public static void main(String[] args) {

		String[] input = { "test.email+alex@leetcode.com", 
							"test.e.mail+bob.cathy@leetcode.com",
							"testemail+david@lee.tcode.com", 
							"testraEemail+davidlee.tcode.com" };
		System.out.println(numUniqueEmails(input));

	}

	public static int numUniqueEmails(String[] emails) {

		Set<String> dict = new HashSet<>();

		for (int iCnt = 0; iCnt < emails.length; iCnt++) {
			String email = isValidMail(emails[iCnt]);
			if (email != null) dict.add(email);
		}

		return dict.size();

	}

	private static String isValidMail(String email) {

		String[] parts = email.split("@");

		if (parts.length < 2) return null;

		String emailName = emailNameValidator(parts[0]);
		String domainName = domainValidate(parts[1]);

		if (emailName == null || domainName == null) return null;

		return emailName + "@" + domainName;
	}

	private static String domainValidate(String domain) {

		for (char element : domain.toCharArray()) {
			if (!((element > 96 && element < 123) || (element > 64 && element < 91) || element == 46)) { // fall only between a-z,A-Z and .
				return null;
			}
		}

		return domain;

	}

	private static String emailNameValidator(String emailName) {

		String[] parts = emailName.split("\\+");

		for (char element : parts[0].toCharArray()) {
			if (!((element > 96 && element < 123) || (element > 64 && element < 91) || (element > 45 && element < 58))) // fall only between a-z,A-Z,0-9 and .
				return null;
		}

		return parts[0].replace(".", "");
	}

}
