package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.resources.Bean;

public class Login {
	static WebDriver driver = Bean.runBrowser(Bean.getbrowserName(), Bean.getBaseUrl(), Bean.getDriver());

	@BeforeMethod
	public static void setUp() {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	@Test
	public static void login()
	{
		driver.get(Bean.getBaseUrl());
		LoginPage.txtbx_username(driver).sendKeys(Bean.getUser());
		LoginPage.txtbx_password(driver).sendKeys(Bean.getPassword());
		LoginPage.chk_keepLogin(driver).click();
		LoginPage.button_login(driver).click();
	}
	@AfterMethod
	public static void cleanUp()
	{
		driver.quit();
	}
}
