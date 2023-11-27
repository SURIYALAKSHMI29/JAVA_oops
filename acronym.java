//acronym
import java.util.*;
public class ThreeLetterAcronym
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String input= obj.nextLine();
        String[] str = input.split(" ");
        String op="";
        for(int i=0; i<3; i++)
        {
           if(str[].length()<3)
           {
               
               break;
           }
           op+=str[i].charAt(0);
        }
       op = op.toUpperCase();
       System.out.println(op);
    }
}
