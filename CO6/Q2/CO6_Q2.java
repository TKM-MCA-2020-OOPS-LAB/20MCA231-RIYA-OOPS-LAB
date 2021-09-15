import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CO6_Q2 {
	 public static void main(String[] args) {

	  try {
          FileWriter writer = new FileWriter("C:\\Users\\RIYA\\Desktop\\JAVA_PGM\\20MCA231-RIYA-OOPS-LAB\\CO6\\D.txt",true);
          writer.write("Sample file is Created...\n");
          writer.close();
          FileReader reader = new FileReader("C:\\Users\\RIYA\\Desktop\\JAVA_PGM\\20MCA231-RIYA-OOPS-LAB\\CO6\\D.txt");
          BufferedReader br= new BufferedReader(reader);
          String line;
          System.out.println("\n Data Read From The Sample File \n");
          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
          reader.close();

      } catch (IOException e) {
          System.out.println("\n Error Occured.");
      }

  }


}