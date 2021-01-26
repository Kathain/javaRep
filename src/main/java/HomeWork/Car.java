package HomeWork;

public class Car {
    String color;
    String enginel;
    int door;

   public Car(String color, String enginel, int door){
        this.color = color;
        this.enginel = enginel;
        this.door = door;
    }
}

class CarTest {

    void changeDoorCount(Car car1, int door) {
        car1.door = door;
    }

    void changeColor(Car car1, Car car2){
        String color = car1.color;
        car1.color = car2.color;
        car2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("Black", "B200", 5);
        Car car2 = new Car("Red", "V60", 2);
        ct.changeDoorCount(car1,8);
        ct.changeColor(car1,car2);
        System.out.println("Информация о первой машине " + car1.color + " мотор " + car1.enginel + "Кличество дверей = " + car1.door);
        System.out.println("Информация о первой машине " + car2.color + " мотор " + car2.enginel + "Кличество дверей = " + car2.door);


    }
}
