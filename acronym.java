/*
Write a program that allows a user to enter three words, and display the appropriate three-letter acronym in all uppercase letters.
If the user enters more than three words, ignore the extra words.
*/
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
           if(str.length<3)
           {
               
               break;
           }
           op+=str[i].charAt(0);
        }
       op = op.toUpperCase();
       System.out.println(op);
    }
}
