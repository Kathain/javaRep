package Lesson13;

public class Month {
    int numMonth;
    Month(int numMonth){
        this.numMonth = numMonth;
    }

    public static void main(String[] args) {
        Month nM = new Month(6);

        switch (nM.numMonth){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("В данном месяце 31 день");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("В данном месяце 30 дней");
                break;
            case 2 :
                System.out.println("В это месяце 28 дней");
        }
    }
}

