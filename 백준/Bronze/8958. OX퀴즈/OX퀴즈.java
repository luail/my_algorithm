import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스의 수
        StringBuilder result = new StringBuilder(); // 결과를 저장할 StringBuilder

        for (int i = 0; i < t; i++) {
            String input = br.readLine(); // OX문자열 입력받음
            int score = 0;  // 총 점수
            int consecutive0 = 0;  // 연속된 0의 수

            // 입력받은 input을 문자배열로 각각 저장한다
            // C는 검사하는 문자.
            // 만약 C가 'O' 라면 연속된 0의 수를 한번 증가시킨다.
            // 증가시킨 O를 score에 저장한다.
            // 만약 'O'가 아니라면 연속된 0의 수를 0으로 초기화한다.
            for (char C : input.toCharArray()) {
                if (C == 'O') {
                    consecutive0++;
                    score += consecutive0;
                } else {
                    consecutive0 = 0;
                }
            }
            // 총 점수를 StringBuilder에 저장하고 줄바꿈한다.
            result.append(score).append("\n");
        }
        System.out.println(result);
    }
}