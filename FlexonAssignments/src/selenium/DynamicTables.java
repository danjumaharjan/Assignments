package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// assignment: find xpath for dynamic tables
public class DynamicTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\danju\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//since SREI company is not available, choosing Federal Bank
		String companyName = driver.findElement(By.xpath("//a[contains(@href,'//money.rediff.com/companies/federal-bank/14030062')]")).getText();
		
		String prevClose = driver.findElement(By.xpath("//a[contains(@href,'//money.rediff.com/companies/federal-bank/14030062')]/../..//td[3]")).getText();
		String currentPrice = driver.findElement(By.xpath("//a[contains(@href,'//money.rediff.com/companies/federal-bank/14030062')]/../..//td[4]")).getText();
		String changePercentage = driver.findElement(By.xpath("//a[contains(@href,'//money.rediff.com/companies/federal-bank/14030062')]/../..//td[5]")).getText();
		
		System.out.println("As of today, company is positioned at 8th");
		System.out.println("Company Name: " + companyName);
		System.out.println("Previous closing price: " + prevClose);
		System.out.println("Current price: " + currentPrice);
		System.out.println("Change is percentage: " + changePercentage);
		
		driver.close();

	}

}
