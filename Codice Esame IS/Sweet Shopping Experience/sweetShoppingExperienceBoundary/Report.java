package sweetShoppingExperienceBoundary;

import java.util.Calendar;

public abstract class Report 
{
	private Calendar dataInizio, dataFine;
	
	public Report(String dataInzio, String dataFine)
	{
		//TODO implement Report constructor
	}
	
	public abstract String generateReport();
}
