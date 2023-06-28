package CarOps;

import java.util.ArrayList;

public class Engineer extends SystemUser {

	private int EngineerID;
	private boolean Available;
	public static int totalEngineers=0;
	private TaskAssignment aTaskAssignment;
	
	
	//Ολοκλήρωση Ανάθεσης απο τον Μηχανικό
	public void FinishAssignment(TaskAssignment anAssignment,ArrayList<AssignmentSparePart> ListOfParts) {
		this.Available=true;
		anAssignment.setFinished(true);
		anAssignment.getaRepairTask().setStatus("finished");
		for(AssignmentSparePart Part:ListOfParts) {
		 anAssignment.getaRepairTask().getaRepairFolder().getaRepair().getListOfParts().add(Part);
		}
		
	};
	
	//Ο Μηχανικός μπορεί να προσθέτει τα εξαρτήματα που χρησιμοποίησε και την ποσότητα τους κατά την διάρκεια της ανάθεσης
	public void AddSparePartToAssignment(TaskAssignment anAssignment,SparePart aPart,int Quantity) {
		anAssignment.getAssignmentSparePartCatalog().add(new AssignmentSparePart(anAssignment,aPart,Quantity));
		
	}
	
	//Προβολή της ανάθεσης από τον Μηχανικό
	public void PrintAssignment() {
		String assignmentname=aTaskAssignment.getaRepairTask().getaTask().getName();
		System.out.println("Ανάθεση :" );
	}
	

	public Engineer GetAvailableEngineer() {
		// TODO - implement �ngineer.GetAvailableEngineer
		throw new UnsupportedOperationException();
	}
	public Engineer (String username, String password, String firstName, String lastName){
		super(username, password,firstName,lastName);
		totalEngineers+=1;
		this.EngineerID=totalEngineers;
		this.Available=true;
		Registry.Engineers.add(this);
	}
	public int getEngineerID() {
		return EngineerID;
	}
	public void setEngineerID(int engineerID) {
		EngineerID = engineerID;
		
	}
	public boolean isAvailable() {
		return Available;
	}
	public void setAvailable(boolean available) {
		Available = available;
	}
	public void PrintAssigmentDetails(TaskAssignment aTA) {
		
	}
}