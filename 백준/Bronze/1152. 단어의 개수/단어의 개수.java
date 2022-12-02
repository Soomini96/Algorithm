import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 1152
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String txt = br.readLine();
		String temp[] = txt.split(" ");
		
		int cnt = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i].length() > 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}