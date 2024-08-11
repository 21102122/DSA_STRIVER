package inheritance;

public class exp4 {
    public static class  Employee{
        private int salary;

        public Employee(int salary) {
            this.salary = salary;
        }

        public void work(){
            System.out.println("working as an employee");

        }

        public int getSalary() {
            return salary;
        }
    }
    public static  class  HRManager extends Employee{

        public HRManager(int salary) {
            super(salary);
        }

        @Override
        public void work() {
            System.out.println("\nManaging employee");
        }
        public void addEmployee(){
            System.out.println("\nAdding new employee!");
        }
    }
    public static void main(String[] args) {
//        Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

        Employee employee = new Employee(400000);
        HRManager hrManager = new HRManager(700000);

        employee.work();
        System.out.println("Employee salary"+employee.getSalary());
        hrManager.work();
        System.out.println("manager Salary"+hrManager.getSalary());
        hrManager.addEmployee();
    }
}
