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
                System.out.println("[!] Exception: " + e);
                myScan = new Scanner(System.in);
            }
        }
        return result;
    }

    public int getInt(String prompt) {
        int result = 0;
        while (true) {
            try {
                System.out.println(prompt);
                result = myScan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("[!] Exception: " + e);
                myScan = new Scanner(System.in);
            }
        }
        return result;
    }

}