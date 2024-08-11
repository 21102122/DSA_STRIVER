package Abstract;

public class exp2 {
    //    Write a Java program to create an abstract class Employee with abstract
//    methods calculateSalary() and displayInfo(). Create subclasses Manager and
//    Programmer that extend the Employee class and implement the respective methods
//    to calculate salary and display information for each role.

//  question link    https://www.w3resource.com/java-exercises/index-abstract.php#:~:text=Write%20a%20Java%20program%20to%20create%20an%20abstract%20class%20Employee%20with%20abstract%20methods%20calculateSalary()%20and%20displayInfo().%20Create%20subclasses%20Manager%20and%20Programmer%20that%20extend%20the%20Employee%20class%20and%20implement%20the%20respective%20methods%20to%20calculate%20salary%20and%20display%20information%20for%20each%20role.


    public static abstract class Employee{
        protected String name;
        protected double baseSalary;

        public Employee(String name, double baseSalary) {
            this.name = name;
            this.baseSalary = baseSalary;
        }

        public abstract double calculateSalary();
        public abstract void displayInfo();

    }
    public static class Manager extends Employee{
        private double bonus;
        public Manager(String name, double baseSalary, double bonus) {
            super(name, baseSalary);
            this.bonus = bonus;
        }

        @Override
        public double calculateSalary() {
            return baseSalary+ bonus;
        }

        @Override
        public void displayInfo() {
            System.out.println("manager name: "+name);
            System.out.println("Base Salary: &"+baseSalary);
            System.out.println("Bonus: $"+bonus);
            System.out.println("Total salary: $"+calculateSalary());
        }
    }
    public static class Programmer extends Employee{

        private int overTimeHrs;
        private double hourlyRate;
        public Programmer(String name, double baseSalary, int overTimeHrs,double hourlyRate) {
            super(name, baseSalary);
            this.hourlyRate = hourlyRate;
            this.overTimeHrs = overTimeHrs;
        }

        @Override
        public double calculateSalary() {
            return baseSalary+(overTimeHrs*hourlyRate);
        }

        @Override
        public void displayInfo() {
            System.out.println("programer name is: "+name);
            System.out.println("baseSalary: "+baseSalary);
            System.out.println("overtime hours: "+overTimeHrs);
            System.out.println("hourly Rate"+hourlyRate);
            System.out.println("Total salary:&"+calculateSalary());
        }
    }


    public static void main(String[] args) {

        Employee manager = new Manager("rohan rathod",60000,1000);
        Employee programmer = new Programmer("hariom sahu (mernStack Developer)",110000,20,25);


        manager.displayInfo();
        System.out.println("------------------------------------");
        programmer.displayInfo();
    }
}
