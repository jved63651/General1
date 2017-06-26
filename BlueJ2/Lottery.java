import java.util.Random;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Lottery
{
    public static void main(String[] args) throws IOException
    {

        Random rand = new Random();

        boolean lotteryNumbers[] = new boolean[51];
        int numberOfSelectedBalls = 0;

        /*while (numberOfSelectedBalls != 6 )
        {            
        int winningBall = rand.nextInt(50) + 1;
        if (lotteryNumbers[winningBall] == false)
        {
        lotteryNumbers[winningBall] = true;
        numberOfSelectedBalls++;
        }            
        }*/

        int winningBall;
        while (numberOfSelectedBalls != 6 && !lotteryNumbers[winningBall = rand.nextInt(50) + 1])
        {            
            lotteryNumbers[winningBall] = true;
            numberOfSelectedBalls++;
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("lottery.txt"));

        for (int i = 1; i <= 50; i++)
        {
            if (!lotteryNumbers[i]) continue;
            System.out.print(i + "\t");            
            bw.write(i + "\t");
        }

        bw.close();

    }
}