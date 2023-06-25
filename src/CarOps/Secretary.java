package CarOps;

public class Secretary extends SystemUser {
	
	private Registry aRegistry;

	public Secretary(String username, String password, String firstName, String lastName) {
		
		super(username, password, firstName, lastName);
	}
	
	public void printDetails() {
		
		super.printDetails();
	}
	
	public void ShowAllSessions() {
		for(int i=0;i<aRegistry.Sessions.size(); i++) {
			aRegistry.Sessions.get(i).PrintDetails();
			
		}
		
	}
	
	public void ShowAllRepairFolders(){
		for(int i=0;i<aRegistry.RepairFolders.size(); i++) {
			aRegistry.RepairFolders.get(i).PrintDetails();
			
		}
	}
	//Έγκριση του φακέλου επισκευής απο την γραμματεία και μετατροπή σε επικευή
	
	public void ApproveRepairFolder(RepairFolder aRepairFolder) {
		aRepairFolder.setStatus("Approved");
		
	}
}