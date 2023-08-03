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
	
	public void ShowMyRepairs() {
        this.ListOfRepairs=aRegistry.GetSupervisorsEngRepairs(this.SupervisorID);
        if(!(ListOfRepairs==null)) {
		 for(int i=0;i<ListOfRepairs.size();i++) {
			 ListOfRepairs.get(i).printDetails();
		 }
        }
		else System.out.println("You don't have any Repairs");		
	}
	
	public void ShowAllWaitRepairs() {		
		for(int i=0;i<aRegistry.GetWaitRepairs().size();i++) {
			aRegistry.GetWaitRepairs().get(i).printDetails();		
		}
	}
	
	public void ClaimRepair(Repair aRepair) {
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
	
	public TaskAssignment AssignRepairTask(Engineer anEngineer,RepairTask aRepairTask,Repair aRepair) {
		
		TaskAssignment anAssignment=new TaskAssignment("name",aRepairTask);
		aRepair.getListOfAssignments().add(anAssignment);
		anEngineer.setAvailable(false);
		return anAssignment;
	}
	public void ChangeAssignment(Engineer anEngineer,TaskAssignment anAssignment) {
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