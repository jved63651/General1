import java.util.Scanner;
public class UnitDiscount
{
    public static void main(String[] args)
    {
       double units = 0;
       double priceUnit = 0;
       double total = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of units");
       units = sc.nextDouble();
       System.out.println("Enter the price per unit");
       priceUnit = sc.nextDouble();
       if (units < 100) {
           total = units * priceUnit;
        } else if (units <= 120) {
            total = units * priceUnit * 0.9;
        } else {
            total = units * priceUnit * 0.85;
        }
        System.out.println("Your total cost is " + total);
    }
}
