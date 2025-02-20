class MyThread4 extends Thread{
  public void run(){
    int count =1;
    while(true){
      System.out.println(count++);
    //   try{
    //     Thread.sleep(100);
    //     // MyThread3.sleep(1000);
    //   }
    //   catch(InterruptedException e){
    //   System.out.println(e);
    // }
  }
  }
}
public class Thread11 {
  public static void main(String[] args) throws Exception
  {
    MyThread4 m = new MyThread4();
    m.setDaemon(true);//stops the infinite loop with the main method after some second
    m.start();
    // Thread.sleep(100);
    Thread mainThread = Thread.currentThread();
    mainThread.join();//even after using Daemon join can run the main method
  }
}

