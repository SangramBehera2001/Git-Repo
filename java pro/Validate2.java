public class Validate2 
{
     
    boolean validate(String name)
    {
        return name.matches("[a-zA-Z\\s]+");
    }
    
    
    boolean validate(int age)
    {
        return age>=3 && age<=15;
    }

    public static void main(String[] args) {
      Validate2 v = new Validate2();
      
      System.out.println(v.validate("Gudu"));
      System.out.println(v.validate(12));
    }
  }
