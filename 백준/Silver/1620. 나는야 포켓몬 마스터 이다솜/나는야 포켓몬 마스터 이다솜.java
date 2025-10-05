import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int pokets = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        HashMap<String, Integer> nameMap = new HashMap<>();
        HashMap<Integer, String> numberMap = new HashMap<>();

        for (int i = 1; i <= pokets; i++) {
            String mons = br.readLine();

            nameMap.put(mons, i);
            numberMap.put(i, mons);
        }

        for (int i = 0; i < m; i++) {
            String qustion = br.readLine();

            if (qustion.charAt(0) >= 'A' && qustion.charAt(0) <= 'Z') {
                System.out.println(nameMap.get(qustion));
            } else {
                System.out.println(numberMap.get(Integer.parseInt(qustion)));
            }
        }
    }
}
