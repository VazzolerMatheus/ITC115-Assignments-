
public class TestMain {

	public static void main(String[] args) {
		
		//Janitor class testing
		Janitor j1 = new Janitor();
		System.out.println(j1.getHours());
		System.out.println(j1.getSalary());
		System.out.println(j1.clean());
		
		//HarvardLawyer class testing
		HarvardLawyer l1 = new HarvardLawyer();
		System.out.println(l1.getVacationDays());
		System.out.println(l1.getSalary());
		System.out.println(l1.getVacationForm());
	}

}
