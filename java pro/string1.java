import java.util.*;
public class string1{
    public static void main(String args[]){
      {
            
        System.out.println("Enter your name, age, salary");
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // Read full name

        System.out.println("Enter your age: ");
        int age = sc.nextInt(); // Read age

        sc.nextLine(); // Consume the newline left in the buffer

        System.out.println("Enter your salary: ");
        float salary = sc.nextFloat(); // Read salary
        
        System.out.println("Name is " + name + " age is " + age + " salary is " + salary );
        
        }
      }
        // System.out.println("Enter base and height");
        // float base = sc.nextFloat();
        // float height = sc.nextFloat();
        
        // float area = base*height/2;
        // System.out.println("area is " + area);
        
    }

