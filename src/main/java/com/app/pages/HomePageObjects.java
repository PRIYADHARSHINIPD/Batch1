package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	private WebElement dress;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	private WebElement tshirt;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/a[1]/img")
	private WebElement women1;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	private WebElement tshirt1;
	
	
	
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getWomen() {
		return women;
	}
	
	public WebElement getTshirt() {
		return tshirt;
	}
	public WebElement getWomen1() {
		return women1;
	}
	
	public WebElement getTshirt1() {
		return tshirt1;
	}
	public WebElement getDress() {
		return dress;
	}
	
	

	
		
}


