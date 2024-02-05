/*
 * /******
Name: Gabriel Cristo
Assignment: Lab 2 
Date: 2/2
Notes: Tests Employee class 
******/
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * A JUnit test class for the Employee class.
 */
public class EmployeeTest{

  private Employee john;
  private Employee herman;
  private Employee gabriel;
  private Employee tabitha;
  private Employee phil; 
  private Employee joanna; 
  

  @Before
  public void setUp() {

    john = new Employee("john", 12.0);
    herman = new Employee("herman", 15.0);
    gabriel = new Employee("gabriel", 20.0);
    tabitha = new Employee("tabitha", 22.0);
    phil = new Employee("phil", 25.0);
    joanna = new Employee("joanna", 26.0);
 
  }

  @Test
  public void testGetname() {
    assertEquals("john", john.getName());
    assertEquals("herman", herman.getName());
    assertEquals("gabriel", gabriel.getName());
    assertEquals("tabitha", tabitha.getName());
    assertEquals("phil", phil.getName());
    assertEquals("joanna", joanna.getName());
   
  }

  @Test
  public void testGetID() {
    assertEquals(0, john.getId());
    assertEquals(1, herman.getId());
    assertEquals(2, gabriel.getId());
    assertEquals(3, tabitha.getId());
    assertEquals(4, phil.getId());
    assertEquals(5, joanna.getId());
    
    
  }
  
    
    
    

  @Test
  public void testgetHoursWorked() { 
    assertEquals(0, john.getHoursWorked());
    assertEquals(0, herman.getHoursWorked());
    assertEquals(0, gabriel.getHoursWorked());
    assertEquals(0, tabitha.getHoursWorked());
    assertEquals(0, phil.getHoursWorked());
    assertEquals(0, joanna.getHoursWorked());

}
  
  
  
    @Test
  public void testgetPayRate() { 
    assertEquals(12.0, john.getPayRate());
    assertEquals(15.0, herman.getPayRate());
    assertEquals(20.0, gabriel.getPayRate());
    assertEquals(22.0, tabitha.getPayRate());
    assertEquals(25.0, phil.getPayRate());
    assertEquals(26.0, joanna.getPayRate());

}
  
    
  @Test
  public void testaddHoursWorked() { 
    assertEquals(0, john.getHoursWorked());
    john.addHoursWorked(2);
    assertEquals(2, john.getHoursWorked());
    assertEquals(0, herman.getHoursWorked());
    herman.addHoursWorked(4);
    assertEquals(4, herman.getHoursWorked());
    assertEquals(0, gabriel.getHoursWorked());
    gabriel.addHoursWorked(6);
    assertEquals(6, gabriel.getHoursWorked());
    assertEquals(0, tabitha.getHoursWorked());
    tabitha.addHoursWorked(8);
    assertEquals(8, tabitha.getHoursWorked());
    assertEquals(0, phil.getHoursWorked());
    phil.addHoursWorked(10);
    assertEquals(10, phil.getHoursWorked());
    assertEquals(0, joanna.getHoursWorked());
    joanna.addHoursWorked(12);
    assertEquals(12, joanna.getHoursWorked());

}
  
  
  @Test
  public void testresetHoursWorked() { 
    assertEquals(0, john.getHoursWorked());
    john.addHoursWorked(2);
    john.resetHoursWorked();
    assertEquals(0, john.getHoursWorked());
    assertEquals(0, herman.getHoursWorked());
    herman.addHoursWorked(4);
    herman.resetHoursWorked();
    assertEquals(0, herman.getHoursWorked());
    assertEquals(0, gabriel.getHoursWorked());
    gabriel.addHoursWorked(6);
    gabriel.resetHoursWorked();
    assertEquals(0, gabriel.getHoursWorked());
    assertEquals(0, tabitha.getHoursWorked());
    tabitha.addHoursWorked(8);
    tabitha.resetHoursWorked();
    assertEquals(0, tabitha.getHoursWorked());
    assertEquals(0, phil.getHoursWorked());
    phil.addHoursWorked(10);
    phil.resetHourWorked();
    assertEquals(0, phil.getHoursWorked());
    assertEquals(0, joanna.getHoursWorked());
    joanna.addHoursWorked(12);
    joanna.resetHoursWorked();
    assertEquals(0, joanna.getHoursWorked());
  }
  
  @Test
  public void testGetWeeklyPay() {
    john.addHoursWorked(2);
    Paycheck paycheck = new Paycheck(john);
    assertEquals(24, paycheck.getTotalPay());
    assertEquals(0, john.getHoursWorked());
    herman.addHoursWorked(2);
    Paycheck paycheck = new Paycheck(herman);
    assertEquals(30, paycheck.getTotalPay());
    assertEquals(0, herman.getHoursWorked());
    gabriel.addHoursWorked(2);
    Paycheck paycheck = new Paycheck(gabriel);
    assertEquals(40, paycheck.getTotalPay());
    assertEquals(0, gabriel.getHoursWorked());
    tabitha.addHoursWorked(2);
    Paycheck paycheck = new Paycheck(tabitha);
    assertEquals(44, paycheck.getTotalPay());
    assertEquals(0, tabitha.getHoursWorked();
    phil.addHoursWorked(2);
    Paycheck paycheck = new Paycheck(phil);
    assertEquals(50, paycheck.getTotalPay());
    assertEquals(0, phil.getHoursWorked();
    joanna.addHoursWorked(2);
    Paycheck paycheck = new Paycheck(joanna);
    assertEquals(52, paycheck.getTotalPay());
    assertEquals(0, joanna.getHoursWorked();
    }
    
  @Test
  public void testPayRaise() {
    john.payRaise(50);
    assertEquals(18.0, john.getPayRate());
    herman.payRaise(50);
    assertEquals(22.5,  herman.getPayRate());
    gabriel.payRaise(50);
    assertEquals(30,  gabriel.getPayRate());
    tabitha.payRaise(50);
    assertEquals(33,  tabitha.getPayRate());
    phil.payRaise(50);
    assertEquals(37.5,  phil.getPayRate());
    joanna.payRaise(50);
    assertEquals(39,  joanna.getPayRate());
  }
  
  @Test
  public void testString() {
    assertEquals("Employee Name: john\n" + 
                 "Employee ID: 0\n" +
                 "Employee Pay Rate: 12\n" + 
                 "Employee's Hours this Week: 0",john.toString());
    assertEquals("Employee Name: herman\n" + 
            "Employee ID: 1\n" +
            "Employee Pay Rate: 15\n" + 
            "Employee's Hours this Week: 0", herman.toString());
    assertEquals("Employee Name: gabriel\n" + 
            "Employee ID: 2\n" +
            "Employee Pay Rate: 20\n" + 
            "Employee's Hours this Week: 0", gabriel.toString());
    assertEquals("Employee Name: tabitha\n" + 
            "Employee ID: 3\n" +
            "Employee Pay Rate: 22\n" + 
            "Employee's Hours this Week: 0", tabitha.toString());
    assertEquals("Employee Name: phil\n" + 
            "Employee ID: 4\n" +
            "Employee Pay Rate: 25\n" + 
            "Employee's Hours this Week: 0", phil.toString());
    assertEquals("Employee Name: joanna\n" + 
            "Employee ID: 5\n" +
            "Employee Pay Rate: 26\n" + 
            "Employee's Hours this Week: 0", joanna.toString());
    
    
  }
  
  
  
  
  }


