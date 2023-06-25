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
	
	
	public void CreateNewCar(String plate, String brand, String model, int productionYear) {
		Car newCar =new Car(plate,brand,model,productionYear) ;
		aRegistry.Vehicles.add(newCar);	
		
	}
	
	public void CreateNewBicycle(String plate, String brand, String model, int productionYear,int cubism) {
		Bicycle newBicycle =new Bicycle(plate,brand,model,productionYear,cubism) ;
		aRegistry.Vehicles.add(newBicycle);	
		
	}
	
	public void CreateNewTruck(String plate, String brand, String model, int productionYear,int useFullLoad) {
		Truck newTruck =new Truck(plate,brand,model,productionYear,useFullLoad) ;
		aRegistry.Vehicles.add(newTruck);	
		
	}
	
	public void CreateNewClient(String firstName, String lastName, int phone, String address, String email) {
		Client newClient=new Client(firstName,lastName,phone,address,email);
		
	}
}