import java.util.*;
/**
 * Write a description of class CCSImplementation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CCSImplementation implements CCS
{
    private HashMap<Integer, Submission> submissions;
    private HashMap<Integer, Customer> customers;
    private HashMap<Integer, Staff> staff;
    
    private int HIGHEST_SUBMISSION = 1;
    private int HIGHEST_CUSTOMER = 1;
    private int HIGHEST_STAFF = 1;
    
    public CCSImplementation()
    {
        submissions = new HashMap<Integer, Submission>();
        customers = new HashMap<Integer, Customer>();
        staff = new HashMap<Integer, Staff>();      
    }
    
    public List<Submission> listNewComplaints()
    {
         ArrayList<Submission> convertedList = new ArrayList<Submission>(submissions.values());
         ArrayList<Submission> newComplaints = new ArrayList<Submission>();
         for(Submission sub: convertedList)
         {
             if(((Complaint)sub).assigned())
             {
                 newComplaints.add(sub);
             }
         }
         return newComplaints;
    }
    
    public  void	addComment(int submissionId, int customerId, java.lang.String comment, Date date)
    {
        Comment comm = new Comment(submissionId, customerId, getCustomer(customerId), comment, date);
        submissions.put(submissionId, comm);
    }
          
    public  void	addCustomer(int customerId, java.lang.String name, java.lang.String address, java.lang.String email, java.lang.String phone) 
    {
        Customer cust = new Customer(customerId, name, address, email, phone);
        customers.put(customerId, cust);
    } 
          
    public  void	addGeneralComplaint(int submissionId, int customerId, java.lang.String description, Date date)
    {
        Complaint gc = new Complaint(submissionId, customerId, getCustomer(customerId), description, date);
        submissions.put(submissionId, gc);
    }
          
    public  void	addLiftComplaint(int submissionId, int customerId, java.lang.String description, java.lang.String lift, int floor, Date date)
    {
        LiftComplaint lc = new LiftComplaint(submissionId, customerId, getCustomer(customerId), description, lift, floor, date);
        submissions.put(submissionId, lc);
    }
          
    public  void	addStaff(int staffId, java.lang.String name, java.lang.String role, java.lang.String department)
    {
        Staff staffMember = new Staff(staffId, name, role, department);
        staff.put(staffId, staffMember);
    }
       
    public  void	addStaffComplaint(int submissionId, int customerId, java.lang.String description, int staffId, Date date)
    {
        StaffComplaint sc = new StaffComplaint(submissionId, customerId, getCustomer(customerId), description, staffId, date);
        submissions.put(submissionId, sc);
    }
    
    public  List<Customer>	getCustomerList()
    {
        return new ArrayList<Customer>(customers.values());
    }
        
    public  void	archiveSubmissions()
    {
        Iterator it = submissions.values().iterator();
        while(it.hasNext())
        {
            Submission item = (Submission) (it.next());
            if(item.isArchivable())
            {
                System.out.println(item.getArchiveData());
            }
        }
    }
          
    public  void	assignResolver(int complaintId, int staffId, Date deadLine)
    {
        Submission sub = submissions.get(complaintId);
        ((Complaint)sub).assignResolver(staffId, deadLine);
    }
          
    public  List<Action>	getActionsForComplaint(int complaintId) 
    {
        Submission sub = submissions.get(complaintId);
        return ((Complaint)sub).getActionsList();
        
    }
          
    public  Customer	getCustomer(int customerId)
    {
        return customers.get(customerId);
    }
                        
    public  int	getNewCustomerId()
    {
        int newCustId = HIGHEST_CUSTOMER++;
        return newCustId;
    }
          
    public  int	getNewStaffId()
    {
        int newStaffId = HIGHEST_STAFF++;
        return newStaffId;
    }
          
    public  int	getNewSubmissionId()
    {
        int newSubId = HIGHEST_SUBMISSION++;
        return newSubId;
    }
          
    public  Staff	getStaff(int staffId)
    {
        return staff.get(staffId);
    }
          
    public  List<Staff>	getStaffList()
    {
        return new ArrayList<Staff>(staff.values());
    }
     
    public  Submission getSubmission(int submissionId)
    {
        return submissions.get(submissionId);
    }
       
    public  List<Submission> getSubmissionList()
    {
        return new ArrayList<Submission>(submissions.values());
    }
         
    public  void	recordAction(int complaintId, java.lang.String actionTaken, Date date)
    {        
        Submission sub = submissions.get(complaintId);
        ((Complaint)sub).addAction(new Action(actionTaken, date));
    }
         
    public  void	recordComplaintResolved(int complaintId)
    {
        Submission sub = submissions.get(complaintId);
        ((Complaint)sub).resolved();
    }
         
    public  void	removeCustomer(int customerId)
    {
        customers.remove(customerId);        
    }
}
