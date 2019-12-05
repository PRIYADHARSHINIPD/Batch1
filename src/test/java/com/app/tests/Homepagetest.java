package com.app.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.app.pages.BasePage;
import com.app.pages.DressesPageObjects;
import com.app.pages.HomePageObjects;

public class Homepagetest {
	//hi
			HomePageObjects hp;
			DressesPageObjects dp;
			BasePage bp;
			
			public Homepagetest() {
				hp = new HomePageObjects();
				bp = new BasePage();
				dp=new DressesPageObjects();
			}
			
			@BeforeClass
			   public void beforeClass() {
			      System.out.println(bp.getTitlte());
			   }
			
			@Test
			public void verifyAllTabs()
			{
				
				Assert.assertTrue(bp.elementFound(hp.getWomen()));
				hp.getWomen().click();
				Assert.assertTrue(bp.elementFound(hp.getWomen1()));
				
				Assert.assertTrue(bp.elementFound(hp.getDress()));
				hp.getDress().click();
				Assert.assertTrue(bp.elementFound(dp.getDress1()));
								
				Assert.assertTrue(bp.elementFound(hp.getTshirt()));
				hp.getTshirt().click();
				Assert.assertTrue(bp.elementFound(hp.getTshirt1()));
			}
			
			
		

	}


