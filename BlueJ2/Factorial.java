import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args)
    {
        int Num1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number");
        Num1 = sc.nextInt();
        int counter = Num1;
        int result = 0;
        do {
            result = counter * Num1;    
            counter = counter - 1;
        } while (counter != 0);
        System.out.println("Factorial is " + result);
        
    }
}