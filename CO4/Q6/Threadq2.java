import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Threadq2
{

public static void main(String arg[]) throws InterruptedException
{
ThreadA at = new ThreadA();
Thread a=new Thread(at);
ThreadB bt = new ThreadB();
Thread b= new Thread(bt);
a.start();
a.sleep(200);
b.start();
b.sleep(200);

}
}
class ThreadA implements Runnable
{
public void run()
{
int n, firstTerm = 0, secondTerm = 1;
Scanner sc= new Scanner(System.in);
System.out.println(" printing fibonacci series");
n=sc.nextInt();
System.out.println("Fibonacci Series till " + n + " terms:");
for (int i = 1; i <= n; ++i) {
      System.out.print(firstTerm + ", ");
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
}
 System.out.print("\n");

System.out.println("**********************************************");
System.out.println("enter a range for printing even numbers \n enter lower limit:");
}
}
class ThreadB implements Runnable
{
public  void run()
{
int l, u, flag,N,i;
System.out.println("enter limit:");
    Scanner sc= new Scanner(System.in);
    l=sc.nextInt();
System.out.println("enter upper limit:");
    
    u=sc.nextInt();
    System.out.println("even numbers between " + l + " and " + u + " are:");
    for (i = l; i <= u; i++)
    {

        if (i%2!=0)
            continue;
        
       else 
            {
              System.out.println(i+" ") ; 
            }
        }
 
    System.out.print("\n");
}
}
