
/**
 * Write a description of class Comment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comment extends Submission
{
    public Comment(int submissionId, int customerId, Customer customer, String description, Date date)
    {
        super(submissionId, customerId, customer, description, date);
    }
    
    @Override
    public boolean isArchivable()
    {
        return true;
    }
}
