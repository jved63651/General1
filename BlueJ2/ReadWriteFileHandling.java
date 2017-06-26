import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFileHandling
{
    public static void main(String[] args) throws IOException
    {
       FileWriter fr = new FileWriter("U:\\Desktop_2k\\test.txt", true);
       BufferedWriter br = new BufferedWriter(fr);
       Scanner sc  = new Scanner(System.in);
       
       String[] names = new String[4];
       for (int i =0; i <4; i++) {
           System.out.println("Enter Name");
           br.write(sc.nextLine());
           br.newLine();
      }
      br.close();
      for (int i =0; i <4; i++) {
         System.out.println(names[i]);
      }
    }
}
