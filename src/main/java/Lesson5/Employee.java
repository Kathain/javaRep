package Lesson5;

public class Employee {   //тут перечисляем переменные
    int id;
    String surname;
    int age;
    double salary;
    String department;

    public Employee(int id2, String surname2, int age2, double salary2, String department2) {    //тут создаем конструктор (можно без слова public)
        id = id2;   // далее присваеваем значение параметров его переменным (его атрирутам)
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double uvelichenieZarplat() { //тут мы пишем метод увеличения зарплаты (он не принимает никаких параметров и просто увеличивает зп в двое)
        salary *= 2;
        return salary;
    }

}


class EmployeeTest{     //тут создаю новый класс
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ivanov", 25,555.55,"IT");    //тут создается два обьекта класса Employe - emp1 и emp2
        Employee emp2 = new Employee(2,"Petrov", 30, 888.88, "Sales"); // в скобках пишем все значения переменных

        emp1.uvelichenieZarplat();  // с помощью первой перемнной emp1 вызвваю метод увеличения зарплаты
        System.out.println("Novaya zarplata rabotnika " + emp1.surname + ": " + emp1.salary); //и вывожу на экран итог

        double newSalary = emp2.uvelichenieZarplat();  // с помощью второй перемнной emp2 вызвваю метод увеличения зарплаты
        System.out.println("Novaya zarplata rabotnika " + emp2.surname + ": " + newSalary); //и вывожу на экран итог






    }
}
