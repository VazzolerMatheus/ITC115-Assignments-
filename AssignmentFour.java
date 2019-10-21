
public class AssignmentFour {

	public static void main(String[] args) {
		repl("Teresinha", 3);

	}
	
//*******************************************************************
//  Method repl
//
// Prints out X string N number of times, in the same line
//By: Matheus
//Date: 10/21/2019
//*******************************************************************


	public static void repl(String phrase, int n) {
		for (int i = 1; i<= n; i++) {
			System.out.print(phrase);
		}
	}
}
