package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import builer.Container;
import builer.ContainerBuilder;

public class ContainerBuilderTest {
	
	ContainerBuilder containerBuilder;
	
	@Before
	public void setUp() throws Exception {
		containerBuilder = new ContainerBuilder();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("ContainerBuilder din After");
	}

	@Test
	public void test(){
		ContainerBuilder cb = new ContainerBuilder();
		cb.greutate=5;
		assertNotEquals(8,cb.greutate);
	}
	
	@Test
	public void test2(){
		ContainerBuilder cb = new ContainerBuilder();
		cb.culoare="negru";
		assertNotEquals("verde",cb.culoare);
	}
	
	@Test
	public void test3(){
		ContainerBuilder cb = new ContainerBuilder();
		cb.inaltime=100;
		assertNotEquals(150,cb.inaltime);
	}
	
	//testare limita
		public void test4(){
			ContainerBuilder containerBuilder = new ContainerBuilder();
		boolean	c = ContainerBuilder.greutate-8<0;
			
			assertTrue(c);
		}
		
}
