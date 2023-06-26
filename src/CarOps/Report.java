package CarOps;

public class Report {

	private String Date;
	private int ReportID;

	/**
	 * 
	 * @param Type
	 */
    public Report() {
    	
    	this.ReportID=Registry.Reports.size()+1;
    	Registry.Reports.add(this);
    	
    }
	
	

}