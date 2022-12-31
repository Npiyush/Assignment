package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPage 
{
public WebDriver driver;
	
	public WikiPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//input[@id='searchInput']")
	WebElement serch;
	
	@FindBy (xpath="//input[@id='searchButton']")
	WebElement clickserach;
	
	@FindBy (xpath="(//div[@class='plainlist']/ul/li)[10]")
	WebElement reldate;
	
	@FindBy (xpath="//tr/td[text()='India']")
	WebElement country;
	
	public WebElement  searchmovie() {
		return serch;
	}
	public WebElement  serchclick() {
		return clickserach;
	}
	public WebElement  extractdate() {
		return reldate;
	}
	public WebElement  extractcounrty() {
		return country;
	}

}
