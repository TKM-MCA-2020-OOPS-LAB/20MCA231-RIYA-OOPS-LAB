import java.util.Scanner;

public class Area
{
 float area(float a)
 {
	 float sarea=a*a;
	 System.out.println("Area of Square: "+sarea);
	 return sarea;
	
 }
 float area(float a, float b)
 {
	 float rarea=a*b;
	 System.out.println("Area of Rectangle: "+rarea);
	 return rarea;
	
 }
 double area(double c)
 {
	 double carea=3.14*c*c;;
	 System.out.println("Area of Circle: "+carea);
	 return carea;
	
 }
public static void main(String[] arg) {
	Area ob= new Area();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter sides of   shapes:");
	float a=sc.nextInt();
	float b=sc.nextInt();
	double c=sc.nextInt();
	ob.area(a);
	ob.area(a,b);
	ob.area(c);	
	
}
}
