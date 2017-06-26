import java.util.Scanner;

public class QuadrupleNumber
{
    public static int quadruple(int number) {
        return number*4;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = input.nextInt();
        
        System.out.println(number + " tripled is: " + quadruple(number));  
    }
}
