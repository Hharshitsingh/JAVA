import java.util.Scanner;
class BillGen{
    public static void main(String[] args){
        Scanner bg = new Scanner(System.in);
        System.out.print("Enter the no. of Pizzas bought: ");
        int pizs = bg.nextInt();
        System.out.print("Enter the puffs bought: ");
        int puf = bg.nextInt();
        System.out.print("Enter the no of cold drinks bought: ");
        int cldink = bg.nextInt();
        System.out.println("Bill Detail");
        System.out.println("No. of Pizzas: "+pizs);
        System.out.println("No. of puffs: "+puf);
        System.out.println("No. of coldDrinks: "+cldink);
        int total = (pizs*100)+(puf*20)+(cldink*10);
        System.out.println("Total price: "+total);
        System.out.println("ENJOY THE SHOW!!!");
    }
}