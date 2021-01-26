package Lesson11;

public class Employee {
    public String name; // переменная о имени
    public double salary; // переменная о зп

    Employee(String name, double salary){ // создаем конструктор
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a){ // тут создали метод увеличения суммы в 2 раза
        a*=2;
        return a;
    }

    public double zp2(){ // тут работаем с самой зп а не с каким то методом
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55); // тут создали обьект класса имплой
       double d = emp1.uvelichitel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println(emp1.salary);


    }
}
