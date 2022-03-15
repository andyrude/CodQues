package printingNumbersAfterCertainTime;

import java.util.Scanner;
class PrintTime implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                Thread.sleep(2000);
                System.out.println(i);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Exception..."+e);
        }
    }
}

class Number
{
    public static void main(String [] args)
    {
        PrintTime m1 = new PrintTime();
        Thread thread = new Thread(m1);
        thread.start();
    }
}