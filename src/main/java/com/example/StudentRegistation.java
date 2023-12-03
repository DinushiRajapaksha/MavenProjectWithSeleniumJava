package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class StudentRegistation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("file:///D:/Automate%20Student_Registration%20using%20Selenium%20with%20Java/index.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Joseph Vijay");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Chandarasekara");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input")).sendKeys("06/22/1974");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/input")).sendKeys("vijay@yahoo.com");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("+9167 765 4321");
		driver.findElement(By.xpath("//*[@id=\"adrs\"]")).sendKeys("64, kaveri street ,saligramam,central");
		WebElement gender=driver.findElement(By.id("male"));
		gender.click();
		WebElement hobbyoption1=driver.findElement(By.name("hobby_1"));
		hobbyoption1.click();
		WebElement hobbyoption2=driver.findElement(By.name("hobby_2"));
		hobbyoption2.click();
		//Select s =new Select(driver.findElement(By.id("Course")));
		//s.selectByValue("BBA");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[9]/td[2]/select")).sendKeys("B.Tech");
		
		WebElement elment1 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[10]/td[2]/input"));
		elment1.sendKeys("vijaya@123456");
		WebElement elment2 = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[11]/td[2]/input"));
		elment2.sendKeys("vijaya@123456");
		
		String pass = elment1.getAttribute("value");
		String repass = elment2.getAttribute("value");
		
		String text1="pw eqaul";
		String text2="pw not eqaul";
		
		if(pass.equals(repass)) {
			System.out.println(text1);
		}
		else {
			System.out.println(text2);
		}
		
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/table/tbody/tr/td[2]/input")).sendKeys("AAA");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/table/tbody/tr/td[3]/input")).sendKeys("1.2254");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[12]/td[2]/table/tbody/tr/td[4]/input")).sendKeys("44");
		
		
	}

}