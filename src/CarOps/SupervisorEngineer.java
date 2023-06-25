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
	
	private void ShowAllAvailableRepairs() {
		
		for(int i=0;i<aRegistry.GetAvailabeRepairs().size();i++) {
			aRegistry.GetAvailabeRepairs().get(i).printDetails();
			
		}
	}
	
	private void ClaimRepair(Repair aRepair) {
		aRepair.ClaimRepair(this);
		
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