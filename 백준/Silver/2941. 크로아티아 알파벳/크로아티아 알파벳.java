import java.util.Scanner;

public class Main { // 2941

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		String str = sc.next();
		
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {	
			
			char word = str.charAt(i);
			
			if(word == 'c') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}
					else if(str.charAt(i+1) == '-') {
						i++;
					}				
				}
			}
			
			else if(word == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == 'z') {
						if(i < str.length() -2) {
							if(str.charAt(i+2) == '=') {
								i+=2;
							}
						}
					}
					else if(str.charAt(i+1) == '-') {
						i++;
					}
				}
			}
			
			else if(word == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}
			}
			
			else if(word == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == 'j') {
						i++;
					}
				}
			}
			
			else if(word == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			
			else if(word == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i+1) == '=') {
						i++;
					}
				}
			}
			
			cnt++;			
		}
		
		System.out.println(cnt);
	}
}