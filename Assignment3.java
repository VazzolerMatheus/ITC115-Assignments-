// Assignment3 solution without the use of Math class

public class Assignment3 {

	public static void main(String[] args) {
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);
	}
	
	public static void printPowersOfN(int base, int maxExponent) {
		//Variable used to accumulate the value of the latest power interaction
		int accumulatedValue = 1;

		System.out.print("1 ");
		for (int i = 1; i <= maxExponent; i++) {
			
			System.out.print(base * accumulatedValue + " ");
			accumulatedValue = base * accumulatedValue;
		}
		
		System.out.println();
		
	}
}
