package CarOps;

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
		return null;
		
	}

	public Repair Get_Wait_Repair() {
		// TODO - implement Repair.Get_Wait_Repair
		throw new UnsupportedOperationException();
	}

	public void ClaimRepair() {
		// TODO - implement Repair.ClaimRepair
		throw new UnsupportedOperationException();
	}

	public void Drop_Repair() {
		// TODO - implement Repair.Drop_Repair
		throw new UnsupportedOperationException();
	}


	public void Complete_Repair(int SupervisorID) {
		// TODO - implement Repair.Complete_Repair
		throw new UnsupportedOperationException();
	}

	public String getStatus() {
		return Status;
	}

}