package SelProj.SelProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AC70068\\Downloads\\chromedriver_\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.lumen.com/en-us/home.html");
		Thread.sleep(5000);
		System.out.println(driver.getTitle());


		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='tier-link'][contains(.,'SOLUTIONS')]")))
		.moveToElement(driver.findElement(By.xpath("//span[@class='tier-link'][contains(.,'By Industry')]")))
		.click(driver.findElement(By.xpath("(//a[contains(@class,'tier-link ')])[23]"))).build().perform();

		Thread.sleep(5000);
		System.out.println(driver.getTitle());

		driver.close();
		driver.quit();
	}

}
