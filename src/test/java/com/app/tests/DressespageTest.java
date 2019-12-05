package com.app.tests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.app.pages.BasePage;
import com.app.pages.DressesPageObjects;
import com.app.pages.HomePageObjects;

public class DressespageTest {
	DressesPageObjects dp;
	BasePage bp;
	HomePageObjects hp;

	public DressespageTest() {
		hp = new HomePageObjects();
		dp = new DressesPageObjects();
		bp = new BasePage();
	}
	@BeforeClass
	   public void beforeClass() {
		System.out.println(bp.getTitlte());
	   }

	@BeforeMethod
	   public void clickdress() {
		hp.getDress().click();
	   }

	@Test(priority=1)
	public void verifysmallmediumlarge()
	{
	Assert.assertTrue(bp.elementEnabled(dp.getSmall1()));
	Assert.assertTrue(bp.elementEnabled(dp.getMedium1()));
	Assert.assertTrue(bp.elementEnabled(dp.getLarge1()));	
	}
	
		
	@Test(priority=2)
	public void verifyProductheaderCount() 
	{
		System.out.println(dp.getProductNumberFromHeader());
		System.out.println(dp.getProductCount());
		Assert.assertTrue(dp.getProductNumberFromHeader()==dp.getProductCount(),"Failed:count mismatch");
	}
	
	@Test(priority=3)
	public void verifysearchtab()
	{
		Assert.assertTrue(bp.elementFound(dp.getsearchtab()));
		dp.getsearchtab().sendKeys("dresses");
		dp.getclick().click();
		Assert.assertTrue(bp.elementFound(dp.getImage()));	
	}
	
	
}
