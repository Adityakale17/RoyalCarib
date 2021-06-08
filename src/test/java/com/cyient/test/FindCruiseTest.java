package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base1.WebWrapper;

public class FindCruiseTest extends WebWrapper {
	@Test
	public void invalidTest()throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='highlight__content']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='headerMainToolbar__menu__icon']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Find a Cruise']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='2021-2022 Cruises']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();
		
		
		driver.findElement(By.id("rciFirstName")).sendKeys("Raul");
		driver.findElement(By.id("rciLastName")).sendKeys("Jimnez");
		driver.findElement(By.xpath("//select[@class='md-input']")).click();
		
		Select selectCountry = new Select(driver.findElement(By.xpath("//select[@class='md-input']")));
		selectCountry.selectByVisibleText("India");
		driver.findElement(By.xpath("//button[normalize-space()='Sign Up']")).click();

		String actalValue= driver.findElement(By.id("rciEmailAddressMissing")).getText();
		Assert.assertEquals( actalValue,"Missing Email Address");
		
		
		
	}

}
