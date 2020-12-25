package Lesson4;

public class Student {
    int numberStud;
    String nameStud;
    String surnameStud;
    int year;
    double ratingMath;
    double ratingEkonomik;
    double getRatingEnglish;

}

class StudentTest{

    double srednArifmOcenka(Student st) {
        double sredOcenka = (st.getRatingEnglish + st.ratingEkonomik + st.ratingMath) / 3;
        System.out.println("SrednyaOcenka" + sredOcenka);
        return sredOcenka; }


        public static void main (String[]args){


            Student stud1 = new Student();
            Student stud2 = new Student();
            Student stud3 = new Student();

            stud1.numberStud = 1;
            stud1.nameStud = "Ivan";
            stud1.surnameStud = "Kulikov";
            stud1.year = 2003;
            stud1.ratingMath = 3.8;
            stud1.ratingEkonomik = 4.3;
            stud1.getRatingEnglish = 4.6;


            stud2.numberStud = 2;
            stud2.nameStud = "Kola";
            stud2.surnameStud = "Onohin";
            stud2.year = 2007;
            stud2.ratingMath = 4.7;
            stud2.ratingEkonomik = 3.2;
            stud2.getRatingEnglish = 3.8;

            stud3.numberStud = 3;
            stud3.nameStud = "Nikita";
            stud3.surnameStud = "Kohin";
            stud3.year = 2005;
            stud3.ratingMath = 3.5;
            stud3.ratingEkonomik = 4.8;
            stud3.getRatingEnglish = 4.4;


            System.out.println("Srednya ocenka Kolokova: " + (stud1.getRatingEnglish + stud1.ratingEkonomik + stud1.ratingMath) / 3);
            System.out.println("Srednya ocenka Onohina: " + (stud2.getRatingEnglish + stud2.ratingEkonomik + stud2.ratingMath) / 3);
            System.out.println("Srednya ocenka Kohina: " + (stud3.getRatingEnglish + stud3.ratingEkonomik + stud3.ratingMath) / 3);

            StudentTest sTest = new StudentTest();
            sTest.srednArifmOcenka(stud1);
            sTest.srednArifmOcenka(stud2);
            sTest.srednArifmOcenka(stud3);
        }




    }

