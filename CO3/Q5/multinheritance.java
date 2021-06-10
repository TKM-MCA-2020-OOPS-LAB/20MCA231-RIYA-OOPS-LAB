import java.util.Scanner;
public class multinheritance
{
public static void main(String args[])
{
int n;
Scanner sc6=new Scanner(System.in);
System.out.println("enter number of students:");
n=sc6.nextInt();
Result t[]= new Result[n];
for(int i=0;i<n;i++)
{
t[i]=new Result();
}
System.out.println("...............................");
System.out.println("...............................");
System.out.println("THE DETAILS ARE...:");
System.out.println("...............................");
for(int i=0;i<n;i++)
{
t[i].display();
}

}
}
class Student
{
String name;
int age;
int mark;
Student()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your  name:");
name= sc.nextLine(); 
Scanner sc1=new Scanner(System.in);
System.out.println("enter age:");
age= sc1.nextInt();
Scanner sc3=new Scanner(System.in);
System.out.println("enter YOUR marks:");
mark= sc3.nextInt();
}
}
class Sports extends Student
{
int score;
Sports()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your marks(SPORTS):");
score= sc.nextInt();
}
}
class Result extends  Sports
{
int total_result;
Result()
{
total_result=mark+score;
}
void display()
{
System.out.println("................................");
System.out.println("TOTAL MARK");
System.out.println("MARKS =:" +mark);
System.out.println("MARK(sports) = :" +score);
System.out.println("TOTAL MARK = :" +total_result);
System.out.println("...............................");
}
}

