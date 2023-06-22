//Tony - Done
package CarOps;

public class Exchanges {
	private int cost; 
	private int exchangeID;
	
	public Exchanges(int cost, int exchangeID) {
		this.cost=cost;
		this.exchangeID=exchangeID;
	}
	
	//Getters & Setters
	public int getCost() { return cost; }
    public void setCost(int cost) { this.cost = cost; }

    public int getExchangeID() { return exchangeID; }
    public void setExchangeID(int exchangeID) { this.exchangeID = exchangeID; }
}

	/*EXAMPLES
		Exchanges exchange = new Exchanges(100, 1);
	 */