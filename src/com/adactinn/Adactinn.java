package com.adactinn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactinn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Adactinn\\ChromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.manage().window().maximize();
driver.get("http://adactinhotelapp.com/index.php");
driver.findElement(By.id("username")).sendKeys("nitinniranjan3");
driver.findElement(By.id("password")).sendKeys("123456789");
driver.findElement(By.id("login")).click();

WebElement loc = driver.findElement(By.id("location"));
Select sel=new Select(loc);
sel.selectByIndex(5);

Thread.sleep(2000);
WebElement loc1 = driver.findElement(By.id("hotels"));
Select sel2=new Select(loc1);
sel2.selectByValue("Hotel Sunshine");

WebElement loc3 = driver.findElement(By.id("room_type"));
Select sel3=new Select(loc3);
sel3.selectByIndex(2);

WebElement loc4 = driver.findElement(By.id("room_nos"));
Select sel4=new Select(loc4);
sel4.selectByIndex(2);

driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("27/08/2022");
driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("28/08/2022");

WebElement room = driver.findElement(By.id("adult_room"));
	Select se=new Select(room);
	se.selectByIndex(1);
	
	WebElement room1 = driver.findElement(By.id("child_room"));
	Select se1=new Select(room1);
	se1.selectByIndex(1);
	
	driver.findElement(By.id("Submit")).click();
	
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	driver.findElement(By.id("continue")).click();
	
driver.findElement(By.id("first_name")).sendKeys("niranjan");
driver.findElement(By.id("last_name")).sendKeys("niranjan");

driver.findElement(By.name("address")).sendKeys("123456 sathyamurthy nagar");
driver.findElement(By.id("cc_num")).sendKeys("1234567812345678");

WebElement card = driver.findElement(By.name("cc_type"));
	Select c= new Select(card);
	c.selectByIndex(1);
	
	WebElement card1 = driver.findElement(By.name("cc_exp_month"));
	Select d= new Select(card1);
	d.selectByValue("3");
	
	WebElement card2 = driver.findElement(By.name("cc_exp_year"));
	Select d1= new Select(card2);
	d1.selectByValue("2022");
	
	driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("564");
	
	driver.findElement(By.id("book_now")).click();
	
	//driver.findElement(By.id("search_hotel")).click();
	}

}
