
class Product
{
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    
    public Product(String itemno)
    {
        this.itemNo=itemno;
    }
    public Product(String itemno,String name)
    {
        itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno,String name,double price,short qty)
    {
        itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    
    public String getItemNo()
    {
        return  itemNo;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public short getQuantity()
    {
        return qty;
    }
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(short qty)
    {
        this.qty=qty;
    }
}

public class Constructors3
{
    public static void main(String[] args) 
    {
        Product p = new Product("AD-34");
        System.out.println(p.getItemNo());

        p.setPrice(67.85);
        System.out.println(p.getPrice());

    }   
}
