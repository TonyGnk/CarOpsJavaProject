package CarOps;

import java.util.ArrayList;

public class HostEngineer extends Engineer {
	private Registry aRegistry;	
	private RepairFolder aRepairFolder;
	private Session aSession;
	
	
	//Με τη χρήση αυτού του Constructor δημιουργείται ένας φάκελος που εκκρεμεί(stats="Pending") και για να αλλάξει πρέπει να εγκριθεί από την Γραμματεία
	public void CreateNewRepairFolder(Session aSession,int estTime,int totalCost,ArrayList<Task> aListOfTasks) {
		aRepairFolder = new RepairFolder(aSession,estTime,totalCost,aListOfTasks);
		
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
	
	public void CreateNewCar(String plate, String brand, String model, int productionYear) {
		Car newCar =new Car(plate,brand,model,productionYear) ;
	
		
	}
	
	public void CreateNewBicycle(String plate, String brand, String model, int productionYear,int cubism) {
		Bicycle newBicycle =new Bicycle(plate,brand,model,productionYear,cubism) ;
		
		
	}
	
	public void CreateNewTruck(String plate, String brand, String model, int productionYear,int useFullLoad) {
		Truck newTruck =new Truck(plate,brand,model,productionYear,useFullLoad) ;
		
		
	}
	
	public HostEngineer (String username, String password, String firstName, String lastName)
	{ 
		super(username, password, firstName, lastName);}

//public void createNewFolder(){
	//aSession.totalSessions+=1;
	//RepairFolder=new RepairFolder(aSession.totalSessions);
	
 //}
}