import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int cup = Integer.parseInt(a) * 8 + Integer.parseInt(b) * 3;
        int total = cup - 28;
        System.out.println(total);
    }
}