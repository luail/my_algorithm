import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int number = 0;

        for (int i = 0; i <= n; i++) {
            if (i >= 0 && i <= 4){
                number=0;
            } else if (i % 125 == 0) {
                number = number + 3;
            } else if (i % 25 == 0) {
                number = number + 2;
            } else if (i % 5 == 0) {
                number++;
            }
        }
        System.out.println(number);
    }
}
