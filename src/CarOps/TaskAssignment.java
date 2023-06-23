package CarOps;

import java.util.ArrayList;

public class TaskAssignment  {

	private int EngineerID;
	private int RepairTaskID;
	private String status ;
	private int TaskAssignmentID;
	private int time;
	ArrayList<AssignmentSparePart> AssignmentSparePartCatalog = new ArrayList<AssignmentSparePart>(); //The catalog that contains only the spare parts for this task assignment
	Registry registry;
	

	
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
	
	public TaskAssignment(int id, int time, ArrayList<AssignmentSparePart> AssignmentSparePartCatalog, Registry registry) {
		this.TaskAssignmentID = id; 
		this.time = time;
		this.AssignmentSparePartCatalog = AssignmentSparePartCatalog;
		this.registry = registry;
	}
	
	public TaskAssignment(int id, int time, Registry registry) {
		this.TaskAssignmentID = id; 
		this.time = time;
		this.registry = registry;
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

	public Registry getRegistry() {
		return registry;
	}

	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	public void SetTime(int time) {
		this.time = time;
	}
	

}