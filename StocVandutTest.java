package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import command.StocCumparat;
import command.StocVandut;

public class StocVandutTest {

	@Test
	public void test(){
		StocVandut sv = new StocVandut(100000);
		sv.incasari=50000;
		assertNotEquals(60000,sv.incasari);
	}

}
