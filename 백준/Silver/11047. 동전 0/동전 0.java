import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String firstLine = br.readLine();
		int N = Integer.valueOf(firstLine.split(" ")[0]);
		int K = Integer.valueOf(firstLine.split(" ")[1]);
		
		int[] list = new int[N];
		for(int i=0; i<N; i++) {
			list[i] = Integer.valueOf(br.readLine());
		}
		
		int cnt = 0;
		for(int i=0; i<N; i++) {
			int coin = list[N-1-i];
			if(K>=coin) {
				cnt ++;
				K = K - coin;
				i--;
			} 
		}
		System.out.println(cnt);
	}
}