import java.util.Scanner;
public class Testinheritance1
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
}
System.out.println("...............................");
System.out.println("...............................");
System.out.println("THE DETAILS ARE...:");
System.out.println("...............................");
for(int i=0;i<n;i++)
{
t[i].display();
t[i].displayp();
t[i].displayt();

}

}
}
class Person
{
String gender;
String name;
int age;
String address;
Person()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter person's name:");
name= sc.nextLine();
Scanner sc1=new Scanner(System.in);
System.out.println("enter age:");
age= sc1.nextInt();
Scanner sc2=new Scanner(System.in);
System.out.println("gender:");
gender= sc2.nextLine();
Scanner sc3=new Scanner(System.in);
System.out.println("enter address:");
address= sc3.nextLine();
}
}
class Employee extends Person
{
int empid;
String companyname;
double salary;
String qualification;
Employee()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter employee id:");
empid= sc.nextInt();
Scanner sc1=new Scanner(System.in);
System.out.println("enter employee's company   name:");
companyname= sc1.nextLine();
Scanner sc2=new Scanner(System.in);
System.out.println("enter employee  salary:");
salary= sc2.nextDouble();
Scanner sc3=new Scanner(System.in);
System.out.println("enter employee's qualification:");
qualification= sc3.nextLine();
}
}
class Teacher extends Employee
{
int teacherid;
String department;
String subject;
Teacher()
{
Scanner sc4=new Scanner(System.in);
System.out.println("enter  teacherid:");
teacherid= sc4.nextInt();
Scanner sc9=new Scanner(System.in);
System.out.println("enter  department:");
subject= sc9.nextLine();
Scanner sc5=new Scanner(System.in);
System.out.println("enter  subject:");
subject= sc5.nextLine();
}
void displayp()
{
System.out.println("................................");
System.out.println("printing person's  details");
System.out.println("NAME:" +name);
System.out.println("GENDER:" +gender);
System.out.println("AGE :" +age);
System.out.println("ADDRESS :" +address);
System.out.println("...............................");
}
void display()
{
System.out.println("................................");
System.out.println("printing employee  details");
System.out.println("id:" +empid);
System.out.println("COMPANY NAME :" +companyname);
System.out.println("SALARY :" +salary);
System.out.println("ADDRESS :" +address);
System.out.println("...............................");
}
void displayt()
{
System.out.println("................................");
System.out.println("printing teacher  details");
System.out.println("TEACHER ID:"+teacherid);
System.out.println("DEPARTMENT:" +department);
System.out.println("SUBJECT :" +subject);
}
}
