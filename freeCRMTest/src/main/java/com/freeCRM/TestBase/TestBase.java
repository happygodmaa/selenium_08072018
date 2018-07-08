package com.freeCRM.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.freeCRM.util.TestUtil;
	public class TestBase {
	
	public static WebDriver driver;
	public static Properties p;	
	public TestBase(){
			try {
			p= new Properties();
			FileInputStream f= new FileInputStream("C://Users//nikhil//eclipse-workspace//freeCRMTest//src//main//java//com//freeCRM//config//config.properties");
			p.load(f);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	
	public static void initialization(){
		String browserName= p.getProperty("browser");

		if(browserName.equals("chrome")){
		    System.setProperty("webdriver.chrome.driver","C:/Users/nikhil/Documents/selenium/chromedriver_win32_080618/chromedriver.exe");
		driver= new ChromeDriver();
	 	}
		else {
	System.setProperty("webdriver.firefox.driver","C:/Users/nkumar65/Downloads/firefoxdriver");
		driver= new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.PageLoadTimeout,TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
}
}