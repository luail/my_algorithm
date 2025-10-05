import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char[] line = br.readLine().toCharArray();

            int count = 0;

            boolean ok = true;

            for (int j = 0; j < line.length; j++) {
                if (line[j] == '(') {
                    count++;
                } else {
                    if (count <= 0) {
                        ok = false;
                        break;
                    }
                    count--;
                }
            }

            if (count > 0) {
                ok = false;
            }

            if (ok) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }
}
