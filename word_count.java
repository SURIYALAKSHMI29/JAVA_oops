package file;
import java.io.*;
public class java
{
    public static void main(String[] args) throws IOException
    {
    String java = "C:\\Users\\22CSEB29\\Documents\\NetBeansProjects\\inheritance\\src\\file\\java.java";
    String inher = "C:\\Users\\22CSEB29\\Documents\\NetBeansProjects\\inheritance\\src\\inheritance\\Inheritance.java";
    String ref = "C:\\Users\\22CSEB29\\Documents\\NetBeansProjects\\JavaApplication2\\src\\javaapplication2\\synchronised.java";
    file[] f = new file[3];
    int c1= new file(java).count();
    int c2= new file(inher).count();
    int c3 = new file(ref).count();
    System.out.println("Word count of,");
    System.out.println("java.java file: " +c1 +"\ninheritance.java file: " +c2 +"\nsynchronised.java:" +c3);
    }
}
class file
{
    String name;
    file(String name)
    {
        this.name = name;
    }
    int count() throws IOException
    {
        int c=0,ch;
        char charac;
        FileInputStream f = new FileInputStream(name);
        while((ch = f.read())!=-1)
        {
            charac = (char)ch;
            if(Character.isWhitespace(charac))
            {
                c+=1;
            }          
        }
        return c;
    }
}
