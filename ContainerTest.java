package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import builer.Container;

public class ContainerTest {
	Container c;

	@Before
	public void setUp() throws Exception {
		c = new Container();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Container din After");
	}
	
	@Test
	public void test(){
		Container container = new Container();
		container.greutate=2.6;
		assertNotEquals(2,container.greutate);
	}
	
	@Test
	public void test2(){
		Container container = new Container();
		container.culoare="gri";
		assertNotEquals("albastru",container.culoare);
	}
	
	@Test
	public void test3(){
		Container container = new Container();
		container.inaltime=50;
		assertNotEquals(49,container.inaltime);
	}

	
	
}
