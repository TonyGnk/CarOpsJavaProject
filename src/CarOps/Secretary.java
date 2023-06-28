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
	
	public Session CreateSession(String name,String plate,String Date, Client cl) {
		Session newSession=new Session(name,Date,plate,cl);
		return newSession;
		
	}

	
   public void RemoveSession(Session aSession) {
		
		Registry.Sessions.remove(aSession.getSessionID()-1);
	}
	//Έγκριση του φακέλου επισκευής απο την γραμματεία και μετατροπή σε επικευή
	
	public Repair ApproveRepairFolder(RepairFolder aRepairFolder) {
		return aRepairFolder.ApprovedRepairFolder();
	}
	
	
	public Car CreateNewCar(String plate, String brand, String model, int productionYear) {
		Car newCar =new Car(plate,brand,model,productionYear) ;
		return newCar;
		
	}
	
	public Bicycle CreateNewBicycle(String plate, String brand, String model, int productionYear,int cubism) {
		Bicycle newBicycle =new Bicycle(plate,brand,model,productionYear,cubism) ;
		return newBicycle;
		
	}
	
	public Truck CreateNewTruck(String plate, String brand, String model, int productionYear,int useFullLoad) {
		Truck newTruck =new Truck(plate,brand,model,productionYear,useFullLoad) ;
		return newTruck;

		
	}
	
	public Client CreateNewClient(String firstName, String lastName, String phone, String address, String email) {
		Client newClient=new Client(firstName,lastName,phone,address,email);
		return newClient;
	}
}