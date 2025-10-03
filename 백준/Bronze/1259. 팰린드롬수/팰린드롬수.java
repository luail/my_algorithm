import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String number = br.readLine();

            if (number.equals("0")) {
                break;
            }
            
            StringBuilder sb = new StringBuilder(number);

            String reverseNumber = sb.reverse().toString();

            if (number.equals(reverseNumber)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
