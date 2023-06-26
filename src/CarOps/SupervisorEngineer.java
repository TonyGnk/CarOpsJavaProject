package CarOps;

import java.util.ArrayList;

public class SupervisorEngineer extends Engineer {

	public SupervisorEngineer(String username, String password, String firstName, String lastName) {
		super(username, password, firstName, lastName);
		// TODO Auto-generated constructor stub
	}
	
    private Registry aRegistry;
	private int SupervisorID;
	private ArrayList<Repair> ListOfRepairs;
	
	private void ShowMyRepairs() {
        this.ListOfRepairs=aRegistry.GetSupervisorsEngRepairs(this.SupervisorID);
        if(!(ListOfRepairs==null)) {
		 for(int i=0;i<ListOfRepairs.size();i++) {
			 ListOfRepairs.get(i).printDetails();
			
		 }
        }
		
	}
	
	private void ShowAllWaitRepairs() {
		
		for(int i=0;i<aRegistry.GetWaitRepairs().size();i++) {
			aRegistry.GetWaitRepairs().get(i).printDetails();
			
		}
	}
	
	private void ClaimRepair(Repair aRepair) {
		 aRepair.ClaimRepair(this);
		
		
	}
	// Ο Επιβλέπων Μηχανικός μπορεί να ολοκληρώσει την επισκευή μόνο αν έχουν γίνει όλες οι εργασίες(RepairTasks) που την απαρτίζουν
	private void CompleteRepair(Repair aRepair) {
		boolean RepairTasksFinished=true;
		for(RepairTask task :aRepair.getListOfRepairTasks()) {
			if (!(task.getStatus().equals("finished"))) RepairTasksFinished=false;
			
		}
	    if(RepairTasksFinished==true) {
	    	
	    	 aRepair.CompleteRepair();
	    	 System.out.println("Repair Completed Succesfully");
	    }
	    else  System.out.println("Repair can't be complete because there are RepairTask that are Unfinished");
		
	}
	
	private void AssignRepairTask(Engineer anEngineer,RepairTask aRepairTask,Repair aRepair) {
		
		TaskAssignment anAssignment=new TaskAssignment(anEngineer,aRepairTask);
		aRepair.getListOfAssignments().add(anAssignment);
		anEngineer.setAvailable(false);
	}
	private void ChangeAssignment(Engineer anEngineer,TaskAssignment anAssignment) {
		anAssignment.setAnEngineer(anEngineer);
		
	}

	public Registry getaRegistry() {
		return aRegistry;
	}

	public void setaRegistry(Registry aRegistry) {
		this.aRegistry = aRegistry;
	}

	public int getSupervisorID() {
		return SupervisorID;
	}

	public void setSupervisorID(int supervisorID) {
		SupervisorID = supervisorID;
	}

	public ArrayList<Repair> getListOfRepairs() {
		return ListOfRepairs;
	}

	public void setListOfRepairs(ArrayList<Repair> listOfRepairs) {
		ListOfRepairs = listOfRepairs;
	}
	
	
}