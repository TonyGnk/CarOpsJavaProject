package CarOps;

import java.util.ArrayList;

public class RepairFolder {

	private int SessionID;
	private int RepairFolderid;
	private String status;
	private int estTime;
	private int totalCost;
	private Registry registry;
	private ArrayList<Task> TaskCatalog = new ArrayList<Task>();
	private ArrayList<RepairTask> RepairTaskCatalog = new ArrayList<RepairTask>();
	
//Second Constructor for use in the HostEngineer Class
	public RepairFolder(int aAppointmentID){this.status="Undecided"; this.aAppointmentID=aAppointmentID;}
	
	public void PrintDetails() {
		System.out.println("Repair Folder Details:");
		System.out.println("ID: "+ RepairFolderid);
		System.out.println("Status: "+ status);
		System.out.println("Estimated Time: "+ estTime);
		System.out.println("TotalCost: "+ totalCost);
		System.out.println("It contains these tasks:");
		
		for(int i=0; i<TaskCatalog.size(); i++) {
			System.out.println("Task: "+ i+1);
			TaskCatalog.get(i).PrintDetails();
		}
	}

	public RepairFolder(Registry registry, String status, int estTime, int totalCost,int aSessionID) {
		this.registry = registry;
		RepairFolderid = registry.RepairFolders.size() + 1;
		this.status = status;
		this.estTime = estTime;
		this.totalCost = totalCost;
		this.AppointmentID=aSessionID;
	}
	
	public void addRepairTask(RepairTask aRepairTask) {
		RepairTaskCatalog.add(aRepairTask);
	}

	public int getSessionID() {
		return SessionID;
	}

	public void setSessionID(int sessionID) {
		SessionID = sessionID;
	}

	public int getRepairFolderid() {
		return RepairFolderid;
	}

	public void setRepairFolderid(int repairFolderid) {
		RepairFolderid = repairFolderid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getEstTime() {
		return estTime;
	}

	public void setEstTime(int estTime) {
		this.estTime = estTime;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public Registry getRegistry() {
		return registry;
	}

	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	public ArrayList<Task> getTaskCatalog() {
		return TaskCatalog;
	}

	public void setTaskCatalog(ArrayList<Task> taskCatalog) {
		TaskCatalog = taskCatalog;
	}

	public ArrayList<RepairTask> getRepairTaskCatalog() {
		return RepairTaskCatalog;
	}

	public void setRepairTaskCatalog(ArrayList<RepairTask> repairTaskCatalog) {
		RepairTaskCatalog = repairTaskCatalog;
	}
	
}