import java.util.*;
public class demo{
public static void main(String[] args)   
  {  
     Q q = new Q(50);
     new insert(q);
     new remove(q);
  }
}
class Q 
{
   static int MAX, queue[], front, rear;  
   Q(int max) {
      MAX = max;
      queue = new int[max];
      front=0;
      rear=-1;
   }
synchronized static void enqueue()
{      
    Scanner obj = new Scanner(System.in); 
    System.out.print("Enter no of elements:");
    int n = obj.nextInt();      
    while(n!=0){
    try
    {
        Thread.sleep(1000);
    }    
    catch(InterruptedException e)
    {
        System.out.println("Interrupted Exception caught");
    }
    if(rear == MAX-1){
         System.out.println("Queue is full!");  
          return;
    }
    System.out.print("Enter element to insert: ");
    int item = obj.nextInt();
    rear++;
    queue[rear] = item;    
    System.out.println("Item added to queue: " + item); 
    n--;
    }
    queueDisplay();
}
static void queueDisplay()
 {
    int i;
    if (front>rear) 
    {
        System.out.printf("Queue is Empty\n");
        return;
    }
    System.out.print("The Queue...\n");
    for (i = front; i <=rear; i++) {
        System.out.printf("%d ", queue[i]);
    }
    System.out.printf("\n");
    return;
}
synchronized static int dequeue()
{  
    Scanner obj = new Scanner(System.in);
    int temp;
    System.out.print("Enter how many element to dequeue: ");
    int n = obj.nextInt();
    while(n!=0){
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
        System.out.println("Interrupted Exceptioncaught");
    }
    if(front == -1)  
    {  
      throw new RuntimeException("Queue is empty");  
    }  
    temp = queue[front];
    front=front+1;
    n--;
    System.out.println("Deleted: "+temp);
    }   
    queueDisplay();  
    return 0;
    }
}
class insert implements Runnable
{
    Scanner obj = new Scanner(System.in);
    Q q;
    insert(Q q){
        this.q=q;
        new Thread(this,"enqueue").start();
    }
    public void run(){
        Q.enqueue();
    }
}
class remove implements Runnable
{
    Q q;
    remove(Q q)
    {
        this.q=q;
        new Thread(this,"dequeue").start();
    }
    public void run(){
      Q.dequeue();
    }
}
