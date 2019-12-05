package com.app.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
public class DressesPageObjects extends BasePage {
	//hello

	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
	private WebElement dress1;
	@FindBy(xpath="//*[@id=\"layered_id_attribute_group_1\"]")
	private WebElement small;
	@FindBy(xpath="//*[@id=\"layered_id_attribute_group_2\"]")
	private WebElement medium;
	@FindBy(xpath="//*[@id=\"layered_id_attribute_group_3\"]")
	private WebElement large;
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")
	private WebElement txtHeader;
	@FindBys(@FindBy(xpath="//*[@id='center_column']/ul/li"))
	private List<WebElement> lstproducts;
	@FindBy(id="search_query_top")
	private WebElement searchbar;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
	private WebElement Elementfound; 
	@FindBy(xpath="//*[@id=\"searchbox\"]/button")
	private WebElement clk;	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1/span[2]")	
	private WebElement count;
	@FindBys(@FindBy(xpath = "//*[@id=\"center_column\"]/ul"))
	private List<WebElement> images;

	public DressesPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getDress1() {
		return dress1;
	}
	public WebElement getSmall1() {
		return small;
	}
	public WebElement getMedium1() {
		return medium;
	}
	public WebElement getLarge1() {
		return large;
	}
	public int getProductNumberFromHeader() {
	String text=txtHeader.getText();
	String[] arr=text.split(" ");
	String value=arr[2];
	int number=Integer.parseInt(value);
	return number;
	}
			
	public int getProductCount() {
		return lstproducts.size();
	}
	public WebElement getsearchtab() {
			return searchbar;
	}
	public WebElement getImage() {
		return Elementfound;
	}
	public WebElement getclick() {
		return clk;
	}
		public WebElement getCount() {
		return count;
	}
		public List<String> getImages() {
			ArrayList<String> list = new ArrayList<String>();
			for (WebElement element : images) {
				list.add(element.getText());
			}
			return list;
		}
}
















	
			

	
