import java.util.Scanner;
import java.io.*;
class Bubble
{
public static void main(String args[])
{
int i,j,temp,n,MAX=1000;
int a[]=new int[MAX];
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
n=sc.nextInt();
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
System.out.println("sorted elemts are ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
System.out.println("\t");
}
}
}
