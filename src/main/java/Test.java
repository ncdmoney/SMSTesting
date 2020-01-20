import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(new File("email_list.txt"));
        ArrayList<String> recipients = new ArrayList();
        while (reader.hasNextLine()) {
            recipients.add(reader.nextLine());
        }
        for (String element: recipients) {
            System.out.println(element);
        }
    }
}

