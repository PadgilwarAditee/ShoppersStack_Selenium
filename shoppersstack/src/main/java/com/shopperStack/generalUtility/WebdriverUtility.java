package com.shopperStack.generalUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility  {
	Select sel;
	File source;
	File dest;
	
	//JavaUtility javautil= new JavaUtility();
	
	public void webpageScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		source= ts.getScreenshotAs(OutputType.FILE);
		dest= new File("./screenshot");
		FileHandler.copy(source, dest);
	}
	
	public void wbElementScreenshot(WebElement ele) throws IOException {
		 source= ele.getScreenshotAs(OutputType.FILE);
			dest= new File("./screenshot");
			FileHandler.copy(source, dest);
	}
	
	public void selectByIndex(WebElement ele, int value) {
		sel = new Select(ele);
		sel.selectByIndex(value);
	}
	
	public void selectByValue(WebElement ele, String value) {
		sel = new Select(ele);
		sel.selectByValue(value);
	}
	
	public void selectBytext(WebElement ele, String text) {
		sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void deSelectByIndex(WebElement ele, int value){
		sel = new Select(ele);
		sel.deselectByIndex(value);
	}
	
	public void deSelectByValue(WebElement ele, String value) {
		sel = new Select(ele);
		sel.deselectByValue(value);
	}
	
	public void deSelectBytext(WebElement ele, String text) {
		sel = new Select(ele);
		sel.deselectByVisibleText(text);
	}
	
	
	public void deSelectAll(WebElement ele) {
		sel = new Select(ele);
		sel.deselectAll();
	}
}
