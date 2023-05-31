package CarOps;

import java.util.ArrayList;

public class Registry {
	ArrayList<AssignmentSparePart> AssignmentSpareParts = new ArrayList<AssignmentSparePart>();
	ArrayList<Client> Clients = new ArrayList<Client>();
	ArrayList<Engineer> Engineers = new ArrayList<Engineer>();
	ArrayList<Repair> Repairs = new ArrayList<Repair>();
	ArrayList<RepairFolder> RepairFolders = new ArrayList<RepairFolder>();
	ArrayList<RepairTask> RepairTasks = new ArrayList<RepairTask>();
	ArrayList<Report> Reports = new ArrayList<Report>();
	ArrayList<Session> Sessions = new ArrayList<Session>();
	ArrayList<SparePart> SpareParts = new ArrayList<SparePart>();
	ArrayList<TaskAssignment> TaskAssignments = new ArrayList<TaskAssignment>();
	ArrayList<Task> Tasks = new ArrayList<Task>();
	ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
	
	public void AddNewItem(AssignmentSparePart anAssignmentSparePart) {
		AssignmentSpareParts.add(anAssignmentSparePart);
	}
	
	public void AddNewItem(Client aClient) {
		Clients.add(aClient);
	}
	
	public void AddNewItem(Engineer anEngineer) {
		Engineers.add(anEngineer);
	}
	
	public void AddNewItem(Repair aRepair) {
		Repairs.add(aRepair);
	}
	
	public void AddNewItem(RepairFolder aRepairFolder) {
		RepairFolders.add(aRepairFolder);
	}
	
	public void AddNewItem(RepairTask aRepairTask) {
		RepairTasks.add(aRepairTask);
	}
	
	public void AddNewItem(Report aReport) {
		Reports.add(aReport);
	}
	
	public void AddNewItem(Session aSession) {
		Sessions.add(aSession);
	}
	
	public void AddNewItem(SparePart aSparePart) {
		SpareParts.add(aSparePart);
	}
	
	public void AddNewItem(TaskAssignment aTaskAssigment) {
		TaskAssignments.add(aTaskAssigment);
	}
	
	public void AddNewItem(Task aTask) {
		Tasks.add(aTask);
	}
	
	public void AddNewItem(Vehicle aVehicle) {
		Vehicles.add(aVehicle);
	}
	
	public ArrayList<Repair> GetRepairs(){
		return Repairs;
	}
	
	public ArrayList<Repair> GetWaitRepairs() {
		ArrayList<Repair> TempRepairs = new ArrayList<Repair>();
		
		for(Repair aRepair : Repairs) {
			if(aRepair.getStatus().equals("wait")) 
				TempRepairs.add(aRepair);
		}
		return TempRepairs;
	}
	
	
	

}
