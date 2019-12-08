//Janitor Class
//
//This class extends Janitor class and overwrites only these 3 methods
//and creates a new one clean()
//
//Created by: Matheus Vazzoler
//Date: 12/09/2019

public class Janitor extends Employee{
	//Work two time more than Employee
	public int getHours() {
		return super.getHours() * 2;
	}
	//get 10000 less salary 
	public double getSalary() {
		return super.getSalary() - 10000.0;
	}
	
	//Half of employee hours
	public int getVacationDays() {
		return super.getVacationDays() / 2;
	}
	//this is an unique method for Janitor
	public String clean() {
		return "Workin ' for the man.";
	}
}
