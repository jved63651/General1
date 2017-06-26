public class BubbleSort
{
     public static void main(String[] args) 
     {
        int[] numbers = {5,3,7,9,6,15,6,2,1,12,17};
        int temp = 0;
        int swaps = 0;
        
        for (int i = 0; i < numbers.length; i++) {
          for (int x= 1; x < numbers.length; x++) {
              if (numbers[x-1] > numbers[x]){
                  temp = numbers[x];
                  numbers[x] = numbers [x-1];
                  numbers[x-1] = temp;
                  swaps +=1;
              }              
          }
        }
       
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + ",");
        }
        System.out.println(swaps + " number of swaps");
     }
}
