import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String datas = br.readLine();
		String temp[] = datas.split(" ");

		double up = Integer.parseInt(temp[0]);
		double down = Integer.parseInt(temp[1]);
		double goal = Integer.parseInt(temp[2]);

		double day = (goal - down) / (up - down);
		if (day % 1 != 0) {
			day += 1;
		}
		System.out.println((int) day);
	}

}
