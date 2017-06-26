import java.util.Scanner;
public class OddEven
{
    public static void main(String[] args)
    {
        int Num1 = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number");
        Num1 = sc.nextInt();
        String result = "";
        
        if ((Num1 % 2) == 1) {
          result = ("postive odd");
        } else if ((Num1 % 2 ) == -1) {
            result = ("negative even");
        } else if ((Num1 % 2)  == 0) {
            result = ("positive even");
        } else {
           result = ("negative even");
        }
        System.out.println(result);
        
    }    
}