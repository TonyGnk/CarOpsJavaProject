package CarOps;

import java.util.ArrayList;

import screens.Session;

public class Registry {
	
	//ArrayList<AssignmentSparePart> AssignmentSpareParts = new ArrayList<AssignmentSparePart>();
	ArrayList<Client> Clients = new ArrayList<Client>();
	ArrayList<Engineer> Engineers = new ArrayList<Engineer>();
	ArrayList<Repair> Repairs = new ArrayList<Repair>();
	ArrayList<RepairFolder> RepairFolders = new ArrayList<RepairFolder>();
	//ArrayList<RepairTask> RepairTasks = new ArrayList<RepairTask>();
	ArrayList<Report> Reports = new ArrayList<Report>();
	ArrayList<Session> Sessions = new ArrayList<Session>();
	ArrayList<SparePart> SpareParts = new ArrayList<SparePart>();
	ArrayList<TaskAssignment> TaskAssignments = new ArrayList<TaskAssignment>();
	ArrayList<Task> Tasks = new ArrayList<Task>();
	ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
	
	public ArrayList<Repair> GetWaitRepairs() {
		
		ArrayList<Repair> TempRepairs = new ArrayList<Repair>();
		
		for(Repair aRepair : Repairs) {
			
			if(aRepair.getStatus().equals("wait")) 
				TempRepairs.add(aRepair);
		}
		return TempRepairs;
	}
	
	public Repair GetRepair(int SupervisorID) {
		
		for(Repair aRepair:Repairs) {
			
			if(aRepair.getRepairID() == SupervisorID) {
				return aRepair;
			}
		}
		return null;		
	}
	
	public TaskAssignment GetTaskAssignment(int EmployeeID) {
		
		for(TaskAssignment aTaskAssignment: TaskAssignments) {
			
			if(aTaskAssignment.getID() == EmployeeID) {
				return aTaskAssignment;
			}
		}
		return null;
	}
	public void UpdateTask(Task aTask, String Name, int cost, int EstimatedTime ) {
		
		int position = SearchTask(aTask);
		
		if (position != -1) {
			Tasks.get(position).setName(Name);
			Tasks.get(position).setCost(cost);
			Tasks.get(position).setEstimatedTime(EstimatedTime);
		}
		
	}
	public int SearchTask(Task aTask) {
		
		for(int i = 0; i<Tasks.size(); i++) {
			
			if (Tasks.get(i).equals(aTask)){
				return i;
			}
		}
		return -1;
	}
	
	public Vehicle searchVehicle(String plate) {
		
		for(Vehicle aVehicle: Vehicles) {
			if(aVehicle.getPlate().equals(plate)) {
				return aVehicle;
			}
		}
		return null;
	}
	
	
	/*
	 * public ArrayList<AssignmentSparePart> getAssignmentSpareParts() { return
	 * AssignmentSpareParts; }
	 * 
	 * public void setAssignmentSpareParts(ArrayList<AssignmentSparePart>
	 * assignmentSpareParts) { AssignmentSpareParts = assignmentSpareParts; }
	 * 
	 * public void AddNewItem(AssignmentSparePart anAssignmentSparePart) {
	 * AssignmentSpareParts.add(anAssignmentSparePart);}
	 */
	
	public ArrayList<Client> getClients() { return Clients; }
	public void setClients(ArrayList<Client> clients) { Clients = clients; }
	public void AddNewItem(Client aClient) { Clients.add(aClient); }

	
	public ArrayList<Engineer> getEngineers() { return Engineers; }
	public void setEngineers(ArrayList<Engineer> engineers) { Engineers = engineers; }
	public void AddNewItem(Engineer anEngineer) { Engineers.add(anEngineer); }

	
	public ArrayList<Repair> getRepairs() { return Repairs; }
	public void setRepairs(ArrayList<Repair> repairs) { Repairs = repairs; }
	public void AddNewItem(Repair aRepair) { Repairs.add(aRepair); }
	
	public ArrayList<RepairFolder> getRepairFolders() { return RepairFolders;}
	public void setRepairFolders(ArrayList<RepairFolder> repairFolders) {RepairFolders = repairFolders;}
	public void AddNewItem(RepairFolder aRepairFolder) { RepairFolders.add(aRepairFolder); }

	
	/*
	 * public ArrayList<RepairTask> getRepairTasks() { return RepairTasks; } public
	 * void setRepairTasks(ArrayList<RepairTask> repairTasks) { RepairTasks =
	 * repairTasks; } public void AddNewItem(RepairTask aRepairTask) {
	 * RepairTasks.add(aRepairTask); }
	 */

	
	public ArrayList<Report> getReports() { return Reports; }
	public void setReports(ArrayList<Report> reports) { Reports = reports; }
	public void AddNewItem(Report aReport) { Reports.add(aReport); }

	
    //public ArrayList<Session> getSessions() { return Sessions; }
    //public void setSessions(ArrayList<Session> sessions) { Sessions = sessions; }
    public void addNewItem(String name, String date, String plate) { Sessions.add(new Session(name, date, plate, Sessions.size())); }

	
	public ArrayList<SparePart> getSpareParts() { return SpareParts; }
	public void setSpareParts(ArrayList<SparePart> spareParts) { SpareParts = spareParts; }
	public void AddNewItem(SparePart aSparePart) { SpareParts.add(aSparePart); }
	
	public ArrayList<TaskAssignment> getTaskAssignments() { return TaskAssignments; }
	public void setTaskAssignments(ArrayList<TaskAssignment> taskAssignments) { TaskAssignments = taskAssignments;}
	public void AddNewItem(TaskAssignment aTaskAssigment) { TaskAssignments.add(aTaskAssigment); }
	
	public ArrayList<Task> getTasks() { return Tasks; }
	public void setTasks(ArrayList<Task> tasks) { Tasks = tasks; }
	public void AddNewItem(Task aTask) { Tasks.add(aTask); }

	public ArrayList<Vehicle> getVehicles() { return Vehicles; }
	public void setVehicles(ArrayList<Vehicle> vehicles) { Vehicles = vehicles; }
	public void AddNewItem(Vehicle aVehicle) { Vehicles.add(aVehicle); }
}
