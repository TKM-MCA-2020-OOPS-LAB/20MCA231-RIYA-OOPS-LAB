import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Threadq1
{

public static void main(String arg[]) throws InterruptedException
{
ThreadA a = new ThreadA();
ThreadB b = new ThreadB();
a.start();
a.sleep(200);
b.start();
b.sleep(200);

}
}
class ThreadA extends Thread
{
public void run()
{
int q,i;
Scanner sc= new Scanner(System.in);
System.out.print("\n");
System.out.println("enter a limit(for finding multiples of 5 ):");
q=sc.nextInt();
for (i=1;i<=q;i++)
System.out.println(i+" * 5 = "+ 5*i);
System.out.print("\n");

System.out.println("********************************************");
System.out.println("enter LIMIT N for printing prime numbers");
}
}
class ThreadB extends Thread
{
public  void run()
{
int i, j, flag,N;
    
    System.out.println("enter LIMIT:");
    Scanner sc= new Scanner(System.in);
    N=sc.nextInt();
    System.out.println("Prime numbers between 1 and " + N + " are:");
    for (i = 1; i <= N; i++)
    {

        if (i == 1 || i == 0)
            continue;
        flag = 1;
 
        for (j = 2; j <= i / 2; ++j)
        {
            if (i % j == 0)
            {
                flag = 0;
                break;
            }
        }
 
        if (flag == 1)
            System.out.print(i + " ");
    }
    System.out.print("\n");
}
}






