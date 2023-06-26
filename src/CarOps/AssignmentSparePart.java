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

}