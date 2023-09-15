package java_basics;
import java.util.*;
public class java_basics {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        MyBook[] book = new MyBook[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter Book["+(i+1)+"] Details:");
            System.out.print("Author:");
            String author = obj.next();
            System.out.print("Title:");
            String title = obj.next();
            System.out.print("Price:");
            int price = obj.nextInt();
            book[i] = new MyBook();
            book[i].setdetails(author,title,price);
        }
        System.out.println("Book 2 Title:");
        book[1].gettitle();
        System.out.print("Total:");
        book[1].show(book[0].price,book[1].price,book[2].price);
    }
}
 abstract class book
 {
     String author, title;
     int price;
     abstract void setdetails(String author, String title, int price);
     abstract void gettitle();
 }
class MyBook extends book
{
    @Override
    void setdetails(String author, String title, int price)
    {
        this.author = author;
        this.title=title;
        this.price=price;
    }
    @Override
    void gettitle()
    {
         System.out.println(title);  
    }
    void show(int p1, int p2, int p3)
    {
        int P=p1+p2+p3;
        System.out.println("Total Price:"+P);
    }
}
