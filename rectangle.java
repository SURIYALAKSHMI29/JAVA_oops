//RETANGLE
package javaapplication1;
import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args)
    {
        // TODO code application logic here
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter length:");
        float l= obj.nextFloat();
        System.out.print("Enter width:");
        float w= obj.nextFloat();
        Rectangle obj1= new Rectangle();
        obj1.setlength(l);
        obj1.setwidth(w);
        System.out.println(obj1);
    }    
}
 class Rectangle
 {
     private float length, width;
     public float getlength()
     {
         return length;
     }
     public float getwidth()
     {
         return width;
     }
     public void  setlength(float l)
     {
         length = l;
    }
    public void  setwidth(float w)
    {
        width = w;
    }  
    public double getarea()
    {
        return length*width;
    }
    public double getperi()
    {
        return 2*(length+width);
    }
      public String toString()
      {
          return "Length: "+length+"\nWidth: "+width+"\nArea: "+getarea()+"\nPerimeter: "+getperi();
      }
 }
