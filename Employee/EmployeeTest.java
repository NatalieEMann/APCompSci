package Employee;
/**
 *
 * @author mysti
 */
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList emps = new ArrayList();
        emps.add(new Employee("Robert Richter", 5000));
        emps.add(new Employee("Zenadine Zidane", 10000));
        
        
        for (int i = 0; i < emps.size(); i++) {
            System.out.println(emps.get(i));
        }
        System.out.println("----------------------------------------------------------");
        emps.add(new Employee("Sylvester Stallone", 10));
        for (int i = 0; i < emps.size(); i++) {
            System.out.println(emps.get(i));
        }      
        emps.remove(0);
        for (int i = 0; i < emps.size(); i++) {
            System.out.println(emps.get(i));
        }
        System.out.println("---------------------------------------");
        emps.set(0, new Employee("Paul Kane", 2000000));
        for (int i = 0; i < 10; i++) {
            System.out.println(emps.get(i));
        }
        System.out.println("---------------------------------------------------------");
        Employee T1 = (Employee)emps.get(0);
        Employee T2 = (Employee)emps.get(1);
        if(T1.getSalary()>T2.getSalary()){
            System.out.println(T1.getName() + " makes more $");
        } else if(T2.getSalary()>T1.getSalary()){
            System.out.println(T2.getName() + " makes more $");
        } else if(T1.getSalary() == T2.getSalary()){
            System.out.println(T1.getName() + "and" + T2.getName() + "is equal");
        }
        for(int i = 0; i <= emps.size(); i++) {
            emps.remove(0);
        }
        System.out.println("After removing ----------------------------------------");
        for (int i = 0; i < emps.size(); i++) {
            System.out.println(emps.get(i));
        }
        System.out.println("----------------------------------------------------");
    }
}

