package Lesson6;

public class Employee20 {
    Employee20(int id2, String surname2, int age2) {
       this(surname2,age2); //this значит что мы внутри конструктора вызываем overload конструктор
        id = id2;
    }

    Employee20(String surname3, int age3) {
        surname = surname3;
        age = age3;
    }

    Employee20(int id4, String surname4, int age4, double salary4, String department4) {
        this(surname4,age4);
         id = id4;
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}
class EmplayeeTest20{
    public static void main(String[] args) {
        Employee20 emp = new Employee20(1,"Bolgarin", 27); //вызывается конструктор c параметрами
        System.out.println(emp.id);

        Employee20 emp1 = new Employee20("Petrov", 21);
        System.out.println(emp1.department);

        Employee20 emp2 = new Employee20(2,"Sidorov",40,500,"IT");
        System.out.println(emp2.department);
    }
}



