@FunctionalInterface
interface MyLamda{
  public void display();
}

// public class Lamda1 {
//   public static void main(String[] args) {
//     MyLamda m = new MyLamda() {
//       public void display(){
//         System.out.println("Hi Gudu");
//       }
//      };
//      m.display();
//   }
// }
public class Lamda1 {
  public static void main(String[] args) {
    MyLamda m = 
      ()->{
        System.out.println("Hi Gudu");
      
     };
     m.display();
  }
}