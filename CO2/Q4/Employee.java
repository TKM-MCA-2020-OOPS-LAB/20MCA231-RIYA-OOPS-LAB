import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class Employee{
	int eNo;
	String eName;
	double eSalary;
	
	void getinfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee number: ");
		eNo=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		eName=sc1.nextLine();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter Employee salary: ");
		eSalary=sc2.nextDouble();
	}
	void display()
	{
		System.out.println("Employee no: "+eNo);
		System.out.println("Employee name: "+eName);
		System.out.println("Salary: "+eSalary);
		
	}
	public static void main(String args[])
	{
		int n;
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter the nUMBER of employees: ");
		n=sc3.nextInt();
		Employee e[]=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].getinfo();
		}
		System.out.println("The employee details are:");
		for(int i=0;i<n;i++)
		{
			e[i].display();
		}
		
		int no,flag=0;
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter employee no to display details: ");
		no=sc4.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(no==e[i].eNo)
			{
				e[i].display();
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("No such employee");
		}
	}
	
}
