

public class TestMain {

	public static void main(String[] args) {
	
		//testing books class
		Books book1 = new Books(293746, "The World of Ice and Fire", 50.0, "George R. R. Martin");
		System.out.println(book1.toString());
		System.out.println();
//		System.out.println("It can be rented for: " + book1.getRentalDays() + " days");
		System.out.println("Fine for 15 days late: " + book1.FinesAccrued(15));
		
		//testing magazine class
		Magazine magazine1 = new Magazine(392839, "Vogue", 5.0, "Anna Wintour");
		System.out.println(magazine1.toString());
		System.out.println();
		
		//testing DVD class
		DVD dvd1 = new DVD(934128, "Born This Way at Maddison Square Garden", 6.0, "Lady Gaga", 128);
		System.out.println(dvd1.toString());
		System.out.println();
		
		//testing CD class that extends DVD class
		CD cd1 = new CD(121328, "Born This Way", 3.0, "Lady Gaga", 48);
		System.out.println(cd1.toString());
		System.out.println();
		
		//testing for fine with 15 days late
		System.out.println("Fine for ID: " + book1.id + " 15 days late: $" + book1.FinesAccrued(15));
		System.out.println("Fine for ID: " + magazine1.id + " 15 days late: $" + magazine1.FinesAccrued(15));
		System.out.println("Fine for ID: " + dvd1.id + " 15 days late: $" + dvd1.FinesAccrued(15));
		System.out.println("Fine for ID: " + cd1.id + " 15 days late: $" + cd1.FinesAccrued(15));
		 
		
	}

}
