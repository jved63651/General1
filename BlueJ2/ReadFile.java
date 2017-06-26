import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("U:\\Desktop_2k\\code.txt");
        BufferedReader br = new BufferedReader(fr);

        String line = null;

        while ((line = br.readLine()) != null) {
            System.out.println(line);    
        }
        br.close();
    }
}
