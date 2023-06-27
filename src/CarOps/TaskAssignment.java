package CarOps;

import java.util.ArrayList;

public class TaskAssignment  {

	private Engineer anEngineer;
	private RepairTask aRepairTask;
	private boolean finished ;
	private int TaskAssignmentID;
	private int time;
	ArrayList<AssignmentSparePart> AssignmentSparePartCatalog = new ArrayList<AssignmentSparePart>(); //The catalog that contains only the spare parts for this task assignment
	//Registry registry;

	
	public void PrintDetails() {
		System.out.println("Task Assignment("+TaskAssignmentID+") Details:");
		System.out.println("Time: " +time);
		System.out.println("Spare parts used: ");
		System.out.println("Name     Quanity");
		
		for(int i=0; i<AssignmentSparePartCatalog.size(); i++) {
			AssignmentSparePartCatalog.get(i).PrintDetails();
		}
		
	}
	
	public void addSparePart(AssignmentSparePart anAssignmentSparePart) {
		AssignmentSparePartCatalog.add(anAssignmentSparePart);
	}
	
	
	public TaskAssignment(String MechanicName,RepairTask aRepairTask) {
		this.TaskAssignmentID = Registry.TaskAssignments.size() + 1; 
		this.aRepairTask = aRepairTask;
		this.anEngineer=anEngineer;
		this.finished=false;
		Registry.TaskAssignments.add(this);
	}
	
	public void finished(int time,ArrayList<AssignmentSparePart> ListOfParts) {
		this.finished=true;
		this.AssignmentSparePartCatalog=ListOfParts;
		
	}

	public int getID() {
		return TaskAssignmentID;
	}

	public void setID(int id) {
		this.TaskAssignmentID = id;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	//public Registry getRegistry() { Σφάλμα που εμπόδιζε εκτέλεση
		//Main.registry;
	//}

	public void setRegistry(Registry registry) {
		Main.registry = registry;
	}

	public void SetTime(int time) {
		this.time = time;
	}



	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public Engineer getAnEngineer() {
		return anEngineer;
	}

	public void setAnEngineer(Engineer anEngineer) {
		this.anEngineer = anEngineer;
	}

	public RepairTask getaRepairTask() {
		return aRepairTask;
	}

	public void setaRepairTask(RepairTask aRepairTask) {
		this.aRepairTask = aRepairTask;
	}

	public int getTaskAssignmentID() {
		return TaskAssignmentID;
	}

	public void setTaskAssignmentID(int taskAssignmentID) {
		TaskAssignmentID = taskAssignmentID;
	}

	public ArrayList<AssignmentSparePart> getAssignmentSparePartCatalog() {
		return AssignmentSparePartCatalog;
	}

	public void setAssignmentSparePartCatalog(ArrayList<AssignmentSparePart> assignmentSparePartCatalog) {
		AssignmentSparePartCatalog = assignmentSparePartCatalog;
	}
	
	
	

}