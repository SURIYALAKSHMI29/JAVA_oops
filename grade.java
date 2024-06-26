package model_lab;
/*
Read 5 sub marks & display toatl & grade
*/
import java.util.*;
public class grade {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] mark = new int[5];
        String letterG;
        int gradept,t=0,total=0;
        System.out.println("Enter the marks...");
        for(int i=0;i<5;i++)
        {
            System.out.print("Mark "+(i+1)+":");
            mark[i] = obj.nextInt();
            t+=mark[i];
        }
        total=t/5;
        if(total<=100 && total>=91)
        {
            letterG = "O (Outstanding)";
            gradept=10;
        }
        else if(total<91 && total>=81)
        {
            letterG = "A+ (Excellent)";
            gradept=9;
        }
        else if(total<81 && total>=71)
        {
            letterG = "A (Very Good)";
            gradept=8;
        }
        else if(total<71 && total>=61)
        {
            letterG = "B+ (Good)";
            gradept=7;
        }
        else if(total<61 && total>=50)
        {
            letterG = "B (Average)";
            gradept=6;
        }
        else 
        {
            letterG = "RA";
            gradept=0;
        }
        System.out.println("Total: "+t+"\nGrade Points: "+gradept+"\nLetter Grade: "+letterG);
    }
}
