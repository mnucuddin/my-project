package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreateNewAccountModel;

public class CreateNewAccountPage extends CreateNewAccountModel {
	
	public   CreateNewAccountPage(WebDriver driver) {
		super(driver);
	}
	
	public   void   typeFirstName(String firstname) throws InterruptedException {
		WebElement e = getFirstName();
		e.sendKeys(firstname);
	}
	
	public   void   typeLastName(String lastname) throws InterruptedException {
		WebElement e = getLastName();
		e.sendKeys(lastname);
	}
	public   void   typeemailInput(String emailInput) throws InterruptedException {
		WebElement e = getemailInput();
		e.sendKeys(emailInput);
	}
	public   void   typereEmailInput(String reEmailInput) throws InterruptedException {
		WebElement e = getreEmailInput();
		e.sendKeys(reEmailInput);
	}
	public   void   typepassword(String password) throws InterruptedException {
		WebElement e = getpassword();
		e.sendKeys(password);
	}
	public   void   typemonth(String month) throws InterruptedException {
		WebElement e = getmonth();
		Select monthObj = new Select(e);// if exist select,we have to create select object.
		monthObj.selectByVisibleText(month);
	}
	public   void   typeday(String day) throws InterruptedException {
		WebElement e = getday();
		Select dayObj = new Select(e);// if exist select,we have to create select object.
		dayObj.selectByVisibleText(day);
	}
	public   void   typeyear(String year) throws InterruptedException {
		WebElement e = getyear();
		Select yearObj = new Select(e);// if exist select,we have to create select object.
		yearObj.selectByVisibleText(year);
	}
	public   void   typeclick() throws InterruptedException {
		WebElement e = getclick();
		e.click();
	}

}
