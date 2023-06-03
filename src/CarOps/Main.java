package CarOps;


public class Main {

	public static void main(String[] args){
		Registry registry;
		
		
		RepairTask repairTask = 
		Task task1 = new Task("Αλλαγή λαδιών", 20);
		repairTask.addTask(task1);
		Task task2 = new Task("Αλλαγή φίλτρου καμπίνας", 5);
		repairTask.addTask(task2);
		Task task3 = new Task("Συντήρηση φρένων", 30);
		repairTask.addTask(task3);


	}

}
