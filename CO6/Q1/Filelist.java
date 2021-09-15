import java.io.*;  
public class Filelist
{  
public static void main(String[] args) {  
	

    File file = new File("C:\\Users\\RIYA\\Desktop\\JAVA_PGM\\20MCA231-RIYA-OOPS-LAB\\CO5\\Q6");

   
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
    
    FilenameFilter filter = new FilenameFilter() {
        public boolean accept (File dir, String name) { 
           return name.startsWith("A");
        } 
     }; 
     System.out.println("\n");
     String[] children = file.list(filter);
     if (children == null) {
    	 
        System.out.println("Either dir doesn't exist or is not a directory"); 
     } else { 
        for (int i = 0; i< children.length; i++) {
           String filename = children[i];
           System.out.println(filename);
        } 
     }
} 

}  