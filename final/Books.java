
public class Books extends LibraryObjects {
	
//	protected String name;
//	protected int id;
//	protected double rentalPrice;
	
	public Books(int id, String name, double rentalPrice, String author) {
		super(id, name, rentalPrice, author);

	}
	
	public double getFineFee() {
		return super.getFineFee() * 3;
	}
	
}
