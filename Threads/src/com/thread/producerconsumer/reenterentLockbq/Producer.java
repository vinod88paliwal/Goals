package com.thread.producerconsumer.reenterentLockbq;

public class Producer implements Runnable
{
    private MyBlockingQueue sharedq;

    public Producer(MyBlockingQueue sharedq)
    {
        this.sharedq = sharedq;
    }

    public void run()
    {
        for (int i = 1; i < 10; i++)
        {
            System.out.println("Produced : " + i);
            sharedq.put(i);
           
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }

}
