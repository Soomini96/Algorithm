import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 정렬하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // -1000 ~ 1000의 범위 -> 0~2000 인덱스에 넣어줌(+1000된 값)
        boolean[] arr = new boolean[2001];
        for(int i=0; i<N; i++){
            arr[Integer.parseInt(br.readLine()) +1000] = true;
        }

        // 값 중복이 없기 때문에 정렬기능이 필요없다. 그냥 true인것 프린트하면 됨
        for (int i=0; i<arr.length; i++){
            if(arr[i]) System.out.println(i-1000);
        }
    }
}
