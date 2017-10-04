import java.util.*;
/**
 * Write a description of class Complaint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Complaint extends Submission
{
    private boolean isResolved;
    private boolean isAssigned;
    
    private int staffId;
    private Date deadLine;
    
    private ArrayList<Action> actions = new ArrayList<Action>();
    
    public Complaint(int submissionId, int customerId, Customer customer, String description, Date date)
    {
        super(submissionId, customerId, customer, description, date);
    }
    
    public void assignResolver(int staffId, Date deadLine)
    {
        this.staffId = staffId;
        this.deadLine = deadLine;
        isAssigned = true;
    }
    
    public void addAction(Action action)
    {
        actions.add(action);
    }
    
    public List<Action> getActionsList()
    {
        return actions;
    }
    
    public void resolved()
    {
        isResolved = true;
    }
    
    @Override
    public boolean isArchivable()
    {
        return isResolved;      
    }
    
    public boolean assigned()
    {
        return isAssigned;
    }
}
