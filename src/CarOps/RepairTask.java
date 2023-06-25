package CarOps;

import java.util.ArrayList;

public class RepairTask {

	
    private RepairFolder aRepairFolder;
	private int RepairTaskID;
	private TaskAssignment aTaskAssignment;
	private Task aTask;
	private Registry registry;
	private String status;


	public RepairTask(int repairTaskID, TaskAssignment aTaskAssignment, Task atask, Registry registry) {
		
		this.RepairTaskID = repairTaskID;
		this.aTaskAssignment = aTaskAssignment;
		this.aTask = atask;
		this.registry = registry;
	}


	/*public void printDetails() {
		
		System.out.println("ID: " +repairTaskID);
		System.out.println("Has the following tasks:");
		
		int i=1;
		for(Task aTask:Tasks) {
			System.out.println("Task "+i+":");
			aTask.PrintDetails();
			i++;
		}
	}*/

	


	public int getRepairTaskID() {
		return this.RepairTaskID;
	}


	public void setRepairTaskID(int repairTaskID) {
		RepairTaskID = repairTaskID;
	}


	public TaskAssignment getaTaskAssignment() {
		return aTaskAssignment;
	}


	public void setaTaskAssignment(TaskAssignment aTaskAssignment) {
		this.aTaskAssignment = aTaskAssignment;
	}


	public Registry getRegistry() {
		return registry;
	}


	public void setRegistry(Registry registry) {
		this.registry = registry;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public RepairFolder getaRepairFolder() {
		return aRepairFolder;
	}


	public void setaRepairFolder(RepairFolder aRepairFolder) {
		this.aRepairFolder = aRepairFolder;
	}


	public Task getaTask() {
		return aTask;
	}


	public void setaTask(Task aTask) {
		this.aTask = aTask;
	}


	



	
	/*public void addTask(Task aTask) {
		tasks.add(aTask);
	}*/
	
	

}