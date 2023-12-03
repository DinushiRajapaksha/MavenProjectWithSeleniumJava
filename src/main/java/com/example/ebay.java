package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {

	

	public static void main(String[] args) {
		
		ebay ebay=new ebay();
		ebay.openChromeBrowser();
		ebay.enterProduct();
		ebay.search("Cell phone & accessories");
		ebay.printResult();
		ebay.printNthProduct(10);
		ebay.printAll();
		ebay.printAllResultWithScroll();

	}
	WebDriver driver=new ChromeDriver();
	
	//Method to open Chrome Browser
	public void openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
	
	//To enter a product in the search bar
	public void enterProduct() {
		WebElement enterProduct=driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
		enterProduct.sendKeys("Apple Watches");
	}
	//Method to click search button
	public void search(String Category) {
		//driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys(Product);
		driver.findElement(By.xpath("//*[@id=\"gh-cat\"]")).sendKeys(Category);
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"gh-btn\"]"));
		search.click();
	}
	//A method to print the result of the products
	public void printResult() {
		String printresult=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1")).getAttribute("textContent");
		System.out.println("The Results of the product is :"+printresult);
		

	}
	
	//A methord to print Nth product
	
	public void printNthProduct(int number) {
		number=number+1;
		WebElement element=driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li["+number+"]"));
		String nthproduct=element.getText();
		System.out.println("*******************************************************************************");
		System.out.println("The Results of "+(number-1)+"th product is :"+nthproduct);
	}
	//A method to print All products from first page
	public void printAll() {
		WebElement printall=driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li"));
		String pp=printall.getText();
		System.out.println("*******************************************************************************");
		System.out.println("The Results of all products are :"+pp);
		
		
			
		}
	
	public void printAllResultWithScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		List<WebElement> allProducts = driver.findElements(By.xpath("//*[@id=\"srp-river-results\"]/ul/li"));
		int count = 1;
		
		for( WebElement product : allProducts){
			
			
			
			js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li["+count+"]")));
			
			System.out.println("*********************************************************************");
			
			System.out.println(product.getText());

			System.out.println("*********************************************************************");
			
			count++;
		}
   
	}

}
