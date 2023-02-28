package selenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing3 {

	@Test
	public void test() {
			String expected = "abc";
			String actual = "abc";
			Assert.assertTrue("Verifying 2>3", 2>3);
			Assert.assertEquals(expected, actual);
		
	}

}
