package CarOps;

import java.util.ArrayList;

public class Repair {

	private int RepairID;
	private String Status;
	private Registry registry;


	public Repair(int RepairID, String Status, Registry registry) {
		this.RepairID = registry.Repairs.size() + 1;
		this.Status = Status;
		this.registry = registry;			
	}
	
	public Repair GetRepair(int SupervisorID) {
		ArrayList<Repair> TempRepairs = new ArrayList<Repair>();
		
		for(Repair aRepair:TempRepairs) {
			if(aRepair.getRepairID() == SupervisorID) {
				return aRepair;
			}
		}
		return null;		
	}

	public void ClaimRepair() {
		Status = "claimed";
	}

	public void DropRepair() {
		Status = "dropped";
	}

	public void Complete_Repair(int SupervisorID) {
		Status = "completed";
	}

	public String getStatus() {
		return Status;
	}
	
	public int getRepairID() {
		return RepairID;
	}

	public void setRepairID(int repairID) {
		RepairID = repairID;
	}

	public Registry getRegistry() {
		return registry;
	}

	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	public void setStatus(String status) {
		Status = status;
	}

}