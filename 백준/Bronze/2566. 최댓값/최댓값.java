import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 최댓값
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int M = -1;
        int N = -1;
        for (int i = 0; i < 9; i++) {
            String[] temp = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(temp[j].trim());
                if (num > max) {
                    max = num;
                    N = i + 1;
                    M = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(N + " " + M);
    }
}
