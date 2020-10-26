package Lesson4;

public class Student {
        int numTicket;
        String firstName;
        String lastName;
        int yearLesson;
        int avMathRating;
        int avEconRating;
        int avForeignRating;
                    }


                    class StudentTest {
    public static void main(String[] args) {



        Student Iwanow = new Student();
        Student Allianin = new Student();
        Student Kikin = new Student();

        Iwanow.avMathRating = 3;
        Iwanow.avEconRating = 5;
        Iwanow.avForeignRating = 4;

        Allianin.avMathRating = 5;
        Allianin.avEconRating = 4;
        Allianin.avForeignRating = 5;

        Kikin.avMathRating = 4;
        Kikin.avEconRating = 2;
        Kikin.avForeignRating = 4;

        double balanceIwanowRating = Iwanow.avEconRating + Iwanow.avForeignRating + Iwanow.avMathRating;
        double balanceAllianinRating = Allianin.avEconRating + Allianin.avMathRating + Allianin.avForeignRating;
        double balanceKikinRating = Kikin.avEconRating + Kikin.avForeignRating + Kikin.avMathRating;

        System.out.println("Iwanow ocenka srednya - " + balanceIwanowRating / 3);
        System.out.println("Allianin ocenka srednya - " + balanceAllianinRating / 3);
        System.out.println("Kikin ocenka srednya - " + balanceKikinRating / 3);






    }





}

