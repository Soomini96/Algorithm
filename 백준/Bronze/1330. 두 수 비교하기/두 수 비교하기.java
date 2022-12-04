import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 1330

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		String temp[]= num.split(" ");
		if(Integer.parseInt(temp[0])>Integer.parseInt(temp[1])) {
			System.out.println(">");
		}
		if(Integer.parseInt(temp[0])<Integer.parseInt(temp[1])) {
			System.out.println("<");
		}
		if(Integer.parseInt(temp[0])==Integer.parseInt(temp[1])) {
			System.out.println("==");
		}
	}
}

