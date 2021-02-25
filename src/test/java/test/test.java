	package test;

	 

	import org.testng.annotations.Test;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	 

	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import logintest.logintest;

	 

	public class test {
	    WebDriver driver;
	    
	    @BeforeMethod
	    public void LaunchBrowser() throws IOException {
	        
	        System.setProperty("webdriver.chrome.driver","/home/saidhanushtecno/Downloads/chromedriver");
	        driver = new ChromeDriver();
	        
	        driver.get("https://www.simplilearn.com/");
	        
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	        
	        
	    }
	    
	    
	    
	    @Test
	    public void logintest() {
	        logintest obj = new logintest(driver);
	        
	     
	        obj.Login("abc@xyz.com", "123abc");
	    }
	    
	    @AfterMethod
	    public void CloseBrowser() {
	        driver.quit();
	    }

	 

	}


