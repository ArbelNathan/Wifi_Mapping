package tests.java;

import static org.junit.Assert.fail;

import org.junit.Test;

import main.java.dataBase.Networks;
import main.java.filter.Filter_By_Time;

public class Filter_By_TimeTest {

	@Test
	public void testFilter() {
		Networks test=new Networks();
		test.addFromInput("test/testcomplete.csv");
		Filter_By_Time filt =new Filter_By_Time("10/27/2017 16:13", "10/27/2017 16:14");
		filt.filter(test);
		if(test.size()!=0)fail("bad filter");
	}

}
