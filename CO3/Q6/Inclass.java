import java.util.Scanner;
public class  Inclass
{
public static void main(String args[])
{
int choice;

rectangle obj=new rectangle();
circle c=new circle();
Scanner s=new Scanner(System.in);

System.out.println("choice");
System.out.println("1.circle\n 2.rectangle");
choice=s.nextInt();

switch(choice)
{
case 1:
System.out.println("CIRCLE");
c.input();
c.area();
c.perimeter();
break;
case 2:
System.out.println("RECTANGLE");
obj.input();
obj.area();
obj.perimeter();break;
case 3:
System.out.println("INVALID INFORMATION");
break;
 }
     
}
}
interface calculation
{


void input();
void area();
void perimeter();
}

class circle implements calculation
{
int r=0;
double pi=3.14;
double ar=0,pr=0;

public void input()
{
Scanner sc3=new Scanner(System.in);
System.out.println("enter radius of circle");
r=sc3.nextInt();
}

public void area()
{
ar=r*r*pi;
System.out.println("area of circle is="+ar);
}

public void perimeter()
{
pr=2*pi*r;
System.out.println("perimeter of circle is="+pr);
}
}
class rectangle extends circle

{
int l=0,b=0;
double ar,pr;
public void input()
{
input();
Scanner sc2=new Scanner(System.in);
System.out.println("enter length of rectangle");
l=sc2.nextInt();
System.out.println("enter breadth of rectangle");
b=sc2.nextInt();
}
public void area()
{
area();
ar=l*b;
System.out.println("area of rectangle is="+ar);
}
public void perimeter()
{
perimeter();
pr=(2*l)+(2*b);
System.out.println("perimeter of rectangle is="+pr);
}
}




