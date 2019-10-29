public class Assignment5 {

	public static void main(String[] args) {
		System.out.println(season(2, 10));
		
		 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		    System.out.println("Enter username");

		    String userName = myObj.nextLine();  // Read user input
		    System.out.println("Username is: " + userName);  // Output user input

	}
	
	public static void printGPA()
	
	public static String season(int month, int day) {
		if(month >=3 && month <= 5) {
			return "Spring";
		}else if (month >= 6 && month <= 8) {
			return "Summer";
		}else if (month >= 9 && month <= 11) {
			return "Fall";
		}else {
			return "Winter";
		}
		
	}
}
