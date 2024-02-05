// Employee.java
public class Employee
{
    private static int nextEmployeeId = 0;
    // Private components
    private String name;
    private int id;
    private double hoursWorked;
    private double payRate;
    
    // Constructors:
    public Employee(String name, double payRate)
    {
        this.name = name;
        this.payRate = payRate;
        this.hoursWorked = 0.0;
        this.id = nextEmployeeId++;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    
    public double getPayRate() {
        return payRate;
    }
	
    public void addHoursWorked(double workedHours){
    	this.hoursWorked = workedHours + this.hoursWorked;      
    }

    public void resetHoursWorked(){
    	this.hoursWorked = 0;
    }

    public Paycheck getWeeklyPay(Paycheck paycheck){
    	if (paycheck == null) {
            throw new IllegalArgumentException("Paycheck is null");
          }
          paycheck.setEmployeeHoursWorked(0);
        	return paycheck;
      
    }
    
	public void payRaise(double risePay){
      
        double percentIncrease = this.payRate * risePay/ 100;
      	this.payRate = percentIncrease + this.payRate;
    }
	
	public int getNumEmployees(){
        return nextEmployeeId;
      
    }


    public String toString(){
            return "Employee Name: " + this.name + "\nEmployee ID: "
    + this.id + "\nEmployee Pay Rate: " + this.payRate + "\nEmployee's Hours this Week: " + this.hoursWorked; 
        
  

}

