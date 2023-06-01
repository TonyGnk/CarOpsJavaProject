package CarOps;

public class AssignmentSparePart{

	private int Quantity;
	SparePart aSparePart;
	
	public AssignmentSparePart(int Quantity, SparePart aSparePart) {
		this.Quantity = Quantity;
		this.aSparePart = aSparePart;
		
	}

	public void PrintDetails() {
		System.out.println("This Assignment Spare Part has a Spare Part called " +aSparePart.GetName() +"with"+ Quantity +"quantity");
		
		
	}

}