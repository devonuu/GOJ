package e.io;

import static java.io.File.separator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.basic.inheritance.Parent;

public class ManageTextFile {

  public static void main(String[] args){
    ManageTextFile manager = new ManageTextFile();
    int numberCount = 10;
    String fullPath = separator + "godofjava" + separator + "text" + separator + "numbers.txt";
    //manager.writeFile(fullPath, numberCount);
    manager.readFile(fullPath);
  }

  public void readFile(String fileName){
    FileReader fileReader = null;
    BufferedReader bufferedReader = null;
    try{
      fileReader = new FileReader(fileName);
      bufferedReader = new BufferedReader(fileReader);
      String data;
      while ( (data = bufferedReader.readLine()) != null){
        System.out.println(data);
      }
      System.out.println("Read success");
    } catch (IOException ioe){
      ioe.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (bufferedReader != null){
        try{
          bufferedReader.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fileReader != null){
        try{
          fileReader.close();
        } catch (IOException e){
          e.printStackTrace();
        }
      }
    }
  }

  public void writeFile(String fullPath, int numberCount){
    FileWriter fileWriter = null;
    BufferedWriter bufferedWriter = null;
    try{
      fileWriter = new FileWriter(fullPath);
      bufferedWriter = new BufferedWriter(fileWriter);
      for (int loop = 0; loop <= numberCount; loop++) {
        bufferedWriter.write(Integer.toString(loop));
        bufferedWriter.newLine();
      }
      System.out.println("write success");
    } catch (IOException ioe) {
      ioe.printStackTrace();
    } catch (Exception e){
      e.printStackTrace();
    } finally {
      if (bufferedWriter != null){
        try{
          bufferedWriter.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fileWriter != null){
        try{
          fileWriter.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
