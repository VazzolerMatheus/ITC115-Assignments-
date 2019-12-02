/*
 * Class WalkupTickets
 * 
 * Walk-up tickets are purchased the day of the event and cost $50
 * 
 * Created by: Matheus Vazzoler
 * Date: 12/02/2019
 */
public class WalkupTickets extends Tickets{
	
	public WalkupTickets(int number) {
		super(number);
	}
	
	@Override
	public double getPrice() {
		return 50.00;
	}
}
