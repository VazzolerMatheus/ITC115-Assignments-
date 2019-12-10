
public class DVD extends LibraryObjects{
	
	int durationMinutes;
	
	public DVD(int id, String name, double rentalPrice, String author, int durationMinutes) {
		super(id, name, rentalPrice, author);
		this.durationMinutes = durationMinutes;

	}
	
	public int getRentalDays() {
		return super.getRentalDays() + 15;
	}
	
	public double getFineFee() {
		return super.getFineFee() / 2;
	}
	
	public String toString() {
		return (super.toString() + "\n duration in minutes: " + durationMinutes);
	}
}

