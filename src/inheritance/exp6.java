package inheritance;

public class exp6 {

//    Write a Java program to create a class known as Person with methods called
//    getFirstName() and getLastName(). Create a subclass called Employee that
//    adds a new method named getEmployeeId() and overrides the getLastName()
//    method to include the employee's job title.

    public  static class Person{
        public String firstName, lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
    public static class EMPLOYEE extends Person{
        public String EMPLOYEEID,JOBTITLE;

        public EMPLOYEE(String firstName, String lastName, String EMPLOYEEID, String JOBTITLE) {
            super(firstName, lastName);
            this.EMPLOYEEID = EMPLOYEEID;
            this.JOBTITLE = JOBTITLE;
        }

        public String getEMPLOYEEID() {
            return EMPLOYEEID;
        }

        @Override
        public String getLastName() {
            return super.getLastName()+","+JOBTITLE;
        }
    }

    public static void main(String[] args) {

        EMPLOYEE employee1 = new EMPLOYEE("Rohan","Rathod","123456","Software engineer");
        System.out.println(employee1.getFirstName()+" "+employee1.getLastName()+" "+"("+employee1.getEMPLOYEEID()+")");

    }
}
