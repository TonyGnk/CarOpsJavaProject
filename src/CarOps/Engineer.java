package CarOps;

public class Engineer extends SystemUser {

	private int EngineerID;
	private boolean Available;
	public static int totalEngineers=0;
	

	public Engineer GetAvailableEngineer() {
		// TODO - implement �ngineer.GetAvailableEngineer
		throw new UnsupportedOperationException();
	}
	public Engineer (String username, String password, String firstName, String lastName){
		super(username, password,firstName,lastName);
		totalEngineers+=1;
		this.EngineerID=totalEngineers;
		this.Available=true;
	}
	public int getEngineerID() {
		return EngineerID;
	}
	public void setEngineerID(int engineerID) {
		EngineerID = engineerID;
		
	}
	public boolean isAvailable() {
		return Available;
	}
	public void setAvailable(boolean available) {
		Available = available;
	}
}