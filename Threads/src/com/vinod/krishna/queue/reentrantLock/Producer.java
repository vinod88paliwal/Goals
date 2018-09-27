package com.vinod.krishna.queue.reentrantLock;

import java.util.Queue;

public class Producer implements Runnable
{
    private MyBlockingQueueReentrantLock sharedq;

    public Producer(MyBlockingQueueReentrantLock sharedq)
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
