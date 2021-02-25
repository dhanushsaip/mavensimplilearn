package simplilearn;

 

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

 

public class loginTest
{
    WebDriver driver;
    SoftAssert assertobj = new SoftAssert();
   
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/saidhanushtecno/Downloads/chromedriver");
        
        driver = new ChromeDriver();
        
        driver.get("https://www.simplilearn.com/");
        
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
            
    }
    
    @Parameters({"uname","password"})
    @Test
    public void testcase1(String uname,String password)
    {
    
    WebElement inkLogin =driver.findElement(By.linkText("Log in"));
    
    inkLogin.click();
    
    WebElement editUsername = driver.findElement(By.name("user_login"));
    
    editUsername.sendKeys(uname);
    
    WebElement editPwd = driver.findElement(By.name("user_pwd"));
    
    editPwd.sendKeys(password);
    
    WebElement chkBox = driver.findElement(By.className("rememberMe"));
    
    chkBox.click();
    
    WebElement btnPwd= driver.findElement(By.name("btn_login"));
    
    btnPwd.click();
    
    WebElement error = driver.findElement(By.id("msg_box"));
    
    String ActError = error.getText();
    
    String ExpError = "The email or password you have entered is invalid.";
    
    Assert.assertEquals(ActError, ExpError);
    
    assertobj.assertEquals(ActError, ExpError);
    
    System.out.println("After Failiure");
    }
    
    @AfterMethod
    public void teardown()
    {
    driver.quit();
    assertobj.assertAll();
    }
}
 