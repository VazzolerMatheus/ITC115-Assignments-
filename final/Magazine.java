
public class Magazine extends LibraryObjects{
	
	public Magazine(int id, String name, double rentalPrice, String author) {
		super(id, name, rentalPrice, author);

	}
	
	public int getRentalDays() {
		return super.getRentalDays() / 2; 
	}
	
}
