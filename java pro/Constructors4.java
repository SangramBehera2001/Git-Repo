
class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;
    
    public Customer(String custId,String name)
    {
        this.custId=custId;
        this.name=name;
    }
    public Customer(String custId,String name,String address,String phno)
    {
        this.custId=custId;
        this.name=name;
        setAddress(address);
        setPhno(phno);
    }
    
    public String getCustId(){return custId;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
}
public class Constructors4 {
  public static void main(String[] args) {
    Customer c = new Customer("AB-09", "Gudu" , "idco colony", "2023");
    System.out.println(c.getCustId() + "," + "\n" +  c.getName() + "," + "\n" + c.getAddress());
  }
}
