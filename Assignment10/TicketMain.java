/*
 * Main Class
 * 
 * Tests from the client program
 * 
 * Created by: Matheus Vazzoler
 * Date: 12/02/2019
 */
public class TicketMain {

	public static void main(String[] args) {
		
		
	// Testing WalkupTickets
		System.out.println("Testing WalkupTickets: ");
		WalkupTickets t1 = new WalkupTickets(2134);
		
		System.out.println(t1.getPrice());
		System.out.println(t1.ToString());
		System.out.println();
	
	//Testing AdvanceTickets
		System.out.println("Testing AdvanceTickets: ");
		AdvanceTickets t2 = new AdvanceTickets(2134, 10);
		System.out.println(t2.getPrice());
		System.out.println(t2.ToString());
		
		AdvanceTickets t3 = new AdvanceTickets(2134, 9);
		System.out.println(t3.getPrice());
		System.out.println(t3.ToString());
		System.out.println();
		
	//Testing StudentAdvanceTickets
		System.out.println("Testing StudentAdvanceTickets: ");
		StudentAdvanceTickets t4 = new StudentAdvanceTickets(21213, 10);
		System.out.println(t4.getPrice());
		System.out.println(t4.ToString());
		
		StudentAdvanceTickets t5 = new StudentAdvanceTickets(21213, 9);
		System.out.println(t5.getPrice());
		System.out.println(t5.ToString());
		System.out.println();
	}

}
