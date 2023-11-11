//telephone bill

import java.util.*;
public class telephone_bill {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int b[] = new int[12];
        int i,t,max = b[0], min = b[0],tot=0, avg;
        System.out.println("Enter the telephone bills...");
        for(i=0;i<12;i++)
        {
            System.out.print("Month "+(i+1)+":");
            b[i]=obj.nextInt();
            tot+=b[i];
            
        }
        avg = tot/12;
        max=b[0];
        min=b[0];
        for(i=0;i<12;i++)
        {
            if(max<b[i])
                max=b[i];
            else if(min>b[i])
                min=b[i];
            else
                continue;
        }
        System.out.println("Average bill: "+avg+"\nLeast Bill: "+min+"\nMaximum Bill: "+max);
    }
}
