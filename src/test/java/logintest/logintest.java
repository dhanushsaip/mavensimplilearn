
	package logintest;

	 

	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	 

	public class logintest {
		
	    WebDriver driver;
	    //=============Web Elements ========//
	    
	   @FindBy(linkText="log in ")
	   WebElement lnklogin;
	   
	   
	   
	    
	    @FindBy(name="user_login")
	    WebElement editUserName;
	    
	    @FindBy(name="user_pwd")
	    WebElement editPwd;
	    
	    @FindBy(className="rememberMe")
	    WebElement chkBox;
	    
	    @FindBy(name="btn_login")
	    WebElement btnPwd;
	    
	    
	    public logintest(WebDriver testdriver) {
	        this.driver =  testdriver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    //============Methods======================//
	    
	    public void Login(String Username, String Password) {
	        
	        WebElement linklogin = driver.findElement(By.linkText("Log in"));
	        
	        linklogin.click();
	        
	        WebElement editUsername = driver.findElement(By.name("user_login"));
	        
	        editUsername.sendKeys(Username);
	        

	 

	        WebElement editPwd = driver.findElement(By.name("user_pwd"));
	    
	        editPwd.sendKeys(Password);
	        
	        WebElement chkBox = driver.findElement(By.className("rememberMe"));
	        
	        chkBox.click();
	        
	        WebElement btnPwd = driver.findElement(By.name("btn_login"));
	        btnPwd.click();
	        }
	    }


