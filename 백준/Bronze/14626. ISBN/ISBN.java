import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String isbn = br.readLine();

        int star = 0;
        int num = 0;

        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i);

            if (c == '*') {
                star = i+1;
            } else {
                if ((i+1) % 2 == 0) {
                    num += (c-'0')*3;
                } else {
                    num += c-'0';
                }
            }
        }
        
        if (num % 10 == 0) {
            System.out.println(0);
            
        } else if (star % 2 == 0) {
            for (int i = 1; i < 10; i++) {
                if ((num + i*3) % 10 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            for (int i = 1; i < 10; i++) {
                if ((num + i) % 10 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
