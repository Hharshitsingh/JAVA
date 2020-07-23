// Write	a	program	to	display	MULTIPLICATION	table?
import java .util.Scanner;
public class NMultiplicationtable{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter range to print table: ");
        int n = num.nextInt();
        for(int i=1; i<=10; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.print("\n");
        }
    }  
}