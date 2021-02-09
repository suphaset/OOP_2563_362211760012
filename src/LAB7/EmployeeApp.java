package LAB7;

public class EmployeeApp {
    public static void main(String[] args) {

        //use default constructer
        Employee emp1 = new Employee();
        //assign constructer
        Employee emp2 = new Employee("suphaset kaseothasi",23,"student",18000);

        //call displayData()
        emp1.displayData();
        emp2.displayData();

        //System.out.println(emp2.name);
        //assign data to emp1
emp1.setName("suphaset kaseothasi");
emp1.setAge(23);
emp1.setPosition("Dean");
emp1.setSalary(180000);

emp1.displayData();
System.out.println("Emp name: "+emp1.getName());
    }


}
