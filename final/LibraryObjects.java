
public abstract class LibraryObjects {
	protected String name;
	protected String author;
	protected int id;
	protected double rentalPrice;
	
	public LibraryObjects(int id, String name, double rentalPrice, String author) {
		this.id = id;
		this.name = name;
		this.rentalPrice = rentalPrice;
		this.author = author;
	}


	public double getFineFee() {
		return 0.5;
	}
	
	public int getRentalDays() {
		return 30;
	}
	
	public double FinesAccrued(int dayslate) {
		return getFineFee() * dayslate;
	}
	
	public String toString() {
		return(" id: " + id + "\n name: " + name + "\n Price for renting : $" + rentalPrice  + "\n author: " + author + "\n Fine Fee (per day) : $" + getFineFee() + "\n Can be rented for: " + getRentalDays() + " days");
	}
}
