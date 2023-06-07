package CarOps;

import java.util.ArrayList;

public class HostEngineer extends Engineer {
	private Registry aRegistry;	
	private RepairFolder aRepairFolder;
	private Session aSession;
	
	
	public HostEngineer (String username, String password, String firstName, String lastName)
	{ 
		super(username, password, firstName, lastName);}

public void createNewFolder(){
	aSession.totalSessions+=1;
	aRepairFolder=new RepairFolder(aSession.totalSessions);
	
 }
}