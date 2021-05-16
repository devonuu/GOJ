package d.collection.practice;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
  public static void main(String[] args){
    RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
    for (int i = 0; i < 10; i++) {
      System.out.println(randomNumberMaker.getSixNumber().toString());
    }
  }

  public HashSet<Integer> getSixNumber(){
    Random random = new Random();
    HashSet<Integer> ranNums = new HashSet<>();
    while (true){
      if (ranNums.size() == 6) break;
      ranNums.add(random.nextInt(45));
    }
    return ranNums;
  }
}
