package tests;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends TestBase{
	
	HomePage hp;
	
	@BeforeClass
	public void init() {
		
		hp = PageFactory.initElements(driver, HomePage.class);
		
	}
	
	@Test
	public void verifyAddToCart() throws InterruptedException {
		String count = hp.addToCartTest();
		System.out.println("count----->"+count);
		Assert.assertEquals(count,"1");
	}

}
