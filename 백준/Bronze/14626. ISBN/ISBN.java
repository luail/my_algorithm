import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String isbn = br.readLine();

        int star = 0;
        int num = 0;

        for (int i = 0; i < isbn.length(); i++) {
            char c = isbn.charAt(i);
//            *을 찾으면 자릿수 기록 후 for문 한번 건너뛰기
            if (c == '*') {
                star = i+1;
                continue;
            }

            int digit = c - '0';
//            만약 현재 자릿수가 2의 배수라면 가중치3 아닐경우 가중치1
            int weight = ((i+1) % 2 == 0) ? 3 : 1;

//            num에 가중치와 해당 자릿수의 숫자를 곱한값을 더함
            num += digit * weight;
        }
        
//        현재 *의 자릿수가 2의 배수일 경우 가중치3 아닐경우 가중치1
        int starWeight = (star % 2 == 0) ? 3 : 1;
        
        for (int i = 0; i < 10; i++) {
            if ((num + i * starWeight) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
