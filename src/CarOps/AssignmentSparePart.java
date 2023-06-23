package CarOps;

public class AssignmentSparePart extends SparePart{
	
	private SparePart aSparePart;
    private TaskAssignment aTaskAssignment;
	private int Quantity;
	
	public AssignmentSparePart(int Quantity) {
		this.Quantity = Quantity;
	}

	public void PrintDetails() {
		System.out.println(GetName() +","+ Quantity +"quantity");
	}

}