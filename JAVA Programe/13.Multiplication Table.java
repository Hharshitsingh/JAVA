// Write a program	to	display	MULTIPLICATION	table?
import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = num.nextInt();
        for(int i=1; i<=10; i++)
        {
            System.out.println(n+"  *  "+i+" = "+(n*i));
        }
    } 
}