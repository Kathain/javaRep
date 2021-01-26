package Lesson6;

public class homeWorkStudLes6 {

    homeWorkStudLes6(int numberStud2, String nameStud2, String surnameStud2, int year2, double ratingMath2, double ratingEkonomik2, double getRatingEnglish2) {
        numberStud = numberStud2;
        nameStud = nameStud2;
        surnameStud = surnameStud2;
        year = year2;
        ratingMath = ratingMath2;
        ratingEkonomik = ratingEkonomik2;
        getRatingEnglish = getRatingEnglish2;

    }

    homeWorkStudLes6(int numberStud2, String nameStud2, String surnameStud2, int year2){
        numberStud = numberStud2;
        nameStud = nameStud2;
        surnameStud = surnameStud2;
        year = year2;
    }

    homeWorkStudLes6(){
    }


    int numberStud;
    String nameStud;
    String surnameStud;
    int year;
    double ratingMath;
    double ratingEkonomik;
    double getRatingEnglish;
}
class homeWorkTestStud {
    public static void main(String[] args) {
        homeWorkStudLes6 studInf = new homeWorkStudLes6(8,"Ivan", "Olegin",1,3,3,2);
        System.out.println("Information about Ratings: " + studInf.getRatingEnglish + studInf.ratingEkonomik + studInf.ratingMath);
        homeWorkStudLes6 studInf1 = new homeWorkStudLes6(2,"Kolia", "Kokin", 3);
        System.out.println(studInf1.surnameStud);
        homeWorkStudLes6 studInf2 = new homeWorkStudLes6();
        System.out.println(studInf2);
    }


}
