package e.io;

import java.io.File;
import java.util.Date;

public class FileSample {
  public static void main(String[] args){
    FileSample sample = new FileSample();
    String pathName = "H:"+File.separator + "godofjava" + File.separator+"text";
    sample.makeDir(pathName);
    sample.checkPath(pathName);
    sample.canFileMethods(pathName);
    sample.checkFileMethods(pathName);
    sample.lastModified(pathName);
  }

  public void lastModified(String pathName){
    File file = new File(pathName);
    System.out.println(pathName+" last modified = "+new Date(file.lastModified()));
  }

  public void checkPath(String pathName){
    File file = new File(pathName);
    System.out.println(pathName+" is exists? = "+file.exists());
  }

  public void checkFileMethods(String pathName){
    File file = new File(pathName);
    System.out.println(pathName+" is directory? = "+file.isDirectory());
    System.out.println(pathName+" is file? = "+file.isFile());
    System.out.println(pathName+" is hidden? = "+file.isHidden());
  }

  public void canFileMethods(String pathName){
    File file = new File(pathName);
    System.out.println(pathName+" can read? = "+file.canRead());
    System.out.println(pathName+" can write? = "+file.canWrite());
    System.out.println(pathName+" can execute? = "+file.canExecute());
  }

  public void makeDir(String pathName){
    File file = new File(pathName);
    System.out.println("Make " + pathName + " result " + file.mkdir());
  }
}
