package Lesson1;

import java.util.Scanner;

public class BasicMethods {
    int Test (int Test2) {
        return 1;
    };

    public void is_num_less_than_one(int num) {
        if(num < 1)
        {
            System.out.println("Num < 1");
        }
        else if (num == 1){
            System.out.println("Num = 1");
        }
        else {
            System.out.println("Num is greater than one");
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter num");
            String str_num = myObj.nextLine();  // Read user input
            int number = Integer.parseInt(str_num);
            BasicMethods a = new BasicMethods();
            System.out.println("Iteration is " + i + " num is "  + number);
            a.is_num_less_than_one(number);
        }
    }


}
