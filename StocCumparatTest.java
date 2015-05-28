package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import command.StocCumparat;

import singleton.Sofer;

public class StocCumparatTest {

	@Test
	public void test(){
		StocCumparat sc = new StocCumparat("Cirese");
		sc.marfa="Grau";
		assertNotEquals("porumb",sc.marfa);
	}

}
