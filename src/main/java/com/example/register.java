package com.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class register {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.navigate().to("file:///C:/Users/Dinushi.R/Desktop/registration.html");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//*[@id=\"fn1\"]")).sendKeys("Ravi");
		//WebElement firstname = driver.findElement(By.name("fn"));
		//firstname.sendKeys("Ravi");
		driver.findElement(By.xpath("//*[@id=\"fn2\"]")).sendKeys("kathir");
		
		WebElement password = driver.findElement(By.name("pass1"));
		password.sendKeys("duleeshi97");
		
		WebElement repassword = driver.findElement(By.name("pass2"));
		repassword.sendKeys("duleeshi97");
		
		if(password.getAttribute("value").equals(repassword.getAttribute("value"))) {
			System.out.println("Both passwords are same.");
		}else {
			System.out.println("Passwords are not same.");
		}
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ravi123@gmail.com");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td/input")).sendKeys("0779829019");
		driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("76,midellwela,plalwela");
		
		driver.findElement(By.name("g")).click();//radio button
		
		driver.findElement(By.className("automation1")).click();//checkbox
		
		Select s = new Select(driver.findElement(By.id("country")));//selection
		s.selectByIndex(1);
		
		//WebElement save = driver.findElement(By.xpath("//input[@type='submit']"));
		//save.click();
		//save aka dunnma hena wegen fill wela nahuwa ynwa ,himita bala gnn one nisa aka danata nodi emu
		
		//WebElement reset = driver.findElement(By.xpath("//input[@type='reset']"));
		//reset.click();
	}

}
