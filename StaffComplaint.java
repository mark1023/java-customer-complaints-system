
/**
 * Write a description of class StaffComplaint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StaffComplaint extends Complaint
{
    private int staffId;
    
    public StaffComplaint(int submissionId, int customerId, Customer customer, java.lang.String description, int staffId, Date date)
    {
        super(submissionId, customerId, customer, description, date);
        this.staffId = staffId;
    }
    
}
