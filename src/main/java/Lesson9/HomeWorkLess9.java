package Lesson9;

public class HomeWorkLess9 {
    int a = 1;
    static int b = 2;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        HomeWorkLess9 t = new HomeWorkLess9();
        t.abc(3);

    }
}
