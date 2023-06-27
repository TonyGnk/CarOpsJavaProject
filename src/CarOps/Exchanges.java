//Tony - Done
package CarOps;

public class Exchanges {
	private int cost; 
	private int exchangeID;
	private Session aSession;
	
	public Exchanges(int cost,Session aSession) {
		this.cost=cost;
		this.aSession=aSession;
		this.exchangeID=Registry.Exchanges.size() + 1;
		Registry.Exchanges.add(this);
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