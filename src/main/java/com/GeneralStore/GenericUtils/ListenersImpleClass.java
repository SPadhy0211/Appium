package com.GeneralStore.GenericUtils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImpleClass implements ITestListener{

	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+ failedMethod +".png");
		try
		{
			FileUtils.copyFile(src, dest);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
