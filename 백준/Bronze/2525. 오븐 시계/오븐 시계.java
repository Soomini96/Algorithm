import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] data = br.readLine().split(" ");
		int[] time = new int[data.length];
		for(int i=0; i<time.length; i++) {
			time[i] = Integer.valueOf(data[i]);
		}
		int cookTime = Integer.valueOf(br.readLine());
		
		int overHour = (time[1] + cookTime)/60;
		int min = (time[1] + cookTime)%60;
		
		int hour = (time[0] + overHour)%24;
		
		System.out.println(hour + " " + min);
	}

}
