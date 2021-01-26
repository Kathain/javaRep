package Lesson6;

public class homeWorkLes6 {
    int sum(int a, int b, int c, int d) {
        return a + b + c + d;

    }

    int sum(int a, int b, int c){
        return a + b + c;
    }

    int sum(int a , int b){
        return a + b;
    }

    int sum(int a){
        return 0;
    }

    int sum(){
        return 0;
    }
}
    class homeWorkTest {
    public static void main(String[] args) {

            homeWorkLes6 hW = new homeWorkLes6();
            System.out.println(hW.sum(2,3,5,9));
            System.out.println(hW.sum(2,4,3));
            System.out.println(hW.sum(2,8));
            System.out.println(hW.sum(8));
            System.out.println(hW.sum());

        }


        }




