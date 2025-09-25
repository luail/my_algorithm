import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] inputs = new int[9];
        int count = 0;
        int Max = 0;
        for (int i = 0; i < inputs.length; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
            if (Max < inputs[i]) {
                Max = inputs[i];
                count = i;
            }
        }
        System.out.println(Max);
        System.out.println(count+1);

    }
}