package Lesson1;

public class kata1 {

    public static boolean validatePin(String pin) {
        int dlinna = pin.length();
        if (dlinna == 4) {
            System.out.println("True");
        } else if (dlinna == 6) {
            System.out.println("True");
        } else {
            System.out.println("Fail");

        }
        return true;
    }
}


