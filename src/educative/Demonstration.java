package educative;
/**
 * Project : godofjava
 * Created by gonuu
 * Date : 2021-07-22
 * Time : 오후 9:41
 * Blog : http://devonuu.tistory.com
 * Github : http://github.com/devonuu
 */


public class Demonstration {

    public static void main(String[] args) throws InterruptedException {
        SumUpExample.runTest();
    }
}

class SumUpExample{
    long starRange;
    long endRange;
    long counter = 0;
    static long MAX_NUM = Integer.MAX_VALUE;

    public SumUpExample(long starRange, long endRange){
        this.starRange = starRange;
        this.endRange = endRange;
    }

    public void add(){
        for (long i = starRange; i <= endRange; i++) {
            counter += i;
        }
    }

    private static void oneThread() {
        long start = System.currentTimeMillis();
        SumUpExample e = new SumUpExample(1, MAX_NUM);
        e.add();
        long end = System.currentTimeMillis();
        System.out.println("Single thread final count = " + e.counter + " took " + (end - start));
    }

    private static void twoThreads() throws InterruptedException {
        long start = System.currentTimeMillis();
        SumUpExample s1 = new SumUpExample(1, MAX_NUM / 2);
        SumUpExample s2 = new SumUpExample(MAX_NUM / 2, MAX_NUM);

        Thread t1 = new Thread(() -> {
            s1.add();
        });

        Thread t2 = new Thread(() ->{
            s2.add();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long finalCount = s1.counter + s2.counter;
        long end = System.currentTimeMillis();
        System.out.println("Two theads final count = " + finalCount + " took " + (end - start));
    }

    public static void runTest() throws InterruptedException {
        oneThread();
        twoThreads();
    }
}
