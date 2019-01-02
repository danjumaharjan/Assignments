package assignmentJava;

public class PrimeNumbers {

	public static void main(String[] args) {
		findPrime.primeNum(1, 50);
	}
}

class findPrime {
	public static void primeNum(int a, int b) {

		for (int i = a; i <= b; i++) {
			boolean primeNum = true;
			for (int j = 2; j <= (i - 1); j++) {
				if (i % j == 0) {
					primeNum = false;
					break;
				}
			}
			if (primeNum == true)
				System.out.print(i + " ");
		}
	}
}