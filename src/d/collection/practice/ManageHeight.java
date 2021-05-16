package d.collection.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ManageHeight {
  static ArrayList<ArrayList<Integer>> gradeHeight;
  public static void main(String[] args){
    ManageHeight manageHeight = new ManageHeight();
    manageHeight.setData();
    /*for (int i = 1; i <= 5; i++) {
      manageHeight.printHeight(i);
    }*/
    int i = 1;
    while (i <= gradeHeight.size()){
      manageHeight.printAverage(i);
      i++;
    }
  }

  public void printAverage(int classNo){
    System.out.println("Class No.:"+classNo);
    double sum = 0;
    int cnt = 0;
    for(int height : gradeHeight.get(classNo - 1)){
      sum += height;
      cnt++;
    }
    System.out.println("Height average:"+sum/cnt);
  }

  public void printHeight(int classNo){
    System.out.println("Class No.:"+classNo);
    for(int height : gradeHeight.get(classNo - 1)){
      System.out.println(height);
    }
  }

  public void setData(){
    gradeHeight = new ArrayList<>();
    ArrayList<Integer> heightList = new ArrayList<>();
    heightList.add(170);
    heightList.add(180);
    heightList.add(173);
    heightList.add(175);
    heightList.add(177);
    gradeHeight.add(heightList);

    heightList = new ArrayList<>();
    heightList.add(160);
    heightList.add(165);
    heightList.add(167);
    heightList.add(186);
    gradeHeight.add(heightList);

    heightList = new ArrayList<>();
    heightList.add(158);
    heightList.add(177);
    heightList.add(187);
    heightList.add(176);
    gradeHeight.add(heightList);

    heightList = new ArrayList<>();
    heightList.add(173);
    heightList.add(182);
    heightList.add(181);
    gradeHeight.add(heightList);

    heightList = new ArrayList<>();
    heightList.add(170);
    heightList.add(180);
    heightList.add(165);
    heightList.add(177);
    heightList.add(172);
    gradeHeight.add(heightList);
  }
}
