package e.thread;

public class RunDaemonThreads {
  public static void main(String[] args){
    RunDaemonThreads sample = new RunDaemonThreads();
    sample.checkThreadProperty();
  }

  public void checkThreadProperty(){
    ThreadSample th1 = new ThreadSample();
    ThreadSample th2 = new ThreadSample();
    ThreadSample daemonThread = new ThreadSample();

    System.out.println("th1 id = " + th1.getId());
    System.out.println("th2 id = " + th2.getId());

    System.out.println("th1 name = " + th1.getName());
    System.out.println("th2 name = " + th2.getName());

    System.out.println("th1 property = " + th1.getPriority());

    daemonThread.setDaemon(true);
    System.out.println("th1 isDaemon = "+th1.isDaemon());
    System.out.println("daemonThread isDaemon = "+daemonThread.isDaemon());
  }
}
