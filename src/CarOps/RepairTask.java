package CarOps;

import java.util.ArrayList;

public class RepairTask {

	private int repairTaskID;
	private TaskAssignment aTaskAssignment;
	private ArrayList<Task> Tasks =  new ArrayList<Task>();
	private Registry registry;


	public RepairTask(int repairTaskID, TaskAssignment aTaskAssignment, ArrayList<Task> tasks, Registry registry) {
		
		this.repairTaskID = repairTaskID;
		this.aTaskAssignment = aTaskAssignment;
		Tasks = tasks;
		this.registry = registry;
	}


	public void printDetails() {
		
		System.out.println("ID: " +repairTaskID);
		System.out.println("Has the following tasks:");
		
		int i=1;
		for(Task aTask:Tasks) {
			System.out.println("Task "+i+":");
			aTask.PrintDetails();
			i++;
		}
	}


	
	
	/*public void addTask(Task aTask) {
		tasks.add(aTask);
	}*/

}