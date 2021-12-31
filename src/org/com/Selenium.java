package org.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\APPU\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://moneycontrol.com/markets/fno-market-snapshot");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//div[@class='leftD'])[2]"));
		
		
		File s = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Output.png");
		FileUtils.copyFile(s, dest);
				
	}

}
