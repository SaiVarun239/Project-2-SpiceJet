package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static ExtentReports getExtentReport() {

		String extentReportPath = System.getProperty("user.dir")+"\\reports\\extentreport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("SpiceJet Automation Results");
		reporter.config().setDocumentTitle("SpiceJet Automation Test Results");
		
		ExtentReports extentReport = new ExtentReports();
		extentReport.attachReporter(reporter);
		
		return extentReport;
	}
}
