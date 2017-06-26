import java.util.ArrayList;
public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] number = new int[6];
        int j = 0;
        int key = 0;
      
        for (int i = 0; i < number.length; i++) {
          j = i - 1;
          number[i] = i+1;   
          key = number[i];
          while (j>= 0 && number[j] > key){
           number[j + 1] = number[j];
           j--;
          }
          number[j+1] = key;
        }
    }    
}
