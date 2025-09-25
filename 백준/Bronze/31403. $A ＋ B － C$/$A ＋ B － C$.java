import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int ans1 = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);

        String temp = a+b;

        int ans2 = Integer.parseInt(temp) - Integer.parseInt(c);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
