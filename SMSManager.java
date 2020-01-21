import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SMSManager {
    public static void main(String [] args) throws IOException {
        boolean keepGoing = true;
        Scanner input = new Scanner(System.in);
        String response;
        while(keepGoing) {
            System.out.println("Enter \"start\" or \"end\":");
            response = input.nextLine();
            switch(response) {
                case "start": Process p = Runtime.getRuntime().exec("gradle run");
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                    System.out.println("done.");
                    break;
                case "edit": edit();
                             break;
                case "end": keepGoing = false;
                    System.out.println("done.");
                    break;
                default: break;
            }
        }
    }
    static private void edit() throws IOException, FileNotFoundException {
        String edit;
        String newText = "default";
        Scanner input = new Scanner(System.in);
        FileWriter fw = new FileWriter(new File("src/msg.txt"), true);
        System.out.print("What would you like to change (M for message, R for recipients): ");
        edit = input.nextLine();
        if (edit.equals("M")) {
            System.out.println("Please enter your desired message and press Enter: ");
            newText = input.nextLine();
            fw.write(newText);
            fw.close();
        } else if (edit.equals("R")) {
            System.out.println("Under construction :(");
        }
        
    }
}
