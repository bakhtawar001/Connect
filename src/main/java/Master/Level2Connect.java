package Master;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import TestDataandLocators.Locators;



public class Level2Connect extends HelpingFunction{
	

	@BeforeClass
	  public void Browser_Chrome() throws IOException, InterruptedException, AWTException{
		 
		
			ConnectScenarios.BrowserChrome();
		 
	}
	@Test(priority=1)
	  public void ConnectLoginApp() throws IOException, InterruptedException, AWTException
	{
		
		ConnectScenarios.Connect_LoginApp();
		
	}
	@Test(priority=2)
	public void Advanced_SearchResult()throws IOException, InterruptedException, AWTException
	{
		ConnectScenarios.AdvancedSearchResult();
	}
	
	@Test(priority=3)
	public void DistCreditScore()throws IOException, InterruptedException, AWTException
	{
		Locators connect = PageFactory.initElements(driver, Locators.class);
		connect.textsearch.sendKeys("109480");
		connect.GO.click();
		Thread.sleep(5000);
		ConnectScenarios.Dist_CreditScore();
	}
	@Test(priority=4)
	public void ASIMediaStats()throws IOException, InterruptedException, AWTException
	{
		ConnectScenarios.ESPAnalyticsApp();
	}
	@AfterMethod
	public void getResult(ITestResult result)throws IOException 
	{
	test = extent.createTest(result.getName());
	if(result.getStatus()==ITestResult.SUCCESS)
		{
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + "Test Case is passed.", ExtentColor.GREEN));
			extent.flush();
		}
		if(result.getStatus()==ITestResult.FAILURE)
		{
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed.", ExtentColor.RED));
			test.fail(result.getThrowable());
			extent.flush();
		}
		if(result.getStatus()==ITestResult.SKIP)
		{
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case is Skipped.", ExtentColor.BLUE));
			//test.fail(result.getThrowable());
			extent.flush();
		}
	}
	
/*	@AfterSuite
	public void closebrowser()
	{
		
		driver.close();
		
	}*/
	
}
