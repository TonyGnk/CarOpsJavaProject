package CarOps;

import java.util.ArrayList;

public class RepairFolder {

	
	private int RepairFolderID;
	private String status;
	private String EstTime;
	private int TotalCost;
	private Registry registry;
	ArrayList<Repair> repairs = new ArrayList<Repair>();

	public void PrintDetails() {
		System.out.println("Repair Folder Details:");
		System.out.println("ID: "+ RepairFolderID);
		System.out.println("Status: "+ status);
		System.out.println("Estimated Time: "+ EstTime);
		System.out.println("TotalCost: "+ TotalCost);
	}
	

	public RepairFolder(Registry registry, String status, String estTime, int totalCost) {
		this.registry = registry;
		RepairFolderID = registry.RepairFolders.size() + 1;
		this.status = status;
		EstTime = estTime;
		TotalCost = totalCost;
	}
	
	public void AddRepair(Repair aRepair) {
		repairs.add(aRepair);
	}
}