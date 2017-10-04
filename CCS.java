
/**
 * Write a description of interface CCS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface CCS
{
    abstract  void	addComment(int submissionId, int customerId, java.lang.String comment, Date date) ;
          
    abstract  void	addCustomer(int customerId, java.lang.String name, java.lang.String address, java.lang.String email, java.lang.String phone) ;
          
    abstract  void	addGeneralComplaint(int submissionId, int customerId, java.lang.String description, Date date) ;
          
    abstract  void	addLiftComplaint(int submissionId, int customerId, java.lang.String description, java.lang.String lift, int floor, Date date) ;
          
    abstract  void	addStaff(int staffId, java.lang.String name, java.lang.String role, java.lang.String department) ;
       
    abstract  void	addStaffComplaint(int submissionId, int customerId, java.lang.String description, int staffId, Date date) ;
        
    abstract  void	archiveSubmissions() ;
          
    abstract  void	assignResolver(int complaintId, int staffId, Date deadLine) ;
          
    abstract  java.util.List<Action>	getActionsForComplaint(int complaintId) ;
          
    abstract  Customer	getCustomer(int customerId) ;
          
    abstract  java.util.List<Customer>	getCustomerList() ;
          
    abstract  int	getNewCustomerId() ;
          
    abstract  int	getNewStaffId() ;
          
    abstract  int	getNewSubmissionId() ;
          
    abstract  Staff	getStaff(int staffId) ;
          
    abstract  java.util.List<Staff>	getStaffList() ;
     
    abstract  Submission getSubmission(int submissionId) ;
       
    abstract  java.util.List<Submission> getSubmissionList() ;
         
    abstract  void	recordAction(int complaintId, java.lang.String actionTaken, Date date) ;
         
    abstract  void	recordComplaintResolved(int complaintId) ;
         
    abstract  void	removeCustomer(int customerId) ;
    
}
