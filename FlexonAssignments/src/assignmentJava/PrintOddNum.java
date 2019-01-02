package assignmentJava;

public class PrintOddNum {

	public static void main(String[] args) {
		
		PrintOddNum.oddNumb(1, 20);

	}
	
	public static void oddNumb(int a, int b) {
		for (int i = a; i <= b; i++) {
			if(i%2 != 0) {
			System.out.print(i+" ");
			}
		}
	}

}
