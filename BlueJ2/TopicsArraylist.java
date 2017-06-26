import java.util.ArrayList;
import java.util.Scanner;

public class TopicsArraylist
{
     public static void main(String[] args)
     {
        ArrayList<String>scores = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        String topic = "";
        
         do{
            System.out.println("Enter a topic(-999 to stop)");
            topic = sc.nextLine();
            if (topic!= -999) scores.add(topic);
        } while (topic!= -999);
        System.out.println(scores);
    
        do{
            if (scores.size()>0)
            {
                System.out.println("Please enter topic to remove(-1 to stop)");
                topic = sc.nextLine();
                if(scores.contains(topic)){
                   scores.remove(scores.indexOf(topic));
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
