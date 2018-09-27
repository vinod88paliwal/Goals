package com.vinod.krishna.queue.reentrantLock;

public class Consumer implements Runnable
{

    private MyBlockingQueueReentrantLock sharedq;

    public Consumer(MyBlockingQueueReentrantLock sharedq)
    {
        this.sharedq = sharedq;
    }

    public void run()
    {
        while (true)
        {

            System.out.println("Consumed : " + sharedq.take());
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
