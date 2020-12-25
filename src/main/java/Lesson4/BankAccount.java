package Lesson4;

public class BankAccount {        //BankAccount это название класса , любой класс является типом даннымх в java как например (int,String
    int id;
    String name;
    double balance;  //этот класс используется как шаблон банковского счета

    double popolnenieScheta(double summaPopolnenia) {
        balance+= summaPopolnenia;
        return balance;
    }

        double snyatieSoScheta(double summeUmenieschenia){
            balance-=summeUmenieschenia;
            return balance;
        }

        void ShowinfoBalance() {
            System.out.println("Konechnyi balans na schete: " + balance);
        }






    }





class BankAccountTest{   //а тут уже проводятся операции над обьектами класса BankAccounnt
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();      // MyAccount это имя переменной , а new BankAccount это значение  переменной как b = 1;
        // new BankAccount вызывает конструктор - создает обьект
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Mike";
        MyAccount.balance = 2.35;

        YourAccount.id = 2;
        YourAccount.name = "Soul";
        YourAccount.balance = 1909.22;

        HisAccount.id = 3;
        HisAccount.name = "Lolika";
        HisAccount.balance = 18.76;

        System.out.println(MyAccount.name);
        YourAccount.popolnenieScheta(150);
        MyAccount.ShowinfoBalance();

    }


}
