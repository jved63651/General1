import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Palindrome
{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fr = new FileWriter("U:\\Desktop_2k\\palindromes.txt", true);
        BufferedWriter br = new BufferedWriter(fr);
        int palCount = 0;
        String[]nom = new String[10];
        String[]bits = new String[4];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter a 4 digit number");
            nom[i] = sc.nextLine();
            bits = nom[i].split(" ");
                if (bits[0].equals(bits[3]) && bits[1].equals(bits[2])){
                    palCount ++;
                    br.write(sc.nextLine());
                    br.newLine();
                }
        } 
        br.close();
        System.out.println(palCount*10 + "&");
    }
}
