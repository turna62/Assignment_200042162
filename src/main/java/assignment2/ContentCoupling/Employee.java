package ContentCoupling;

public class Employee {
    public String name;
    public int ID;
    public double salary;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Rhidi";
        employee.ID = 54056;
        employee.salary = 5000000;

        System.out.println(employee.name + "\n" + employee.ID + "\n" + employee.salary);
    }
}
