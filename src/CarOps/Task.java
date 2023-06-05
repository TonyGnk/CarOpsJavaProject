package CarOps;

public class Task {

	private String Name;
	private float Cost;
	private int EstimatedTime;


	
	
	public Task(String name, float cost, int estimatedTime) {
		Name = name;
		Cost = cost;
		EstimatedTime = estimatedTime;
	}
	
	public Task(String name, float cost) {
		Name = name;
		Cost = cost;
	}


	public void UpdateTask(Task aTask ) {
		// TODO - implement Task.UpdatTask
		throw new UnsupportedOperationException();
	}


	
	public void PrintDetails() {
		System.out.println("Name: "+ Name);
		System.out.println("Cost "+ Cost);
		System.out.println("Estimated time: "+ EstimatedTime);
	}

}