class Mydata{
  
  synchronized void display(String str){
    // synchronized(this){
    for(int i =0; i < str.length(); i++){
      System.out.print(str.charAt(i));
    }
  //}
  }
}

class Mythreads extends Thread{
  Mydata d;
  Mythreads (Mydata d){
    this.d = d;
  }
  public void run(){
    d.display("Hello World, I am Sangram Behera");
  }
}

class Mythreadz extends Thread{
  Mydata d;
  Mythreadz (Mydata d){
    this.d = d;
  }
  public void run(){
    d.display(" Welcome Guys, Have a Drink");
  }
}

public class Synchronised1 {
  public static void main(String[] args) {
    
    Mydata d = new Mydata();
    Mythreads t1 = new Mythreads(d);
    Mythreadz t2 = new Mythreadz(d);

    t1.start();
    t2.start();
  }
}
