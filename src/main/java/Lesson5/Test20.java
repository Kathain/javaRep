package Lesson5;

public class Test20 {  //тут создаем метод

        int summa(int a, int b, int c){  //summa это название метода, int тип данных того что будет возвращать наш метод, int a , b, c - это параметр метода
        int result = a + b + c;
        return result;              //return возвращает нам результат сложения который выше в relult. Return result - всегда должно быть последним выражением
                                        //тип данных того что мы даем и того что возвращаем должен быть один и тот же, если int то int

    }

   // int summaTrehChisel = sum(10,5,12); - вызов метода . Пишется имя и его параметры
}

class Test21{
    public static void main(String[] args) {
        Test20 t = new Test20();    // создаем обьект
        int summaTrehChisel = t.summa(5,10,15);  // вызываем метод   // a,b,c и числа - это тут уже аргументы
        System.out.println(summaTrehChisel);  // выводим результат метода на экран
    }
}
