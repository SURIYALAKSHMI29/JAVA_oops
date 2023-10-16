package javaapplication1;
import java.util.Arrays;
import java.util.Scanner;
public class exp7 {
    public static void main(String args[]){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter a sentance: ");
    String str = obj.nextLine();
    str = str.replaceAll("[^a-zA-Z0-9]"," ");
    int count;
    String n[] = new String[20];
    String m[] = str.split(" ");
    Arrays.sort(m);
    for(int i=0;i<m.length;i++){
       count = 1;
     for(int j=i+1;j<m.length;j++){
        // m[i]= m[i].replaceAll("[^a-zA-Z0-9]" , " ");
       if(m[i].equals(m[j])){
        count= count+1;                
        m[j] = "0";
               }
       }
    
    if(m[i]!= "0"){
    System.out.println(m[i] +" " +count);
    }
    }
 }
}
