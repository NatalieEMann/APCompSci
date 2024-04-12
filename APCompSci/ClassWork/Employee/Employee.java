package APCompSci.ClassWork.Employee;

public class Employee {
    //static variable to keep track of total employees and salaries

    public static double totSal = 0;
    public static int totEmp = 0;

    //instance variables
    private double salary;
    private String name;

    /**
     * constructors
     */
    public Employee() {
        totEmp++;
    }

    public Employee(String na, double sal) {
        //Increase the total number of employees
        totEmp++;
        //Increase the payroll
        totSal = totSal + sal;

        name = na;
        salary = sal;
    }
    //Accessors

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        salary += salary * byPercent / 100;
    }

    public String toString() {
        return name + " " + salary;
    }

    //finalize method
    public void finalize() {
        totSal -= salary;
        totEmp--;

        //called when an object gets destroyed
    }

    /**
     * setSalary preconditions: sal >0
     *
     * @param sal salary which must be 0 or positive
     *
     */
    public void setSalary(double sal) throws IllegalArgumentException {
        if (sal >= 0) {
            salary = sal;
        } else {
            throw new IllegalArgumentException("Can't have negative salaries");
        }
    }

    /**
     *
     * @return
     */
    public int getEmployees() {
        return totEmp;
    }

}
