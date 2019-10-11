
public class Assignment3 {

	public static void main(String[] args) {
		printPowersOfN(4, 3);
		printPowersOfN(5, 6);
		printPowersOfN(-2, 8);
	}
	
	public static void printPowersOfN(int base, int maxExponent) {
		int temp = 1;

		System.out.print("1 ");
		for (int i = 1; i <= maxExponent; i++) {
			
			System.out.print(base * temp + " ");
			temp = base * temp;
		}
		
		System.out.println();
		
	}
}
