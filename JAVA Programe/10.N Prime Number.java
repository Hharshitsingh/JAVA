// Write	a	program	to	display	PRIME	NUMBERS	from	1	to	n?
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the range to print Prime Number: ");
        int n = num.nextInt();
        int i,j;
        System.out.println("Prime Numbers between 1 and "+n);
        for(i=1; i<=n; i++)
        {
            for(j=2; j<i; j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(i);
        }        
    }
}