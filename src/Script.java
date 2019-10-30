import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Script {
    private Scanner fileScan = null;
    private String[] SCRIPT = null;

    public Script() {
        createObject();
        System.out.println("[!] Console display module online");
    }

    private void createObject() {
        File SCRIPT_FILE = new File("./src/Script.txt");
        SCRIPT = new String[21];
        int index = 0;

        try {
            fileScan = new Scanner(SCRIPT_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (fileScan.hasNextLine()) SCRIPT[index++] = fileScan.nextLine();
        fileScan.close();
    }

    public String getScript(){
        String result = "";
        for (int i = 0; i < 8; i++) result += SCRIPT[i] + "\n";
        return "\n" + result.trim();
    }

    public String getScript(int SCRIPT_NUM){
        return SCRIPT[SCRIPT_NUM];
    }

}

/*

 + ===  Contact  App  === +
 |  1. List all Contacts  |
 |  2. Add new Contact    |
 |  3. Remove Contact     |
 |  4. Update Contact     |
 |  5. Quit               |
 + ====================== +

*/