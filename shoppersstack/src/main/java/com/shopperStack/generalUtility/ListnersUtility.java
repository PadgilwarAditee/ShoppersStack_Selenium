package com.shopperStack.generalUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersUtility implements ITestListener, ISuiteListener{
	
	JavaUtility javautil = new JavaUtility();
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts= (TakesScreenshot) BaseTest.listenerDriver;
		
		File source= ts.getScreenshotAs(OutputType.FILE);
		File dest= new File(FrameWorksConstants.screenshotPath+javautil.localdateTime()+".png");
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
