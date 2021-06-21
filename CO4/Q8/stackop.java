import java.util.Scanner;
import java.io.*;

public class stackop
{
static final int MAX=1000;
int a[]=new int[MAX],n;
int top=-1,ch,item,i;
Scanner sc=new Scanner(System.in);
public void operation()
{
System.out.println("enter the size of the array");
n=sc.nextInt();
do
{

 System.out.println("\n");
System.out.println(" Choice");

System.out.println("\n 1.Push \n 2.Pop \n 3.Exit");
System.out.println("enter your choice");
ch=sc.nextInt();
switch(ch)
{
case 1: 
        if(top>=n-1)
        {
        System.out.println("Stack overflow");
        System.out.println("\n");
        }
       else
{
System.out.println("enter the element :");
item=sc.nextInt();
a[++top]=item;
}
break;
case 2: 
if(top==-1)
{
System.out.println("Stack underflow");

 System.out.println("\n");
}
else
{
item=a[top];
top=top-1;
}
break;
case 3: break;
default:System.out.println("Enter valid option");
}
if(top<0)
{
System.out.println("\n  stack is empty");
}


else
{
System.out.println("elements...............");
for(i=top;i>=0;i--)
{
System.out.println(a[i]);
}
}
}
while(ch!=3);
}
public static void main(String args[])
{
stackop obj=new stackop();
obj.operation();
}
}

