//Invalid Salary Exception
//Define a custom exception InvalidSalaryException.
//Create an Employee class where you set the employee's salary. If the salary is negative or exceeds
// a certain threshold (e.g., 100,000), the custom exception should be thrown.
//Test this with multiple salary values and handle the exception gracefully.

package Exception;

public class Employee {
    double salary =0;
    String name;
    String department;

    public Employee (String name, String department){
        this.name= name;
        this.department = department;
    }

    public void sentSalary(double amount) throws InvalidSalaryException{
        if (amount>0 && amount<100000){
            System.out.println("salary sent Succesfully to employee "+amount);
            salary += amount;
        } else {
            throw new InvalidSalaryException("the amount you have given is incorrect");
        }
    }

    public void transferSalaryToBank(double rupees) throws InvalidSalaryException{
        if (rupees>0 && rupees<=salary){
            System.out.println("Transfer Succesfull! of amount : "+rupees);
            salary -= rupees;
            System.out.println("salary remain now: "+salary);
        } else {
            System.out.println("salary is at this point now:"+salary);
            throw new InvalidSalaryException("inavlid salary input");
        }

    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ashish","IT");
        try{
            e1.sentSalary(50000);
            e1.transferSalaryToBank(60000);
        } catch (InvalidSalaryException e) {
            e.printStackTrace();
        }

        try{
            e1.transferSalaryToBank(40000);
        } catch (InvalidSalaryException e) {
            e.printStackTrace();
        }
    }
}

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String m){
        super(m);
    }
}
