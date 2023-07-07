package Tests;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public WebDriver driver;
	@Given("I am on careers")
	public void i_am_on_career() throws InterruptedException {
	    System.out.println("I am on career");
	   WebDriverManager.chromiumdriver().setup();
	   
	    driver = new ChromeDriver();
	   // driver=new ChromeDriver();
	   
	    System.out.println("ater chroem launching");
	    Thread.sleep(5000);	   
	    System.out.println("ater sleep method");
	    driver.get("https://www.google.com");
	    Thread.sleep(5000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

	@When("I click on career guide menus")
	public void i_click_on_career_guide_menu() {
		  System.out.println("I am on career");
	}

	@Then("I should see career guide pages")
	public void i_should_see_career_guide_page() {
		  System.out.println("I am on career");
		  driver.navigate().to("https://www.facebook.com");
	}

	@Given("I am on careerss")
	public void i_am_on_career1() throws InterruptedException {
		
		  System.out.println("I am on career");
		  driver.navigate().back();
		  Thread.sleep(5000);
	}

	@When("I click on career guide menuss")
	public void i_click_on_career_guide_menu1() {
		  System.out.println("I am on career");
		  driver.navigate().forward();
	}

	@Then("I should see career guide pagess")
	public void i_should_see_career_guide_page1() {
		  System.out.println("I am on career");
		  driver.navigate().refresh();
		  String parent=driver.getWindowHandle();
		 Set<String> win= driver.getWindowHandles();
		 driver.switchTo().newWindow(WindowType.WINDOW);
		 for(String windows:win) {
			driver.switchTo().window(windows);
			driver.get("https://www.youtube.com");
			driver.close();
		 }
		 driver.switchTo().window(parent);
		 driver.navigate().to("https://www.google.com");
		 driver.close();
	}
}
