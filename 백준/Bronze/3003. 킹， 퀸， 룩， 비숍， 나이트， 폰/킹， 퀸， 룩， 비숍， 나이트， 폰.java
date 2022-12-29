import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] data = br.readLine().split(" ");
		
		int[] right = {1, 1, 2, 2, 2, 8};
		int[] answer = new int[right.length];
		for(int i=0; i<right.length; i++) {
			
			answer[i] = right[i] - Integer.valueOf(data[i]);
			System.out.print(answer[i] + " ");
		}
		
	}

}
