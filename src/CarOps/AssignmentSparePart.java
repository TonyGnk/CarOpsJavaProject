package CarOps;

public class AssignmentSparePart {
	
	private SparePart aSparePart;
    private TaskAssignment aTaskAssignment;
	private int TaskQuantity;
	
	public AssignmentSparePart(TaskAssignment aTaskAssigment,SparePart aSparePart,int Quantity) {
		this.aTaskAssignment=aTaskAssignment;
		this.TaskQuantity = Quantity;
		this.aSparePart=aSparePart;
	}

	public void PrintDetails() {
		System.out.println(this.aSparePart.GetName() +","+ TaskQuantity +"quantity");
	}

	public SparePart getaSparePart() {
		return aSparePart;
	}

	public void setaSparePart(SparePart aSparePart) {
		this.aSparePart = aSparePart;
	}

	public TaskAssignment getaTaskAssignment() {
		return aTaskAssignment;
	}

	public void setaTaskAssignment(TaskAssignment aTaskAssignment) {
		this.aTaskAssignment = aTaskAssignment;
	}

	public int getTaskQuantity() {
		return TaskQuantity;
	}

	public void setTaskQuantity(int taskQuantity) {
		TaskQuantity = taskQuantity;
	}

}