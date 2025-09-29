import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i] = Integer.parseInt(arr[i]);
        }

        String ans = "";

        for (int i = 0; i < arr.length-1; i++) {
            if (arr1[i]+1 == arr1[i+1]) {
                ans = "a";
            } else if (arr1[i]-1 == arr1[i+1]) {
                ans = "d";
            } else {
                ans = "m";
                break;
            }
        }

        if (ans.equals("a")) {
            System.out.println("ascending");
        } else if (ans.equals("d")) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
