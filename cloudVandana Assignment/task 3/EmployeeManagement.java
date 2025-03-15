import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary = salary;
    }
    public void displayDetails(){
        System.out.println("ID:"+id +",Name:" +name +",Salary:$"+salary);
    }
}
public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"Raju",23000));
        employees.add(new Employee(102,"Ravi",26000));
        employees.add(new Employee(103,"Ramesh",21000));
        employees.add(new Employee(104,"suresh",33000));
        System.out.println("Employee Details");
        for(Employee emp:employees){
        emp.displayDetails();
       }
    }
}