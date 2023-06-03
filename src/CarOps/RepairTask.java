package CarOps;

import java.util.ArrayList;

public class RepairTask {

	private int id;
	private TaskAssignment aTaskAssignment;
	private ArrayList<Task> tasks = new ArrayList<Task>();
	private Registry registry;

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