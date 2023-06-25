package CarOps;

import java.util.ArrayList;

public class RepairTask {
	
    private RepairFolder aRepairFolder;
	private int RepairTaskID;
	private TaskAssignment aTaskAssignment;
	private Task atask ;
	private Registry registry;
	private String status;



	public RepairTask(int RepairFolderID, Task aTask) {
	
	}


	public int getRepairTaskID() {
		return RepairTaskID;
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


	public Task getAtask() {
		return atask;
	}


	public void setAtask(Task atask) {
		this.atask = atask;
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



	
	/*public void addTask(Task aTask) {
		tasks.add(aTask);
	}*/
	
	

}
