import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist
{
    public static void main(String[] args)
    {
        ArrayList<Integer>scores = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        int score = 0;
        do{
            System.out.println("Enter a number(-999 to stop)");
            score = sc.nextInt();
            if (score!= -999) scores.add(score);
        } while (score!= -999);
        System.out.println(scores);
    
        do{
            if (scores.size()>0)
            {
                System.out.println("Please enter a number(-1 to stop)");
                score = sc.nextInt();
                if(scores.contains(score)){
                   scores.remove(scores.indexOf(score));
                }else if (score >= 0){
                    System.out.println("Unable to remove enumber as it does not exist in the list");
                }
            }else{
                System.out.println("The list is empty");
            }
        }while (score!= -1 && scores.size()>0);
        
        System.out.println(scores);
            
     }
}



