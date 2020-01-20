/*import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Start {
    public static void main(String[] args) throws IOException {
        boolean keepGoing = true;
        while(keepGoing) {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            System.out.println(sdf.format(cal.getTime()));
            if(sdf.format(cal.getTime()).equals("09:11:00")) {
                System.out.println("Sending");
                Process p = Runtime.getRuntime().exec("gradle run");
                System.out.println("Executed");
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
         }
    }
}*/