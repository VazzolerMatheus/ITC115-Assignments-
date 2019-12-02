
public class AdvanceTickets extends Tickets {
	
	protected int daysBeforeEvent;
	
	public AdvanceTickets(int number, int daysBeforeEvent) {
		super(number);
		
		this.daysBeforeEvent = daysBeforeEvent;
	}

	@Override
	public double getPrice() {
		if( this.daysBeforeEvent >= 10 ) {
			return 30.00;
		} else {
			return 40.00;
		}
	}
	
	
}
