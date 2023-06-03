package CarOps;

import java.util.ArrayList;

public class RepairFolder {

	
	private int id;
	private String status;
	private int estTime;
	private int totalCost;
	private Registry registry;
	private ArrayList<Task> TaskCatalog = new ArrayList<Task>();
	private ArrayList<RepairTask> RepairTaskCatalog = new ArrayList<RepairTask>();
	

	public void PrintDetails() {
		System.out.println("Repair Folder Details:");
		System.out.println("ID: "+ id);
		System.out.println("Status: "+ status);
		System.out.println("Estimated Time: "+ estTime);
		System.out.println("TotalCost: "+ totalCost);
		System.out.println("It contains these tasks:");
		
		for(int i=0; i<TaskCatalog.size(); i++) {
			System.out.println("Task: "+ i+1);
			TaskCatalog.get(i).PrintDetails();
		}
	}

	public RepairFolder(Registry registry, String status, int estTime, int totalCost) {
		this.registry = registry;
		id = registry.RepairFolders.size() + 1;
		this.status = status;
		this.estTime = estTime;
		this.totalCost = totalCost;
	}
	
	public void addRepairTask(RepairTask aRepairTask) {
		RepairTaskCatalog.add(aRepairTask);
	}
	
}