package CarOps;

public class TaskAssignment  {

	RepairTask aRepairTask;
	private int ID;
	private int time;
	Registry registry;
	
	public TaskAssignment(RepairTask aRepairTask,int time, Registry registry) {
		this.aRepairTask = aRepairTask;
		ID = registry.TaskAssignments.size()+1;
		this.time = time;
		this.registry = registry;
	}
	
	public void PrintDetails() {
		System.out.println("Task Assignment("+ID +")Details");
		System.out.println();
	}

	

	public void SetTime(int time) {
		this.time = time;
	}

}