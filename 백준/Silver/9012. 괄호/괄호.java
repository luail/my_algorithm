import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String line = br.readLine();

            int count = 0;

            String ans = "YES";

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == '(') {
                    count++;
                } else {
                    if (count <= 0) {
                        ans = "NO";
                        break;
                    }
                    count--;
                }
            }

            if (count > 0) {
                ans = "NO";
            }

            System.out.println(ans);
        }
    }
}
