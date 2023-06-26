package CarOps;

import java.util.ArrayList;

public class Repair {

	private int Repairid;
	private RepairFolder aRepairFolder;
	private String status;
	private Registry registry;
	private SupervisorEngineer aSupervisorEngineer;
	private ArrayList<TaskAssignment> ListOfAssignments=new ArrayList<TaskAssignment>();


	public Repair(RepairFolder aRepairFolder,String Status) {
		this.aRepairFolder=aRepairFolder;
		this.Repairid = registry.Repairs.size() + 1;
		this.status = Status;	
		Registry.Repairs.add(this);
	}
	
	public void printDetails() {
		System.out.println("Repair("+Repairid+") details:");
		System.out.println("Status: "+ status);
	}


	public void ClaimRepair(SupervisorEngineer aSuperEng) {
		status = "claimed";
		this.aSupervisorEngineer=aSuperEng;
	}

	public int getRepairid() {
		return Repairid;
	}

	public void setRepairid(int repairid) {
		Repairid = repairid;
	}

	public RepairFolder getaRepairFolder() {
		return aRepairFolder;
	}

	public void setaRepairFolder(RepairFolder aRepairFolder) {
		this.aRepairFolder = aRepairFolder;
	}

	public SupervisorEngineer getaSupervisorEngineer() {
		return aSupervisorEngineer;
	}

	public void setaSupervisorEngineer(SupervisorEngineer aSupervisorEnginner) {
		this.aSupervisorEngineer = aSupervisorEnginner;
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
		return Repairid;
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