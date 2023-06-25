package CarOps;

import java.util.ArrayList;

public class RepairFolder {
	 
	private Registry aRegistry;
	private Session aSession;
	private Repair aRepair;
	private int RepairFolderid;
	private String status;
	private int estTime;
	private int totalCost;
	private ArrayList<Task> ListOfTasks=new ArrayList<Task>();
	//private ArrayList<Task> TaskCatalog = new ArrayList<Task>();
	private ArrayList<RepairTask> RepairTaskCatalog = new ArrayList<RepairTask>();
	
    //Second Constructor for use in the HostEngineer Class
	//Με τη χρήση αυτού του Constructor δημιουργείται ένας φάκελος που εκκρεμεί(stats="Pending") και για να αλλάξει πρέπει να εγκριθεί από την Γραμματεία
	public RepairFolder(Session aSession,int estTime,int totalCost,ArrayList<Task> aListOfTasks){
		this.status = "Pending"; 
		this.aSession=aSession;
		this.estTime=estTime;
		this.totalCost=totalCost;
		this.ListOfTasks=aListOfTasks;
		//this.aAppointmentID=  aAppointmentID; //What is this?
	}
	
	public void PrintDetails() {
		System.out.println("Repair Folder Details:");
		System.out.println("ID: "+ RepairFolderid);
		System.out.println("Status: "+ status);
		System.out.println("Estimated Time: "+ estTime);
		System.out.println("TotalCost: "+ totalCost);
		System.out.println("It contains these tasks:");
		
		//for(int i=0; i<TaskCatalog.size(); i++) {
			//System.out.println("Task: "+ i+1);
			//TaskCatalog.get(i).PrintDetails();
		}
	//}

	public RepairFolder(String status, int estTime, int totalCost,int aSessionID) {
		RepairFolderid = aRegistry.RepairFolders.size() +1 ;
		this.status = status;
		this.estTime = estTime;
		this.totalCost = totalCost;
		//this.SessionID=aSessionID;
	}
	
	//Έγκριση του φακέλου επισκευής απο την γραμματεία και δημιουργία επικευής που αντιστοιχεί στον φάκελο
	public void setStatus(String status) {
		this.status = status;
		if(status.toLowerCase()=="Approved".toLowerCase()){
			Repair newRepair=new Repair(this,"available");
			
		}
	}
	
	public void addRepairTask(RepairTask aRepairTask) {
		RepairTaskCatalog.add(aRepairTask);
	}

	//public int getSessionID() {
		//return SessionID;
	//}

	public void setSessionID(int sessionID) {
		//SessionID = sessionID;
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



	//public ArrayList<Task> getTaskCatalog() {
		//return TaskCatalog;
	//}

	public void setTaskCatalog(ArrayList<Task> taskCatalog) {
		//TaskCatalog = taskCatalog;
	}

	public ArrayList<RepairTask> getRepairTaskCatalog() {
		return RepairTaskCatalog;
	}

	public void setRepairTaskCatalog(ArrayList<RepairTask> repairTaskCatalog) {
		RepairTaskCatalog = repairTaskCatalog;
	}
	
}