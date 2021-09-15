import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Co6_Q2 {
	 public static void main(String[] args) {

	  try {
          FileWriter writer = new FileWriter("E:\\java\\co6\\c.txt",true);
          writer.write("ARE YOU HAPPY\n");
          writer.close();
          FileReader reader = new FileReader("E:\\java\\co6\\c.txt");
          BufferedReader br= new BufferedReader(reader);
          String line;
          System.out.println("\n  Read Data From The  File \n");
          while ((line = br.readLine()) != null) {
              System.out.println(line);
          }
          reader.close();

      } catch (IOException e) {
          System.out.println("\n Error Occured.");
      }

  }


}