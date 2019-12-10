//Books class
//
//Fine is 3 times more than regular Library objects
//
//created by Matheus Vazzoler
//date: 12/09

public class Books extends LibraryObjects {

	
	public Books(int id, String name, double rentalPrice, String author) {
		super(id, name, rentalPrice, author);

	}
	
	public double getFineFee() {
		return super.getFineFee() * 3;
	}
	
}
