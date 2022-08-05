package test;

import org.testng.annotations.Test;

public class CreateNewAccountPageTest extends BaseTest {
	
	@Test
	public void createaccountPageTest() throws InterruptedException {
		
		getHomePage();
		homepage.clickOnCreateNewAccountBtn();
		
		getcreatenewaccountpage();
		String firstname = "Joe";
		String lastname = "Biden";
		String emailInput = "joe@gmail.com";
		String reEmailInput = "joe@gmail.com";
		String password = "joe123456";
		String month = "Dec";
		String day = "10";
		String year = "2000";
	    createnewaccountpage.typeFirstName(firstname);
		createnewaccountpage.typeLastName(lastname);
		createnewaccountpage.typeemailInput(emailInput);
		createnewaccountpage.typereEmailInput(reEmailInput);
		createnewaccountpage.typepassword(password);
		createnewaccountpage.typemonth(month);
		createnewaccountpage.typeday(day);
		createnewaccountpage.typeyear(year);
	
		createnewaccountpage.typeclick();
		
	}

}
