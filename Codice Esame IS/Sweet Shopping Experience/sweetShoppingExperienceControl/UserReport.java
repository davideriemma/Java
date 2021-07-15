package sweetShoppingExperienceControl;

import sweetShoppingExperienceDAO.UserReportDAO;

public class UserReport extends sweetShoppingExperienceBoundary.Report
{

	public UserReport(String dataInzio, String dataFine) 
	{
		super(dataInzio, dataFine);
	}

	/**
	 * Uses the information on the dataInizio and dataFine
	 * @return a formatted string containing the report
	 */
	@Override
	public String generateReport() {
		// TODO Scrivere User.generateReport
		return null;
	}
}
