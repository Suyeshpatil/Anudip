package assignment9;

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String firstName, String lastName, double monthlySalary) { // constructor using fields
		this.firstName=firstName;
		this.lastName=lastName;
		if(monthlySalary>=0) {                                               //condition
			this.monthlySalary=monthlySalary;
		}
	}
//getter and setter is use to get the value
	public String getFirstName() {                                       
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary>=0) {
			this.monthlySalary = monthlySalary;	
		}
	}
public class EmployeeTest{

	public static void main(String[] args) {
		Employee suyesh = new Employee("Suyesh", "Patil", 15000);										//object suyesh
        Employee sanket = new Employee("Sanket", "Patil", 20000);									  //object sanket
        System.out.println(suyesh.getFirstName() + "'sh monthly salary is " + suyesh.getMonthlySalary());    
        System.out.println(sanket.getFirstName() + "'s monthly salary is " + sanket.getMonthlySalary());
        suyesh.setMonthlySalary(suyesh.getMonthlySalary() * 1.2);                                     
        sanket.setMonthlySalary(sanket.getMonthlySalary() * 1.2);
        System.out.println("After increment in salary");
        System.out.println(suyesh.getFirstName() + "'s monthly salary is " + suyesh.getMonthlySalary());
        System.out.println(sanket.getFirstName() + "'s monthly salary is " + sanket.getMonthlySalary());
    }
  }
}



/*
 * Output
Suyesh's monthly salary is 15000.0
Sanket's monthly salary is 20000.0
After increment in salary
Suyesh's monthly salary is 18000.0
Sanket's monthly salary is 24000.0
*/
