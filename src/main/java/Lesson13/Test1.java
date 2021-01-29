package Lesson13;

public class Test1 {

}

class Student{
    int grade;
    Student (int grade){
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);
        switch (st1.grade){
            case 2:
                System.out.println("Студент двоешник");
                break;
            case 3:
                System.out.println("Студент троешник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;

            default:
                System.out.println("Оценка не верна");


        }











//        if(st1.grade == 2){
//            System.out.println("Студент двоешник");
//        }
//        else if(st1.grade == 3){
//            System.out.println("Студент троешник");
//        }
//         else if(st1.grade == 4){
//            System.out.println("Студент хорошист");
//        }
//         else if(st1.grade == 5){
//            System.out.println("СТудент отличник");
//        }
//
//         else {
//            System.out.println("оценка не верна");
//        }
    }
}
