package Biskane1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Biskane1 extends Baseclass{
	@Test(priority=0)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("pooja@katchintech.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Cust@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btn_send']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='bi bi-box-arrow-right']")).click();
	}
	@Test(priority=1)
	public void verifyDashboardpage() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("pooja@katchintech.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Cust@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btn_send']")).click();
		Thread.sleep(2000);
		System.out.println("I am inside Dashboard page");
		String expected ="AANEEN CUSTOMERPOOJA";
		String Actual= driver.findElement(By.xpath("//h4[contains(text(),'Aaneen CustomerPooja')]")).getText();
		Assert.assertEquals(Actual, expected);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='bi bi-box-arrow-right']")).click();
	}

	@Test(priority = 2)
	public void changepfp() throws AWTException, InterruptedException {
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("pooja@katchintech.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Cust@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btn_send']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btn btn-block btn-outlined']")).click();
		Thread.sleep(5000);
		Robot rb = new Robot();
		StringSelection str = new StringSelection("C:\\Users\\thora\\Desktop\\tree-736885__480.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='btngreen mtop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='bi bi-box-arrow-right']")).click();
	}
	@Test(priority=3)
	public void countNoofcategories() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("pooja@katchintech.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Cust@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btn_send']")).click();
		Thread.sleep(2000);
		System.out.println("I am inside Dashboard page");
		String expected ="AANEEN CUSTOMERPOOJA";
		String Actual= driver.findElement(By.xpath("//h4[contains(text(),'Aaneen CustomerPooja')]")).getText();
		Assert.assertEquals(Actual, expected);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='menu-hover top-menu'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class='menu-hover top-menu'])[4]")).click();
		Thread.sleep(2000);
		System.out.println("I am inside the shop page");
		String expected1 = "SHOP INDIGENOUS";
		String Actual1 = driver.findElement(By.xpath("//*[@class='d-flex align-items-start headingImgTag']")).getText();
		Assert.assertEquals(Actual, expected);
		Thread.sleep(2000);
		List<WebElement> categories = driver.findElements(By.xpath("//*[@class='name']"));
		int count = categories.size();
		System.out.println("The amount of categories in the shop page are: " + count);
		driver.findElement(By.xpath("//*[@id='dashboard']")).click();
		driver.findElement(By.xpath("//*[@class='bi bi-box-arrow-right']")).click();
	}
	@Test(priority=4)
	public void switchuser() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("pooja@katchintech.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Cust@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btn_send']")).click();
		Thread.sleep(2000);
		System.out.println("I am inside Dashboard page");
		String expected ="AANEEN CUSTOMERPOOJA";
		String Actual= driver.findElement(By.xpath("//h4[contains(text(),'Aaneen CustomerPooja')]")).getText();
		Assert.assertEquals(Actual, expected);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='dropdown-item']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='bi bi-box-arrow-right']")).click();
	}
	@Test(priority=5)
	public void editcollection() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("pooja@katchintech.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Cust@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='btn_send']")).click();
		Thread.sleep(2000);
		System.out.println("I am inside Dashboard page");
		String expected ="AANEEN CUSTOMERPOOJA";
		String Actual= driver.findElement(By.xpath("//h4[contains(text(),'Aaneen CustomerPooja')]")).getText();
		Assert.assertEquals(Actual, expected);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='dropdown-toggle']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='dropdown-item']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='swal2-confirm swal2-styled']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='btn_send'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("Jelly-fish(edited)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='bi bi-box-arrow-right']")).click();
		
	}
}