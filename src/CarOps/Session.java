//Tony - Not Done
package CarOps;

import java.util.ArrayList;

public class Session {
    private String name;
    private String date;
    private String plate;
    public String getName() {
		return name;
	}
    
	public void PrintDetails() {
		System.out.println("Session Details:");
		System.out.println("Client Name: "+ name);
		System.out.println("Date: "+ date);
		System.out.println("Plate: "+ plate);

		
		//for(int i=0; i<TaskCatalog.size(); i++) {
			//System.out.println("Task: "+ i+1);
			//TaskCatalog.get(i).PrintDetails();
		}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public int getSessionID() {
		return sessionID;
	}

	public void setSessionID(int sessionID) {
		this.sessionID = sessionID;
	}

	public int getFolderID() {
		return folderID;
	}

	public void setFolderID(int folderID) {
		this.folderID = folderID;
	}

	private int sessionID;
    private int folderID;

    public Session(String name, String date, String plate, int size) {
        this.name = name;
        this.date = date;
        this.plate = plate;
        this.sessionID = size;
    }

}



