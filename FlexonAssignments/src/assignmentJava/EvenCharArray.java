package assignmentJava;

public class EvenCharArray {

	public static void main(String[] args) {
		char evenNumbers[] = {'a','b','c','d','e'};
		
		for (int i = 1; i < evenNumbers.length; i++) {
			if (i%2==0) {
				System.out.println("Char positioning is: "+ i + " and character in an array is: " + evenNumbers[i]);
			}
		}

	}

}
