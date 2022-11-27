import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { // 베르트랑 공준
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int temp = Integer.parseInt(br.readLine());
            if(temp == 0){
              break;
            } else{
                System.out.println(findPrimeNumber(temp+1,temp*2+1));
            }
        }
    }

    private static int findPrimeNumber(int a, int b) {
        int check = 0;
        for(int i=a; i<b; i++){
            if(isPrime(i)){
                check ++;
            }
        }
        return check;
    }

    private static boolean isPrime(int number) {
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i == 0){
                return false;
            }
        }
            return true;
    }
}
