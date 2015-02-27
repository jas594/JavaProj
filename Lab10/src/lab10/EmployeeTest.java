/* Name: Jason Sarnoff
 TU ID: 914983482
 Date: 5/6/14
 Course: 1068 Sec 5
 Lab #10
 The purpose of this lab is to create a series of classes to show how hierarchy 
 and inheritance is useful. A person class was created strictly for the name of
 the employee. The Employee class was derived/extended from Person and added 3
 more instance variables with setters and getters. Constructors were then created
 in Employee to be used in the EmployeeTest class, containing the main method. 
 EmployeeTest passed values into the parameters of each new object based on the
 constructors in class Employee and then called the writeOutput() method to 
 present all the information of that employee.
 */

package lab10;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeOne = new Employee (50000.0);
        employeeOne.writeOutput();
        Employee employeeTwo = new Employee (2000);
        employeeTwo.writeOutput();
        Employee employeeThree = new Employee ("347649985");
        employeeThree.writeOutput();
        Employee employeeFour = new Employee (20000, 2003);
        employeeFour.writeOutput();
        Employee employeeFive = new Employee (60000.0, "536783346");
        employeeFive.writeOutput();        
        Employee employeeSix = new Employee (2010, "457345565");
        employeeSix.writeOutput();                
        Employee employeeSeven = new Employee ("Chris", "345770094");
        employeeSeven.writeOutput();                
        Employee employeeEight = new Employee ("John", 100000.0);
        employeeEight.writeOutput();        
        Employee employeeNine = new Employee ("Tina", 25000.0, 2014, "123679989");              
        employeeNine.writeOutput();                
    }
}

class Person {

    private String name;

    public Person() {
        name = "No name yet.";
    }

    public Person(String initialName) {
        name = initialName;        
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
    }

}

//new class that adds onto class 'Person'
class Employee extends Person {

    private double salary;
    private int hireDate;
    private String ssn;

    Employee(double money) 
    {
        salary = money;
    }
    
    Employee(int dateOfHire) 
    {
        hireDate = dateOfHire;
    }
    
    Employee(String social)
    {
        ssn = social;
    }
    
    Employee(double money, int dateOfHire)
    {
        salary = money;
        hireDate = dateOfHire;
    }
    
    Employee(double money, String social)
    {
        salary = money;
        ssn = social;
    }
    
    Employee(int dateOfHire, String social)
    {
        hireDate = dateOfHire;
        ssn = social;
    }
    
    Employee(String initialName, String social)
    {
        super(initialName);
        ssn = social;
    }
        
    Employee(String initialName, double money)
    {
        super(initialName);
        salary = money;
    }
    Employee(String initialName, double money, int dateOfHire, String social)
    {
        super(initialName);
        salary = money;
        hireDate = dateOfHire;
        ssn = social;
    }

    //set methods
    void setsalary(double newSalary) {
        salary = newSalary;
    }

    void sethireDate(int newHireDate) {
        hireDate = newHireDate;
    }

    void setssn(String newSSN) {
        ssn = newSSN;
    }

    //get methods 
    double getsalary() {
        return salary;
    }

    int gethireDate() {
        return hireDate;
    }

    String getssn() {
        return ssn;
    }
    
   //other methods
   void writeName() {
        super.writeOutput();      
   }

    void writeSalary() {
        System.out.println(salary);
    }

    void writeHireDate() {
        System.out.println(hireDate);
    }

    @Override
    public void writeOutput() {
        System.out.println("This employee's record contains the following: ");
        writeName();
        System.out.println("\tHire Date: " + gethireDate());
        System.out.println("\tSalary: " + getsalary());
        System.out.println("\tSSN: " + getssn());             
    }

}