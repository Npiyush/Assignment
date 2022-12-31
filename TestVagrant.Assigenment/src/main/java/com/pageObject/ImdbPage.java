package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImdbPage 
{
public WebDriver driver;
	
	public ImdbPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="//input[@id='suggestion-search']")
	WebElement serch;
	@FindBy (xpath="//button[@id='suggestion-search-button']")
	WebElement serchbutton;
	
	@FindBy (xpath="/html/body/div[2]/main/div[2]/div[3]/section/div/div[1]/section[2]/div[2]/ul/li[1]/div[2]")
	WebElement selmovie;
	
	@FindBy (xpath="//li[@class='ipc-inline-list__item']/a[text()='December 17, 2021 (United States)']")
	WebElement reldate;
	
	@FindBy (xpath="//li[@class='ipc-inline-list__item']/a[text()='India']")
	WebElement country;
	
	public WebElement  searchmovie() {
		return serch;
	}
	public WebElement  selectmovie() {
		return selmovie;
	}
	public WebElement  extractdate() {
		return reldate;
	}
	public WebElement  extractcounrty() {
		return country;
	}
	public WebElement  searchButton() {
		return serchbutton;
	}

}
