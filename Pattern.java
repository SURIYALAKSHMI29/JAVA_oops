//pattern
package javaapplication1;
import java.util.*;
public class JavaApplication1
{
    public static void main(String[] args)
    {
        int n,j;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter range n:");
        n=obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
        System.out.println("");
        }
    }
}
