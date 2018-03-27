package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element = null;
	
	public static WebElement lbl_title(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"Ldiv1\"]/h1"));
		return element;
	}
	
	public static WebElement txtbx_username(WebDriver driver)
	{
		element = driver.findElement(By.id("Lid"));
		return element;
	}
	
	public static WebElement txtbx_password(WebDriver driver)
	{
		element = driver.findElement(By.id("Lpwd"));
		return element;
	}
	
	public static WebElement chk_keepLogin(WebDriver driver)
	{
		element = driver.findElement(By.id("Rem"));
		return element;
	}
	
	public static WebElement button_login(WebDriver driver)
	{
		element = driver.findElement(By.id("Lsub"));
		return element;
	}
	
	public static WebElement button_logNoUserNoPass(WebDriver driver)
	{
		element = driver.findElement(By.id("LNA"));
		return element;
	}
	
	public static WebElement button_createAccount(WebDriver driver)
	{
		element = driver.findElement(By.id("N_acnt"));
		return element;
	}
	
	public static WebElement lbl_forgotPassword(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\"Ldiv2\"]/p[3]/text()[1]"));
		return element;
	}
	
	public static WebElement button_forgotPassword(WebDriver driver)
	{
		element = driver.findElement(By.id("Lres"));
		return element;
	}
	
	public static WebElement button_about(WebDriver driver)
	{
		element = driver.findElement(By.id("Labo"));
		return element;
	}
	
	public static WebElement button_contact(WebDriver driver)
	{
		element = driver.findElement(By.id("Lcon"));
		return element;
	}

}
