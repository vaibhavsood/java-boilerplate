import java.io.*;
import java.util.*;

class FileHandling {
  public static void readFileByLine(String filename) {
    try {
      BufferedReader br = new BufferedReader(new FileReader(filename));

      String str = null;
      
      while ((str = br.readLine()) != null) { 
        System.out.println("line:" + str);
      }
    } catch (IOException e) {
      System.out.println("Error accessing input file!");
    }
  }
  
  public static void readFileByWord(String filename) {
    try {
      Scanner s = new Scanner(new File(filename));

      while (s.hasNext()) {
        System.out.println("word:" + s.next());
      }
    } catch (IOException e) {
      System.out.println("Error accessing input file!");
    }    
  }
  
  public static void main(String args[]) {
    //readFileByLine("test.txt");
    //readFileByWord("test.txt");
    
    Object[] test = new Object[] {1, 3.0, new ArrayList<Integer>(), "hello"};
    
    System.out.println(Arrays.toString(test));
  }
}