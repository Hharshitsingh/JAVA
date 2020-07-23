// Write	a	program	to	find	SUM	OF	PRIME	numbers?
import java.util.Scanner;
public class SumofprimeNumber{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in); 
        System.out.print("Enter the range to print sum of Number: ");
        int n = num.nextInt();
        int a,sum =0;
        for(int i=1; i<=n; i++)
        {
            a= isPrime(i);
            sum= sum+a;
        }
        System.out.println("Sum of Prime Number between 1 and "+n+": "+sum);
    }
    public static int isPrime(int n)
    {
        int i;
       if(n==1) return 0;
        for(i=2; i<n; i++)
        {
            if(n%i==0)
            {
                return 0;
                // break;
            }
        }
        return i;
    }
}