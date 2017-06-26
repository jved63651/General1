import java.util.Scanner;
public class CountingUpOne
{
    public static void main(String[] args)
    {
        int Num1 = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        Num1 = sc.nextInt();
        for(i = 0; i <= Num1; i++){
            System.out.println(i);
        }
    }
}
