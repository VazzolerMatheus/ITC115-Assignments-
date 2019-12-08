public class HarvardLawyer extends Lawyer {
    
    public String getVacationForm() {
        String color =  "";
        for ( int i = 0; i < 4; i++) {
            color += super.getVacationForm();
        }
        return color;
    }
    
    public int getVacationDays() {
        int vacationDays;
        vacationDays = 3 + super.getVacationDays();
        return vacationDays;
    }
    
    public double getSalary() {
        int salary;
        salary = 1.2 * super.getSalary();
        return salary;
    }
}