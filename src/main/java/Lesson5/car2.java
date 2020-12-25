package Lesson5;

public class car2 {
    String color;
    String engine;
    int speed;

        int gaz(int skorost) {
        speed+=skorost;
        return speed;
        }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo(){    //тут мы выбираем тип данных void тк он ничего не возвращает (он пустой)
        System.out.println("Cvet- " + color + " motor- " + engine + " skotost- " + speed);
    }
}

class Car2Test{    // в этом классе я хочу вызывать метод
public static void main(String[]args){
    car2 c1 = new car2(); //создаем обьект
    c1.color = "white";
    c1.engine = "V6";
    c1.speed = 60;

    c1.showInfo();
    c1.gaz(20);  //тут прибавили скорость
    c1.showInfo();
    c1.tormoz(80); //тут полностью торможу
    c1.showInfo();





        }

        }
