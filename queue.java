/*
Define an interface “QueueOperations” which declares methods for a static queue. Define a class “MyQueue” which 
contains an array and front and rear as data members and implements the above interface. Initialize the queue
using a constructor. Write the code to perform operations on a queue object.
*/
import java.util.*;
public class queue {
    public static void main(String[] args) {
         MyQueue q = new MyQueue();
        Scanner obj = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter operation to be performed(1-4)\n1.Enqueue  2.Dequeue  3.Display  4.Exit ");
            int op = obj.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println("Enter num to enqueue:");
                    int num = obj.nextInt();
                    q.enqueue(num);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3: 
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting program!");
                    System.exit(0);
            }
        }
    }
}
interface QueueOperations {
 void enqueue(int item);  
 int dequeue(); 
 void display(); 
}
class MyQueue implements QueueOperations {
 private static final int MAX_SIZE = 10;
 private int[] queueArray;
 private int front;
 private int rear;
 public MyQueue() {
 queueArray = new int[MAX_SIZE];
 front = -1;
 rear = -1;
 }
 public void enqueue(int item) {
 if (rear == MAX_SIZE - 1) {
 System.out.println("Queue is full. Cannot enqueue " + item);
 } else {
 queueArray[++rear] = item;
 if (front == -1) {
 front = 0;
 }
 System.out.println(item + " enqueued to the queue.");
 }
 }
 public int dequeue() {
 if (front == -1) {
 System.out.println("Queue is empty. Cannot dequeue.");
 return -1;
 } else {
 int dequeuedItem = queueArray[front++];
 if (front > rear) {
 front = rear = -1;
 }
 System.out.println(dequeuedItem + " dequeued from the queue.");
 return dequeuedItem;
 }
 }
 public void display() {
 if (front == -1) {
 System.out.println("Queue is empty.");
 } else {
 System.out.print("Queue elements: ");
 for (int i = front; i <= rear; i++) {
 System.out.print(queueArray[i] + " ");
 }
 System.out.println();
 }
 }
}
