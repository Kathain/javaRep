package Lesson12;

import Lesson11.Student;

public class HomeWorkLess12 {
    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Studenti " + st1 + " и " + st2 + "ravni");
        } else {
            System.out.println("Studenti NE RAVNI!");
        }
    }

    public static void method2(Student st1, Student st2) {

        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена студенттов курсы и оценки одиланковые");
                } else {
                    System.out.println("Имена и курсы одинаковые - оценки разные");
                }
            }
        } else {
            System.out.println("Имена различаются");
        }
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3, 4.3);
        Student st2 = new Student("Ivan", 3, 2.8);
        method1(st1, st2);
        method2(st1, st2);
    }
}
