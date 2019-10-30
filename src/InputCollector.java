import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCollector {
    // Fields
    private static Scanner myScan = new Scanner(System.in);

    // Constructor - Private, do not use
    private InputCollector() {
    }

    // Methods
    public static String getUserInput(String prompt) {
        String result = "";
        while (true) {
            try {
                System.out.println(prompt);
                result = myScan.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("[!] Exception : " + e + "\n");
                myScan = new Scanner(System.in);
            }
        }
        return result;
    }

    public static int getInt(String prompt) {
        int result = 0;
        while (true) {
            try {
                result = Integer.parseInt(getUserInput(prompt));
                break;
            } catch (NumberFormatException e) {
                System.out.println("[!] Input Mismatch : Please enter a number only");
                myScan = new Scanner(System.in);
            }
        }

        return result;
    }

}