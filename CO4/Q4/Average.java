import static java.lang.Float.sum;  
import java.util.Scanner;  
public class Average {  
   public static void main(String[] args)  
    {  
        try {
            int n, count = 1;   
            float  xF, averageF, sumF = 0;   
            Scanner sc = new Scanner(System.in);     
            System.out.println("Enter the value of n");  
            n = sc.nextInt();  
            while (count <= n)   
             {   
                  System.out.println("Enter the "+count+" number?");  
                  xF = sc.nextInt();  
                  if(xF < 0){
                     throw new ArithmeticException("Negative number entered");
                  }else{
                      sumF += xF;   
                    ++count;   
                  }
                  
             }   
            averageF = sumF/n;   
            System.out.println("The Average is"+averageF);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        
    }    
}
