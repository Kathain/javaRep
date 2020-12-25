package Lesson4;

public class Car {
    String color = "red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = car1; //в данном случае у нас не создается новый обьект - а создается переменная с таким же ардесом и  они ссылаются на один обьект
        car1.color = "black";
        car1.engine = "V8";


        System.out.println(new Car().color);  //создаю новый обьект класса Car и не передаю его адрес перемнной и хочу увидеть его цвет но тк тут нет адреса - мы не сможем к нему больше обратится
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }


}
