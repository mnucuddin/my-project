package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewAccountModel extends BaseModel {
	
	public CreateNewAccountModel(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getFirstName() throws InterruptedException {
		//Thread.sleep(3000);
		By locator = By.xpath("//input[@name='firstname']");
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		WebElement e = driver.findElement(locator);
		return e;
	}
	public WebElement getLastName() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//input[@name='lastname']"));
		return e;
	}
	public WebElement getemailInput() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		return e;
}
	public WebElement getreEmailInput() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//input[@aria-label='Re-enter email']"));
		return e;
}
	public WebElement getpassword() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		return e;
}
	public WebElement getmonth() throws InterruptedException {
		WebElement e = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		return e;
}public WebElement getday() throws InterruptedException {
	WebElement e = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	return e;
}
public WebElement getyear() throws InterruptedException {
	WebElement e = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	return e;
}
public WebElement getclick() throws InterruptedException {
	WebElement e = driver.findElement(By.xpath("//span[@class='_5k_2 _5dba']/child::label[text()='Female']"));
	return e;
}
}