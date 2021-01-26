package Lesson9;

public class Car {
    String color;  // имеет 3 переменные наш класс
    String engine;
    static int count; // count будет считать количество машин которые мы создали в конструкторе
    Car(String color2, String engine2){ //создаю конструктор
        count++;
        color = color2;
        engine = engine2;

    }
    public void showColor() { // создаем метод войд и он ничего в себя не принимает и показывает цвет машины
        System.out.println("Цвет машины: " + "color");
    }
    public void changeColor (String color3){ // еще один метод Измения цвета и принимает цвет на который хотите что бы изменилось
        System.out.println("Цвет машины изменился");
        int cena = 5000;
        color = color3;
        cena += 1000;

    }
}
