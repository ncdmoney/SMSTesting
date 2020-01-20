import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

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
                case "end": keepGoing = false;
                    System.out.println("done.");
                    break;
                default: break;
            }
        }
    }
}