package TestPack;

import java.util.ArrayList;

import org.testng.annotations.Test;


import com.pageObject.ImdbPage;

import Utilitymethod.utilitymethod;


public class ImdbTest extends BaseClass
{
@Test
public void Imdb() throws InterruptedException
{
	test = extent.createTest("extract the data on IMDB");
	ImdbPage id=new ImdbPage(driver);
	test.info("open the url");
	driver.get(Idbmurl);
	test.info("serach movie");
	id.searchmovie().sendKeys("pushpa the rise");
	id.searchButton().click();
	
	utilitymethod.waitload(3);
	
	test.info("select the movie");
	
	id.selectmovie().click();;
	
	test.info("extract the date");
    idbmdate = id.extractdate().getText();
	
	
	test.info("extract the country");
	idbcountry = id.extractcounrty().getText();
	utilitymethod.waitload(3);
	extent.flush();

}
}
