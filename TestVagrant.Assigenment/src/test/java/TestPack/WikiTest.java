package TestPack;

import org.testng.annotations.Test;

import com.pageObject.WikiPage;

import Utilitymethod.utilitymethod;



public class WikiTest extends BaseClass
{
	@Test
	public void wikiTest01() 
	{
		test = extent.createTest("extract the data on wikipedia");
		WikiPage Wp=new WikiPage(driver);
        test.info("open wikipedia");
		
		driver.get(wikiUrl);
		utilitymethod .waitload(2);
        test.info("serch the pushpa movie");
        Wp.searchmovie().sendKeys("pushpa");
		test.info("click on search button");
		Wp.serchclick().click();
		test.info("extract release date");
		wikidate = Wp.extractdate().getText();
		test.info("extract the country");
		wikicountry = Wp.extractcounrty().getText();
		
		extent.flush();

	}
}
