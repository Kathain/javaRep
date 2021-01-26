package Lesson6;

public class MethodOverloading3 {
    int sum(int i1, int i2){
        return i1 + i2;
    }


    String sum (String s1, String s2){
        return s1 + s2;
    }
}

class MethodOverloadingTest3{
    public static void main(String[] args) {
        MethodOverloading3 mO3 = new MethodOverloading3();

        int a = mO3.sum(5,7);
        System.out.println(a);
        String s = mO3.sum("Privet", "Moi drug");
        System.out.println(s);
    }
}
