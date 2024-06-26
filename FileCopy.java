/*
 Write a program to read a file & copy it in another file after changing it all into UpperCase. 
 */
package model_lab;
import java.io.*;
public class FileCopy {
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("C:\\Users\\ELCOT\\Documents\\NetBeansProjects\\files\\Sample.txt");
        BufferedReader b = new BufferedReader(fr);
        FileWriter fw = new FileWriter("C:\\Users\\ELCOT\\Documents\\NetBeansProjects\\files\\Sample2.txt");
        String str = "";
        while((str = b.readLine())!=null)
        {
            fw.write(str.toUpperCase());
            fw.write("\n");
        }
        System.out.println("File copied successfully!");
        fr.close();
        fw.close();
        b.close();
    }
}
