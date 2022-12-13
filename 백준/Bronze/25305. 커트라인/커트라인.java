import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 커트라인
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);
        String[] data = br.readLine().split(" ");

        int[] arr = new int[N];
        int[] count = new int[10001];
        int[] result = new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(data[i]);
            count[arr[i]] ++;
        }
        for(int i=1; i<count.length; i++){
            count[i] += count[i-1];
        }
        for(int i=arr.length-1; i>=0; i--){
            int value = arr[i];
            count[value] --;
            result[count[value]] = value;
        }
        System.out.println(result[N-k]);
    }
}
