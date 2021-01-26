package Lesson6;

public class MethodOverloading {   //тут мы создали новый класс
    void showInt(int i1){  //метод который будет показывать именно значение инт
        System.out.println(i1);
    } //тут создаем методы

    void showBoolean(boolean b1){ //метод создаем который будет показывать булеан (все методы начинающиеся с void ничего не возвращают)
        System.out.println(b1);
    }

    void showString(String s1){ //метод создаем который будет показывать стринг
        System.out.println(s1);
    }

}

class MethodOverloadingTest{   //создаем новый класс
    public static void main(String[] args) { //создаем метод main а внутри него создаем обьект класса overloading
    MethodOverloading mO = new MethodOverloading(); //тут конструктор дефолтный поэтому в параметре ничего не пишем
        mO.showInt(100); //вызываем метод инт- это вариант 1

        int a = 500;
        mO.showInt(a); // вызываем метод инт- это вариант 2

        boolean b = true;
        mO.showBoolean(b); //вызываем метод булеан

        String s = "Privet!"; //вызываем метод стринг
        mO.showString(s);
    }
}
