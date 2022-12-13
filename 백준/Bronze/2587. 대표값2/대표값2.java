import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 대표값2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int[] count = new int[101];
        int[] result = new int[5];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
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
        System.out.println(sum/5);
        System.out.println(result[2]);
    }
}
