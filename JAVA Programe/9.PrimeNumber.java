// Write	a	program	to	check	whether	the	given	number	is	PRIME	or not?
import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Numbers: ");
        int n = num.nextInt();
        int j;
            for(j=2; j<n; j++)
            {
                if(n%j==0)
                    break;
            }
            if(n==j)
                System.out.println(n+" Prime Number");
            else
                System.out.println(n+" Not Prime Number");
    }    
}