package CarOps;

public class Report {

	private String Date;
	private int ReportID;


    public Report(String Data) {   	
    	this.Date=Data;
    	this.ReportID=Registry.Reports.size()+1;
    	Registry.Reports.add(this);   	
    }
	
	

}