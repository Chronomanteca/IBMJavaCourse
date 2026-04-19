// TestEncapsulation class to test the Employee class
package chrono.ibmcourse.OOPs.Module1.BuildYourOwnConstructor;

public class TestEncapsulation{

    public static void main(String[] args) {
        // Step 1: Create two instances of the Employee class
        // One using the parameterized constructor and one using default constructor with setters

        Employee employee1 = new Employee();
        Employee employee2 = new Employee("George", 32, 200);
        
        // Step 2: Print details of both employees

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        
        // Step 3: Try setting invalid values (null name, age outside range, negative salary)
        // and see if your validation works

        employee1.setAge(0);
        employee1.setSalary(-1);
        employee1.setName("");
        
        // Step 4: Give both employees a 10% raise and display their details again

        employee1.giveRaise(0.1);
        employee2.giveRaise(0.1);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        
        // Step 5: Clone the first employee and display the cloned employee details
        // Hint: Use try-catch block to handle CloneNotSupportedException
        // Employee clonedEmployee = (Employee) employee1.clone();
        Employee employee3 = new Employee();

        try{
            employee3 = (Employee)employee1.clone();
            System.out.println((employee3.toString()));
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        
        // Step 6: Modify the original employee and verify that the clone remains unchanged
        // This demonstrates that cloning creates a separate object

        employee1.setName("Harold");
        System.out.println(employee1.toString());
        System.out.println(employee3.toString());
        
        // Step 7: Create a method that compares the salaries of two employees
        // and returns the name of the employee with the higher salary
        // If salaries are equal, return "Equal salaries"

        employee1.setSalary(200);
        employee2.setSalary(20);
        System.out.println(employee1.compareSalaries(employee2));
    }
}
