package Lesson12;

public class Car {

    int engine;
    int door;

    Car(int engine, int door){
        this.engine = engine;
        this.door = door;
    }
}


class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car(3,4);
        Car c2 = new Car(2,5);

        if(c1.engine > c2.engine){
            if(c1.door > c2.door){
                System.out.println("Moshnost motora i kolichesto dverei u pervoi mashini bolshe");}
            else{
                System.out.println("Moshnost motora u 1 mashini bolsche a kolichesto dverei menche");}}
            else
            {System.out.println("Moshnost motora u 1 mashini mensche");}





    }
}