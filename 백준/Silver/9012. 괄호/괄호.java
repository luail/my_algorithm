import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            boolean answer = true;
            String input = br.readLine();
            int count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '(') {
                    count++;
                } else if (input.charAt(j) == ')') {
                    count--;
                }
                if (count < 0) {
                    System.out.println("NO");
                    break;
                }
            }
            if (count == 0) {
                System.out.println("YES");
            } else if (count > 0) {
                System.out.println("NO");
            }
        }
    }
}