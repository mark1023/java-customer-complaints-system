
/**
 * Write a description of class LiftComplaint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LiftComplaint extends Complaint
{
    private int floor;
    private String lift;
    
    public LiftComplaint(int submissionId, int customerId, Customer customer, String description, String lift, int floor, Date date)
    {
        super(submissionId, customerId, customer, description, date);
        this.lift = lift;
        this.floor = floor;
    }
}
