import java.util.*;
public class Arraylist
{
public static void main(String[] args)
{
ArrayList<String> obj=new ArrayList<String>();
obj.add("one");
obj.add("Three");
obj.add("four");
obj.add("five");
obj.add(1,"two");
System.out.println("\n Array list after operation:");
for(String str:obj)
System.out.println(str);
obj.remove("five");
obj.remove(3);
System.out.println("\n Array list after remove operation");
for(String str:obj)
System.out.println(str);
Collections.sort(obj);
System.out.println(" \n Array list after sorting");
for(String str : obj)
System.out.println(str);
System.out.println("\n Object at index 2:"+obj.get(2));
System.out.println("\n six is in the arraylist:"+obj.contains("six"));
System.out.println("\n Two is in the arraylist:"+obj.contains("one"));
System.out.println("\n size of the arraylist :"+obj.size());
obj.clear();
System.out.println("\n arraylist after clear method:"+obj);
}
}


