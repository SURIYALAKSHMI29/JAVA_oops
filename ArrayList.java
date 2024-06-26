/*
 Write a Java program to perform the following task.
Take an integer array of size 20, initialize values randomly between 10 and 90, simultaneously sum all values and 
calculate average. Now separate values below average and above average in ArrayLists.
Finally print both lists in 2 separate rows.
 */
package model_lab;
import java.util.*;
public class Arraylist {
    public static void main(String[] args)
    {
        int[] arr = new int[20];
        int sum=0;
        for(int i=0;i<20;i++)
        {
            arr[i]=(int)(Math.random()*80)+10;
            sum+=arr[i];
        }
        System.out.println("Displaying ArrayList elements,");
        for(int x:arr)
            System.out.print(x+" ");
        int avg = sum/20;
        System.out.println("\nAverage: "+avg);
        ArrayList<Integer> belowavg = new ArrayList<>();
        ArrayList<Integer> aboveavg = new ArrayList<>();
        for(int x:arr)
        {
            if(x<avg)
                belowavg.add(x);
            else
                aboveavg.add(x);
        }
        System.out.println("Displaying ArrayList elements below average,");
        for(int x:belowavg)
            System.out.print(x+" ");
        System.out.println("\nDisplaying ArrayList elements above average,");
        for(int x:aboveavg)
            System.out.print(x+" ");
    }
}
