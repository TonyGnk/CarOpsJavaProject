package CarOps;

import java.util.ArrayList;

public class Repair {

	private int id;
	private String status;
	private Registry registry;


	public Repair(int RepairID, String Status, Registry registry) {
		this.id = registry.Repairs.size() + 1;
		this.status = Status;
		this.registry = registry;			
	}
	
	public Repair GetRepair(int SupervisorID) {
		ArrayList<Repair> TempRepairs = registry.Repairs;
		
		for(Repair aRepair:TempRepairs) {
			if(aRepair.getRepairID() == SupervisorID) {
				return aRepair;
			}
		}
		return null;		
	}
	
	public void printDetails() {
		System.out.println("Repair("+id+") details:");
		System.out.println("Status: "+ status);
	}


	public void ClaimRepair() {
		status = "claimed";
	}

	public void DropRepair() {
		status = "dropped";
	}

	public void CompleteRepair(int SupervisorID) {
		status = "completed";
	}

	public String getStatus() {
		return status;
	}
	
	public int getRepairID() {
		return id;
	}

	public void setRepairID(int repairID) {
		repairID = repairID;
	}

	public Registry getRegistry() {
		return registry;
	}

	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}