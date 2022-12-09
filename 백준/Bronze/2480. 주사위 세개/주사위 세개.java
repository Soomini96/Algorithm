import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// 정보 저장
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] data = br.readLine().split(" ");
		
		int answer;
		if(data[0].equals(data[1]) && data[1].equals(data[2])) {
			answer = Integer.valueOf(data[0]) * 1000 + 10000;
		} else if(data[0].equals(data[1]) || data[2].equals(data[0])) {
			answer = Integer.valueOf(data[0]) * 100 + 1000;
		} else if(data[1].equals(data[2])){
			answer = Integer.valueOf(data[1]) * 100 + 1000;
		} else {
			int max = 0;
			for(int i=0; i<data.length; i++) {
				if(max < Integer.valueOf(data[i])) {
					max = Integer.valueOf(data[i]);
				}
			}
			answer = max * 100;
		}
		System.out.println(answer);
		
	}

}
