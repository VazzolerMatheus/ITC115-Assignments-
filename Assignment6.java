//*******************************************************************
//
// 	Method: boyGirl
//
// Based by the input, the method will print the number or boys and girls of a text file,
// Also, it will output the difference between their numbers
//
//By: Matheus Vazzoler	
//Date: 11/13/2019
//
//*******************************************************************



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; 

public class Assignment6 {

	public static void main(String[] args) throws FileNotFoundException {
//		//Scanner hours = new Scanner(new File("hours2.dat"));
		Scanner input = new Scanner(new File("boysgirls.txt"));
		boyGirl(input);
	}
	
	public static void boyGirl(Scanner input) {
		int numberOfBoys = 0;
		int sumOfBoys = 0;
		
		int numberOfGirls = 0;
		int sumOfGirls = 0;
		
		int index = 1;
		
		while(input.hasNext()) {

			
			if (index % 2 != 0) {
				//condition for a boy
				numberOfBoys ++;
				input.next();
				sumOfBoys += input.nextInt();
				
			}else {
				//condition for a girl
				numberOfGirls ++;
				input.next();
				sumOfGirls += input.nextInt();
				
			}
			
			index ++;
		}
		
		
		System.out.println(numberOfBoys + " boys, " + numberOfGirls + " girls");
		System.out.println("Difference between boys' and girls' sums: " + Math.abs(sumOfBoys - sumOfGirls));
		
	}

}
