 
//*******************************************************************
// 	Method: isSorted
//
// Output if an array is sorted or not. Returns true, or false
//
//By: Matheus Vazzoler	
//Date: 11/18/2019
//*******************************************************************

//*******************************************************************
// 	Method: isUnique
//
// Outputs if an input array is unique or not (Unique elements). Returns true or false.
//
//By: Matheus Vazzoler	
//Date: 11/18/2019
//*******************************************************************

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public static boolean isSorted(double[] input) {
		
		for(int i = 1; i < input.length; i++) {
			if ( input[i-1] > input[i] ) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isUnique(int[] input) {
		for(int i = 0; i < input.length; i++) {
			for(int j = i+1; j < input.length; j++) {
				if(input[i] == input[j] ) {
					return false;
				}
			}
		}
		return true;
	}
}
