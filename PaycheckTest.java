/*
 * /******
Name: Gabriel Cristo
Assignment: Lab 2 
Date: 2/2
Notes: Tests Paycheck class 
******/
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Paycheck class.
 */
public class PaycheckTest{

  private Paycheck p1;
  private Paycheck p2;
  private Paycheck p3;


  @Before
  public void setUp() {
	   p1 = new Paycheck(0, "john", 12.0, 10);
	   p2 = new Paycheck(1, "herman", 15.0, 12);
	   p3 = new Paycheck(2, "gabriel", 20, 14);
   
  @Test
  public void setEmployeeHoursWorked() {
	  
	  
  }
  
  @Test
  public void loadCheckTest(){
	  Employee employee = new Employee(p1)
	  assertEquals()
	  Employee employee = new Employee(p2)
	  assertEquals()
	  Employee employee = new Employee(p3)
	  assertEquals()
	  
  }
  
  @Test
  public double getTotalPay() {
	  
  
  }
  
  @Test
  public String toString() {
	  
  }
  
  
  
  }