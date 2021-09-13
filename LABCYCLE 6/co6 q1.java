import java.io.File;

class Main {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("C:\\Users\\Dell\\Desktop\\Record");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}