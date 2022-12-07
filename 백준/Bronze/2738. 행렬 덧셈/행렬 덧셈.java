import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 행렬 덧셈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int N = Integer.parseInt(data[0]);
        int M = Integer.parseInt(data[1]);
        int[][] answer = new int[N][M];

        for(int i=0; i<N; i++){
            String[] temp = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                answer[i][j] += Integer.parseInt(temp[j]);
            }
        }
        for(int i=0; i<N; i++){
            String[] temp = br.readLine().split(" ");
            for(int j=0; j<M; j++){
                answer[i][j] += Integer.parseInt(temp[j]);
            }
        }
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }
    }
}
