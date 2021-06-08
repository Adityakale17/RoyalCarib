package com.cyient.test;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cyient.base1.WebWrapper;


public class LoginTest extends WebWrapper{
	
	@Test
	public void invalidCredential() throws InterruptedException
	{	
	
	driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
	
	
	driver.findElement(By.xpath("//a[normalize-space()='Create an account']")).click();
	
	driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Raul");
    driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("Jimnez");
    
    driver.findElement(By.xpath("//span[(text()='Month')]")).click();
    driver.findElement(By.xpath("//span[(text()=' April ')]")).click();
    
    driver.findElement(By.xpath("//span[text()='Day']")).click();
    driver.findElement(By.xpath("//span[text()=' 4 ']")).click();
    
    driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("1995");
 
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
  //  driver.findElement(By.xpath("//span[contains(text(),'India')])[2]")).click();
    driver.findElement(By.xpath("//span[text()=' India ']")).click();
    
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("aditya1008@gmail.com");
    driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("@aditya17");
    
    driver.findElement(By.xpath("//span[text()='Select one security question']")).click();
    driver.findElement(By.xpath("//span[text()=' What is the name of the street where you first lived? ']")).click();
    driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("MG Road");
    
    driver.findElement(By.xpath("//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")).click();
    Thread.sleep(3000);
	driver.findElement(By.xpath("//button[normalize-space()='Done']")).click();	
	
	Assert.assertEquals(driver.getTitle(), "Royal Caribbean");
	
	}

}
