import java.util.Scanner;
public class Testinheritance
{
public static void main(String args[])
{
int n;
Scanner sc6=new Scanner(System.in);
System.out.println("enter number of employees:");
n=sc6.nextInt();
Teacher t[]= new Teacher[n];
for(int i=0;i<n;i++)
{
t[i]=new Teacher();
//t[i].getinfo();
//t[i].getinfo1();

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
class Employee
{
int empid;
String name;
double salary;
String address;
Employee()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter employee   id:");
empid= sc.nextInt();
Scanner sc1=new Scanner(System.in);
System.out.println("enter employee  name:");
name= sc1.nextLine();
Scanner sc2=new Scanner(System.in);
System.out.println("enter employee  salary:");
salary= sc2.nextDouble();
Scanner sc3=new Scanner(System.in);
System.out.println("enter employee  address:");
address= sc3.nextLine();
}
}
class Teacher extends Employee
{
String department;
String subject;
Teacher()
{
Scanner sc4=new Scanner(System.in);
System.out.println("enter  department:");
subject= sc4.nextLine();
Scanner sc5=new Scanner(System.in);
System.out.println("enter  subject:");
subject= sc5.nextLine();
}
void display()
{
System.out.println("................................");
System.out.println("id:" +empid);
System.out.println("NAME :" +name);
System.out.println("SALARY :" +salary);
System.out.println("ADDRESS :" +address);
System.out.println("DEPARTMENT:" +department);
System.out.println("SUBJECT :" +subject);
System.out.println("...............................");
}

}



