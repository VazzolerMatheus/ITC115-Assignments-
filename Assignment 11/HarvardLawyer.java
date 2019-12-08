//HarvardLawyer Class
//
//This class extends Lawyer class and overwrittes only these 3 methods
//
//Created by: Matheus Vazzoler
//Date: 12/09/2019

public class HarvardLawyer extends Lawyer {
	//3 more days of vacation then Lawyer
	public int getVacationDays() {
		return super.getVacationDays() + 3;
	}
	
	//returns super.getVacationForm() 4 times in one string
	public String getVacationForm() {
		return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
	}
	//earns 20% more salary than Lawyer
	public double getSalary() {
		return super.getSalary() * 1.2;
	}
}
