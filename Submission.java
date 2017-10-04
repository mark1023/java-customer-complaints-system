
/**
 * Write a description of class Submission here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Submission
{
    private int submissionId;
    private int customerId;
    private String description;   
    private Customer customer;
    private Date date;
    
    public Submission(int submissionId, int customerId, Customer customer, String description, Date date)
    {
        this.submissionId = submissionId;
        this.customerId = customerId;
        this.description = description;
        this.date = date;
        this.customer = customer;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public int getSubmissionId()
    {
        return submissionId;
    }
    
    public abstract boolean isArchivable();
    
    public String getArchiveData()
    {
        String archiveData;
        archiveData = "CUSTOMER NAME: " + customer.getName() + "\n" +
           "CUSTOMER ADDRESS: " + customer.getAddress() + "\n" +
           "CUSTOMER EMAIL: " + customer.getEmail() + "\n" +
           "CUSTOMER PHONE NO: " + customer.getPhone() + "\n" +
           "";
        return archiveData;
        
    }
    
    
}
