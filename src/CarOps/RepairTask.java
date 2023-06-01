package CarOps;

import java.util.ArrayList;

public class RepairTask {

	private int RepairTaskID;
	private Registry registry;
	private TaskAssignment aTaskAssignment;
	private ArrayList<Task> tasks = new ArrayList<Task>();
	private RepairFolder folder; 

	public Task GetRepairTask(int RepairFolderID) {
		// TODO - implement RepairTask.GetRepairTask
		throw new UnsupportedOperationException();
	}


	public RepairTask(int RepairFolderID, Task aTask) {
	
	}
	
	public void addTask(Task aTask) {
		tasks.add(aTask);
	}

}