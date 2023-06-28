package CarOps;

import java.util.ArrayList;

public class MainWithoutScreens {

	public static void main(String[] args) {
		//Δημιουργία Γραμματείας και Μηχανικών
		Secretary secretary=new Secretary("user1","pass1","Maria","Βλαχοδήμου");
		SimpleEngineer Engineer1=new SimpleEngineer("user2","pass2","Κώστας","Ευγενίδης");
		SimpleEngineer Engineer2=new SimpleEngineer("user3","pass3","Κώστας","Γαζής");
		SimpleEngineer Engineer3=new SimpleEngineer("user4","pass4","Γιώργος","Δημητριάδης");
		HostEngineer HostEngineer1=new HostEngineer("user5","pass5","Αναστάσιος","Γεωργίου");
		SupervisorEngineer SupervisorEngineer1=new SupervisorEngineer("user6","pass6","Δημήτρης","Παπαντωνίου");
		
		//Δημιουργία Καρτέλα Οχήματος και Πελάτη απο την Γραμματεία
		Client client=secretary.CreateNewClient("Μάρκος", "Θεοδοσιάδης", "6900000000", null, null);
		Car newCar=secretary.CreateNewCar("ΚΖΝ-1234","BMW","i4 M50", 2021);

		//Δημιουργία Ραντεβού
		Session Session1=secretary.CreateSession(client.getFirstName()+" "+client.getLastName(), newCar.getPlate(), "28-6-2023",client);
		Session Session2=secretary.CreateSession(client.getFirstName()+" "+client.getLastName(), newCar.getPlate(), "30-6-2023",client);
		
		//Δημιουργία Ανταλλακτικών και Εργασιών Επισκευής
		Task Task1=new Task("Αλλαγή λαδιών",20);
		Task Task2=new Task("Αλλαγή φίλτρου καμπίνας",5);
		Task Task3=new Task("Συντήρηση φρένων",30);
		
		SparePart SparePart1=new SparePart("Συσκευασία λαδιών 4lt",30);
		SparePart SparePart2=new SparePart("Φίλτρο λαδιού",20);
		SparePart SparePart3=new SparePart("Φίλτρο καμπίνας ",30);
		SparePart SparePart4=new SparePart("Τακάκιρ φρένων εμπρός τροχού ",5);
		SparePart SparePart5=new SparePart("Τακάκι φρένων πίσω τροχού",5);
		SparePart SparePart6=new SparePart("Υγρό φρένων",10);
		
		//Δημιουργία Λίστας εργασιών για τους φακέλους επισκευής(1ο και 2ο Task για τον πρώτο φάκελο και 3o Task για τον δεύτερο Φάκελο Επισκευής)
		ArrayList<Task> RepairFolder1Tasks=new ArrayList<Task>();
		RepairFolder1Tasks.add(Task1);
		RepairFolder1Tasks.add(Task2);
		
		ArrayList<Task> RepairFolder2Tasks=new ArrayList<Task>();
		RepairFolder2Tasks.add(Task3);
		
		
		
		//Δημιουργία Φακέλου Επισκευής για το Παραπάνω Ραντεβού απο τον Μηχανικό Υποδοχής(Ο χρόνος μετράται σε ώρες πχ 24 και 48 ώρες)
		RepairFolder RepairFolder1=HostEngineer1.CreateNewRepairFolder(Session1,24, 0, RepairFolder1Tasks);
		RepairFolder RepairFolder2=HostEngineer1.CreateNewRepairFolder(Session2,48, 0, RepairFolder2Tasks);
		
	   //Έγκριση Φακέλου απο την Γραμματεία και μετατροπή των φακέλων επισκευής σε ενεργές επισκευές(έτοιμη για διαχείριση απο τον Επιβλέπων Μηχανικό)
		
		Repair Repair1=secretary.ApproveRepairFolder(RepairFolder1);
		Repair Repair2=secretary.ApproveRepairFolder(RepairFolder2);
		//for(RepairTask task : Repair1.getListOfRepairTasks()) {
			//System.out.println("Ergasia :"+task.getaTask().getName());
		// }
	
		
		
	   //Διαχείριση των ενεργών Επισκευών απο τον Επιβλέπων Μηχανικό SupervisorEngineer1
		SupervisorEngineer1.ClaimRepair(Repair1);
		SupervisorEngineer1.ClaimRepair(Repair2);
		
		//Ανάθεση Εργασιών της 1ης Επισκευής στους 2 Μηχανικούς από τον Επιβλέπων Μηχανικό
		TaskAssignment Assignment1=SupervisorEngineer1.AssignRepairTask(Engineer1,Repair1.getListOfRepairTasks().get(0), Repair1);
		TaskAssignment Assignment2=SupervisorEngineer1.AssignRepairTask(Engineer2,Repair1.getListOfRepairTasks().get(1), Repair1);
		
		//Δημιουργία Λίστας Ανταλλακτικών που χρησιμοποίησαν οι Μηχανικοί σε κάθε Ανάθεση της 1ης Επισκευής
		//Επειδή το πλήθος των ανταλλακτικών όλης της επισκευής πρέπει να είναι 1 απο τα 3 πρώτα Ανταλλακτικά έγινε έτσι ο διαχωρισμός σε κάθε ανάθεση ώστε 
		//και οι 2 αναθέσεις στο σύνολο τους να χρησιμοποιούν ένα τεμάχιο για κάθε ένα από τα 3 πρώτα Ανταλλακτικά(1+0=1 , 0+1=1 ,1+0=1 γιά όλη την επισκευή )
		ArrayList<AssignmentSparePart> Assignment1Parts=new ArrayList<AssignmentSparePart>();
		Assignment1Parts.add(new AssignmentSparePart(Assignment1,SparePart1,1));
		Assignment1Parts.add(new AssignmentSparePart(Assignment1,SparePart2,0));
		Assignment1Parts.add(new AssignmentSparePart(Assignment1,SparePart3,1));
		
		ArrayList<AssignmentSparePart> Assignment2Parts=new ArrayList<AssignmentSparePart>();
		Assignment2Parts.add(new AssignmentSparePart(Assignment1,SparePart1,0));
		Assignment2Parts.add(new AssignmentSparePart(Assignment1,SparePart2,1));
		Assignment2Parts.add(new AssignmentSparePart(Assignment1,SparePart3,0));
		

		
		//Ολοκλήρωση Αναθέσεων της 1ης Επισευής απο τους Μηχανικούς και καταγραφή των Ανταλλκατικών που χρησιμοποιήσαν 
		Engineer1.FinishAssignment(Assignment1,Assignment1Parts);
		Engineer2.FinishAssignment(Assignment2,Assignment2Parts);
		
		//Ανάθεση Εργασιών της 2ης Επισκευής στον 3ο Μηχανικό
		TaskAssignment Assignment3=SupervisorEngineer1.AssignRepairTask(Engineer3,Repair2.getListOfRepairTasks().get(0), Repair2);
		
		
		//Δημιουργία Λίστας Ανταλλακτικών που χρησιμοποίησαν οι Μηχανικοί σε κάθε Ανάθεση της 2ης Επισκευής
		ArrayList<AssignmentSparePart> Assignment3Parts=new ArrayList<AssignmentSparePart>();
		Assignment3Parts.add(new AssignmentSparePart(Assignment3,SparePart4,4));
		Assignment3Parts.add(new AssignmentSparePart(Assignment3,SparePart5,4));
		Assignment3Parts.add(new AssignmentSparePart(Assignment3,SparePart6,1));
		
		//Ολοκλήρωση Ανάθεσης της 2ης Επισευής απο τον Μηχανικό και καταγραφή των Ανταλλκατικών που χρησιμοποιήσαν 
		Engineer2.FinishAssignment(Assignment3,Assignment3Parts);
		
		//Προβολή Ζητούμενων πληροφοριών στην κονσόλα 
		System.out.println("--- Εργασίες Επισκευής --- ");
		System.out.println(Task1.getName() + ": " + Task1.getCost() + "€");
		System.out.println(Task2.getName() + ": " + Task2.getCost() + "€");
		System.out.println(Task3.getName() + ": " + Task3.getCost() + "€" +"\n");
		System.out.println("--- Ανταλλακτικά --- ");
		
		System.out.println(SparePart1.getName() + " : "+ SparePart1.getCostPerPiece() + "€");
		System.out.println(SparePart2.getName() + " : "+ SparePart2.getCostPerPiece() + "€");
		System.out.println(SparePart3.getName() + " : "+ SparePart3.getCostPerPiece() + "€");
		System.out.println(SparePart4.getName() + " : "+ SparePart4.getCostPerPiece() + "€");
		System.out.println(SparePart5.getName() + " : "+ SparePart5.getCostPerPiece() + "€");
		System.out.println(SparePart6.getName() + " : "+ SparePart6.getCostPerPiece() + "€" + "\n");
		
		System.out.println("--- Στοιχεία Επισκευών ---");
		System.out.println("Εκτιμώμενος Χρόνος Επισκευής 1ης Επισκευής: " + Repair1.getaRepairFolder().getEstTime() + " ώρες ,Συνολικό Κόστος: " + Repair1.getTotalCost() + "€");
		System.out.println("Εκτιμώμενος Χρόνος Επισκευής 2ης Επισκευής: " + Repair2.getaRepairFolder().getEstTime() + " ώρες ,Συνολικό Κόστος: " + Repair2.getTotalCost() + "€");
	

	}

}
