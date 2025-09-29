import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            String[] arr = br.readLine().split(" ");
            int num = Integer.parseInt(arr[0]);
            String word = arr[1];

//            입력받은 단어의 길이만큼 반복
            for (int j = 0; j < word.length(); j++) {
//                각 단어를 위에 입력받은 num만큼 반복
                for (int k = 0; k < num; k++) {
//                    단어하나씩 반복해서 출력
                    System.out.print(word.charAt(j));
                }
            }
//            단어가 끝나면 줄바꿈
            System.out.println();
        }
    }
}
