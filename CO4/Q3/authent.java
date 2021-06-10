import java.util.Scanner;
public class Authent
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String usrname,passwd;
System.out.println("ENTER username:");
usrname=sc.nextLine();
System.out.println("ENTER password:");
passwd=sc.nextLine();

int name=usrname.length();
int length=passwd.length();
try
{
if(name>7 && length>7)
{
System.out.println("successfully login");
}
else
{
throw new invalidexception("information are invalid");
}
}
catch(invalidexception e)
{
System.out.println(e.getMessage());
}
}
}