package CarOps;

public class SparePart {

	private String Name;
	private int CostPerPiece;
	private int TotalPieces;

    public SparePart (String Name,int CostPerPiece,int TotalPieces) {
    	this.Name=Name;
    	this.CostPerPiece=CostPerPiece;
    	this.TotalPieces=TotalPieces;
    	Registry.SpareParts.add(this);
    	
    }
	
	public void PrintDetails() {
		System.out.println("Name: "+ Name);
		System.out.println("Cost per Piece: "+ CostPerPiece);
		System.out.println("Total Pieces: "+ TotalPieces);
	}
	
	public String GetName() {
		return Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getCostPerPiece() {
		return CostPerPiece;
	}

	public void setCostPerPiece(int costPerPiece) {
		CostPerPiece = costPerPiece;
	}

	public int getTotalPieces() {
		return TotalPieces;
	}

	public void setTotalPieces(int totalPieces) {
		TotalPieces = totalPieces;
	}
	

}