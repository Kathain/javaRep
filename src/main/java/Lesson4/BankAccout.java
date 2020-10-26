package Lesson4;

public class BankAccout {

    int id = 1;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccout myAccount = new BankAccout(); //создали обьект(конструктор)
        BankAccout YourAccount = new BankAccout(); //создали обьект(конструктор)
        BankAccout HisAccount = new BankAccout(); //создали обьект(конструктор)

        myAccount.id = 1;
        myAccount.name = "Anna";
        myAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Koka";
        YourAccount.balance = 33.22;

        HisAccount.id = 3;
        HisAccount.name = "Oleg";
        HisAccount.balance = 22222;


        System.out.println(YourAccount.id);


    }
}

class BankAccountTest{
    public static void main(String[] args) {

        BankAccout myAccount = new BankAccout(); //создали обьект(конструктор)
        BankAccout YourAccount = new BankAccout(); //создали обьект(конструктор)
        BankAccout HisAccount = new BankAccout(); //создали обьект(конструктор)

        myAccount.id = 1;
        myAccount.name = "Anna";
        myAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Koka";
        YourAccount.balance = 33.22;

        HisAccount.id = 3;
        HisAccount.name = "Oleg";
        HisAccount.balance = 22222;


        System.out.println(myAccount.id);


    }










}
