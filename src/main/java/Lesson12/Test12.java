package Lesson12;

public class Test12 {

    void abc(){
        String str;
        int a = 5;
        if (a >= 10){
            str = "Privet";
        }
        if (a < 10){
            str = "Poka";
        }
        else {
            str = "jfdjfdhjfd"; }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int maximum = (a > b) ? a : b;
        System.out.println(maximum);
    }
}
