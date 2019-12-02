/*
 * Class StudentAdvanceTickets
 * 
 * Same patterns as AdvanceTickets, the only difference is that the Price is half of the AdvanceTickets's price
 * 
 * Created by: Matheus Vazzoler
 * Date: 12/02/2019
 */
public class StudentAdvanceTickets extends AdvanceTickets {

	//Uses same constructor as AdvanceTickets
	public StudentAdvanceTickets(int number, int daysBeforeEvent) {
		super(number, daysBeforeEvent);
	}
	
	
	//@Override AdvanceTickets getPrice()
	public double getPrice() {
		if( this.daysBeforeEvent >= 10 ) {
			return 15.00;
		} else {
			return 20.00;
		}
	}
}
