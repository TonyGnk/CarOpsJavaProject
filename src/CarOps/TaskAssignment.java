package CarOps;

import java.util.ArrayList;

public class TaskAssignment  {

	RepairTask aRepairTask;
	private int ID;
	private int time;
	ArrayList<AssignmentSparePart> AssignmentSparePartCatalog;
	Registry registry;
	
	public TaskAssignment(RepairTask aRepairTask, int ID, int time, ArrayList<AssignmentSparePart> AssignmentSparePartCatalog, Registry registry) {
		this.aRepairTask = aRepairTask;
		this.ID = ID; 
		this.time = time;
		this.AssignmentSparePartCatalog = AssignmentSparePartCatalog;
		this.registry = registry;
	}
	
	public void PrintDetails() {
		System.out.println("Task Assignment("+ID +")Details:");
		System.out.println();
	}

	public RepairTask getaRepairTask() {
		return aRepairTask;
	}

	public void setaRepairTask(RepairTask aRepairTask) {
		this.aRepairTask = aRepairTask;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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
	
	public TaskAssignment GetTaskAssignment(int EmployeeID) {
		ArrayList<TaskAssignment> TempTaskAssignments = registry.getTaskAssignments();
		
		for(TaskAssignment aTaskAssignment:TempTaskAssignments) {
			if(aTaskAssignment.getID() == EmployeeID) {
				return aTaskAssignment;
			}
		}
		return null;
	}

}