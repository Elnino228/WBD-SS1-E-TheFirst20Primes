import java.util.Scanner;
public class TheFirst20Primes {
    public static void main(String[] args) {
        int number=0;
        int i=0;
        while (i<20){
            boolean isPrime=true;
            if (number<2) isPrime=false;
            for (int j=2;j<=Math.sqrt(number);j++){
                if (number%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
                i++;
            }
            number++;
        }
    }
}
