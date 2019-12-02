/*
 * Abstract Class Tickets
 * 
 * Used abstract to make sure the subclasses implement the mandatory methods
 * 
 * Created by: Matheus Vazzoler
 * Date: 12/02/2019
 */

public abstract class Tickets {
	
	protected int number;
	
	public Tickets(int number) {
		this.number = number;
	}
	
	public abstract double getPrice();
	
	public String ToString() {
		return ("Number: " + this.number + ", Price: " + this.getPrice() );
	}
	
}
