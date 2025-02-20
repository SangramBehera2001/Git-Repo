class MyThread3 extends Thread{
  public MyThread3(String name){
    super(name);
  }
  public void run(){
    int count =1;
    while(true){
      System.out.println(count++);
      try{
        Thread.sleep(1000);
        // MyThread3.sleep(1000);
      }
      catch(InterruptedException e){
      System.out.println(e);
    }
  }
  }
}
public class Thread12 {
  public static void main(String[] args) throws Exception
  {
    MyThread3 m = new MyThread3("ThreadX");
    m.start();
  }
}
