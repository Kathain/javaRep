package Lesson6;

public class Employee {

    Employee(int id2, String surname2, int age2){
        id = id2;
        surname = surname2;
        age = age2;
    }

    public Employee(String surname2, int age2){
        surname = surname2;
        age = age2;
    }

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
         id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }




    int id;
    String surname;
    int age;
   private double salary;
    String department;
}
class EmplayeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Bolgarin", 27); //вызывается конструктор c параметрами
        System.out.println(emp.id);

        Employee emp1 = new Employee("Petrov", 21);
        System.out.println(emp1.department);

        Employee emp2 = new Employee(2,"Sidorov",40,500,"IT");
        System.out.println(emp2.department);
    }
}
