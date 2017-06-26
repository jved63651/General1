import java.util.Scanner;
public class FirstSecondThird
{
    public static void main(String[] args)
    {
        int Num1= 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter 1, 2 or 3");
        Num1 = sc.nextInt();
        String result;
        switch (Num1) {
            case 1: result = ("first");
                break;
            case 2: result = ("second");
                break;
            case 3: result = ("third");
                break;
            default: result = ("unranked");
        }
        System.out.println("You came " + result);
    }
}
