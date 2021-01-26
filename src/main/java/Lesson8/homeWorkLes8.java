package Lesson8;

public class homeWorkLes8 {

    static double umnojenie(double a, double b, double c) { //берем в параметры три числа и умножал и возвращал их результат
        return a * b * c;  //данный метод умножаем 3 числа из параметра метода и возвращает их произведение


    }

    static void delenie(int a, int b) {  //данный метод делит первое число на второе число но ничего не возвращает, только выводит на экран целое частное и остаток
        System.out.println("Целое число = " + a / b + "; Остаток = " + a % b);
    }
}

class Zadacha1Test {
    public static void main(String[] args) {
        System.out.println(homeWorkLes8.umnojenie(2,3,4));
        homeWorkLes8.delenie(9,2);
        System.out.println(homeWorkLes8.umnojenie(2.3,3.3,5.6));
        homeWorkLes8.delenie(15,4);
    }
}
