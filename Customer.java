
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    private int customerId;
    private String name;
    private String address;
    private String email;
    private String phone;
    
    public Customer(int customerId, String name, String address, String email, String phone)
    {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
    
    public int getCustomerId()
    {
        return customerId;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhone()
    {
        return phone;
    }
}

