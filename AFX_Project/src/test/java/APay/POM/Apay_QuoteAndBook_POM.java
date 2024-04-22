package APay.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import APay.APay_Baseclass;
import io.cucumber.java.After;

public class Apay_QuoteAndBook_POM extends APay_Baseclass {

	
	public void QuoteandBook() {

		initializeWait();	   
		WebElement quoteandbook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Quote and Book']")));
		quoteandbook.click();
	}

	public void QuoteandBook_New() {

		initializeWait();	   
		WebElement new_option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='QuotenBookNew']")));
		new_option.click();
	}

	public void Select_currencyAndAmount(String BuyAmount) {

		driver.switchTo().frame(1);

		initializeWait();
		WebElement Buycurrency = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ddlBuy']")));
		Buycurrency.click();

		Select select_currency = new Select(Buycurrency);
		select_currency.selectByIndex(1);

		WebElement Buyamount = driver.findElement(By.xpath("//input[@id='BuyAmount']"));
		Buyamount.sendKeys(BuyAmount);

	}

	public void Get_quote() {

		WebElement Getquote = driver.findElement(By.xpath("//input[@id='btnGetQuote']"));
		Getquote.click();

		initializeWait();
		WebElement Acceptquote = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='btnAccept']")));
		Acceptquote.click();

		driver.switchTo().defaultContent();

	}

	public void select_payee() throws InterruptedException {

		int framecount = driver.findElements(By.tagName("iFrame")).size();
		System.out.println("The Frame count is: " + framecount);

		Thread.sleep(7000);
		initializeWait();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@class='tabs-panels']//div[2]//div[1]//div[1]//iframe[1]")));

		WebElement payeeName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='paymentAccoutnName']")));		
		payeeName.click();

		WebElement payee_select = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[4]/td[1]/div[1]/a[1]")));
		payee_select.click();

	}

	public void payment_Reference(String Payment_Reference, String Internal_Reference) {

		WebElement payment_reference = driver.findElement(By.xpath("//input[@id='paymentRef']"));
		payment_reference.sendKeys(Payment_Reference);

		WebElement Internal_reference = driver.findElement(By.xpath("//input[@id='internalRef']"));
		Internal_reference.sendKeys(Internal_Reference);

		WebElement Add_payment = driver.findElement(By.xpath("//button[@id='AddTransaction']"));
		Add_payment.click();

	}

	public void payment_Approval() {

		initializeWait();
		WebElement submit_Approval = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='btn_Approve_Submit']")));
		submit_Approval.click();

	}

}
