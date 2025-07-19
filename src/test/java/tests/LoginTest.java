package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;
import utilities.ConfigReader;
import utilities.EncryptUtil;

public class LoginTest extends BaseTest {

	@Test(priority = 1, groups = { "Sanity",
			"Regression" }, description = "Test to verify login with valid credentials.")
	public void testLoginWithValidCredentials() {

		LoginPage loginPage = new LoginPage(driver);
		ProductsPage productsPage = loginPage.login(ConfigReader.getValue("QA", "validUser"),
				EncryptUtil.decrypt(ConfigReader.getValue("QA", "encryptedPass")));
		assertTrue(productsPage.isPageDisplayed(), "Products Page is not displayed.");
	}
}
