// Write	a	program	to	check	given	number	is	EVEN	or	ODD?
import java.util.Scanner;
public class Evenodd{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = num.nextInt();
        if(n%2!=0)
        {
            System.out.println(n+" is Odd ");
        }
        else
        {
            System.out.println(n+" is Even ");
        }     
    }   
}