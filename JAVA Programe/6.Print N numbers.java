// Write a program to Print	1 to N numbers?
import java.util.Scanner;
class printnnums{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the range to print Number: ");
        int n = num.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}