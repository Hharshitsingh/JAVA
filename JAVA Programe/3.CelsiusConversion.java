import java.util.Scanner;
class CelsiusConversion {
    public static void main(String[] args) {
        Scanner tem = new Scanner(System.in);
        System.out.print("Enter temprature in Celsius: ");
        float C = tem.nextFloat();
        float F = ((C*9)/ 5)+ 32;
        System.out.println("Temprature in Farenheit: "+F);
    }
}