import java.util.Scanner;
public class Array1D
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]fruit = new String[5];
      
        for (int i = 0; i < 5; i++) {
          System.out.println("Enter a name of fruit");
          fruit[i] = sc.nextLine();
        }
    }
}
