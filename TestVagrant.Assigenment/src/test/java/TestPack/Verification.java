package TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verification extends BaseClass
{
	@Test
	public void compreData() 
	{
		
		test=extent.createTest("verify the data on both sites");
		if (wikicountry.equals(idbcountry)&& idbmdate.contains(wikidate)) {
			System.out.println("pass");
		
		}
		else{
		test.info("data on both site not matches");
		
		Assert.fail();
		}
		extent.flush();
		
	
	}
}
