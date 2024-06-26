/*
 Write a java program to demonstrate that as a high priority thread executes, it will delay the execution of all lower-priority threads
 */
package model_lab;
public class thread_priority extends Thread 
{
    public static void main(String[] args)
    {
        thread_priority Tp1 = new thread_priority();
        thread_priority Tp2 = new thread_priority();
        Tp1.setPriority(Thread.MIN_PRIORITY);
        Tp2.setPriority(Thread.MAX_PRIORITY);
        Tp1.start();
        Tp2.start();
    }
    public void run()
    {
        System.out.println("Running thread name: "+Thread.currentThread().getName());
        System.out.println("Running thread Priority: "+Thread.currentThread().getPriority());
    }
}
