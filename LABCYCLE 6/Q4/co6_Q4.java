import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

 class co6_Q4 {

	public static void main(String args[]) throws IOException
	{ 
    FileInputStream fr = new FileInputStream("E:\\java\\co6\\integer.txt");
    FileOutputStream fw1 = new FileOutputStream("E:\\java\\co6\\even.txt");
    FileOutputStream fw2 = new FileOutputStream("E:\\java\\co6\\odd.txt");
    System.out.println("\nOdd Numbers & Even Numbers Are Copied To Separate Files......\n"); 
    int i;
    while((i=fr.read()) != -1) 
   	  
    {
     if(i%2==0)
     fw1.write(i);
     else
     fw2.write(i);
    }
    
    fr.close();
    fw1.close();
    fw2.close();
    
}
}