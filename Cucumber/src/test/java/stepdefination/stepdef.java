package stepdefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;


public class stepdef {
    WebDriver driver=null;
    @Given("^I am on user registration page$")
    public void goToWebPage(){
        driver.navigate().to("https://www.facebook.com/");
    }
    @When("^I enter valid data on the page$")
    public void enterValidData(){
        driver.findElement(By.name("firstname")).sendKeys("Michael");
        driver.findElement(By.name("lastname")).sendKeys("John");
        driver.findElement(By.name("registered_email__")).sendKeys("michael123@gmail.com");
        driver.findElement(By.name("registered_email_confirmation__")).sendKeys("michael123@gmail.com");
        driver.findElement(By.name("registered_email__")).sendKeys("michael123@gmail.com");
        driver.findElement(By.name("registered_passwd__")).sendKeys("Mike@123");
        Select dropdownB = new Select(driver.findElement(By.name("birth_day")));
        dropdownB.selectByValue("12");  
        Select dropdownM = new Select(driver.findElement(By.name("birth_month")));
        dropdownM.selectByValue("7");  
        Select dropdownY = new Select(driver.findElement(By.name("birth_year")));
        dropdownY.selectByValue("1999");  
        driver.findElement(By.className("_59mt")).click();
        driver.findElement(By.name("websubmit")).click();

    }
    @Then("^user registration should be successful$")
    public void User_registration_should_be_successful(){
        if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/")){
            System.out.print("Test Pass");
        }
        else{
            System.out.print("Test Failed");

        }
        driver.close();
    }
    
    


    
}
