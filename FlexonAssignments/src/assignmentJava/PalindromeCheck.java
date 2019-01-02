package assignmentJava;

public class PalindromeCheck {

	public static void main(String[] args) {
		JavaAssignment.palindrome("nun");

	}

}

class JavaAssignment{
	public static void palindrome(String originalWord) {
		String reverseWord = "";
		int wordLength = originalWord.length();
		
		for (int i = wordLength-1; i>=0; i--) {
			reverseWord = reverseWord + originalWord.charAt(i);
		}
		
		if (originalWord.equals(reverseWord)) {
			System.out.println("The word entered is Palindrome");
		}
		else {
			System.out.println("The word entered is not Palindrome");
		}
		
		System.out.println("The original word entered is: " + originalWord);
		System.out.println("The reversed word of original word is: " + reverseWord);	
	}	
}
