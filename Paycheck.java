// Paycheck.java
public class Paycheck
{
    // Private components:
    private int employeeId;
    private String employeeName;
    private double employeeRate;
    private double employeeHoursWorked;
    
    // Constructors:
    public Paycheck(
        int employeeId,
        String employeeName,
        double employeeRate,
        double employeeHoursWorked)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeRate = employeeRate;
        this.employeeHoursWorked = employeeHoursWorked;
    }
    
    public Paycheck(Employee employee)
    {
        this(
            employee.getId(),
            employee.getName(),
            employee.getPayRate(),
            employee.getHoursWorked());
    }
  
  	public Paycheck(){
      // do nothing
    }
  	
  	public void setEmployeeHoursWorked(double newHoursWorked) {
        this.employeeHoursWorked = newHoursWorked;
      }
      
    
//throw new IllegalArgumentException("The argument cannot be null");
  	public void loadCheck(Employee employee)
    {
    	if(employee == null){
			throw new IllegalArgumentException("Employee is null");
        }
      	this.employeeId = employee.getId();
        this.employeeName = employee.getName();
        this.employeeRate = employee.getPayRate();
        this.employeeHoursWorked = employee.getHoursWorked();
	}
    
    public double getTotalPay(){
      return employeeRate*employeeHoursWorked;
    }
    
    public String toString(){
        return this.employeeName + "'s Paycheck.\nId#:" + this.employeeId +
        "\nPay Rate:" + this.employeeRate + 
        "\nHours:" + this.employeeHoursWorked + 
        "\nTotal Pay: $" + this.getTotalPay();
      }
}