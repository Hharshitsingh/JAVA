// Write a program to Print	display	 sum of 1 to N numbers?
import java.util.Scanner;
class printsumnnums{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the range to print sum of Number: ");
        int n = num.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++)
        {
            sum+=i;
        }
        System.out.println("Sum of N Numbers: "+sum);
    }
}