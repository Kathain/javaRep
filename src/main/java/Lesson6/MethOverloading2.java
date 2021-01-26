package Lesson6;


// ТУТ РЕЧЬ ПОЙДЕТ О ТОМ КАК РЕАЛЬНО НУЖНО ВЫЗЫВАТЬ МЕТОД OVERLOADING С ОДНИМ НАИМЕНОВАНИЕМ

public class MethOverloading2 {
    void show(int i2){  //метод который будет показывать именно значение инт
        System.out.println(i2);
    }

    void show(boolean b2){ //метод создаем который будет показывать булеан (все методы начинающиеся с void ничего не возвращают)
        System.out.println(b2);
    }

    void show(String s2){ //метод создаем который будет показывать стринг
        System.out.println(s2);
    }

}

class MethOverlTest2{   //создаем новый класс
    public static void main(String[] args) { //создаем метод main а внутри него создаем обьект класса overloading
        MethOverloading2 m1 = new MethOverloading2(); //тут конструктор дефолтный поэтому в параметре ничего не пишем
        m1.show(100); //вызываем метод инт- это вариант 1

        int aa = 500;
        m1.show(aa); // вызываем метод инт- это вариант 2

        boolean bb = true;
        m1.show(bb); //вызываем метод булеан

        String ss = "Privet!"; //вызываем метод стринг
        m1.show(ss);
    }
}


