import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input > 0) {
                st.add(input);
            } else {
                st.pop();
            }
        }
        int sum = 0;
        for (int a : st) {
            sum += a;
        }
        System.out.println(sum);
    }
}

