package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import singleton.Sofer;
import builer.Container;

public class SoferTest {
	
	@Test
	public void test(){
		Sofer s = new Sofer();
		s.nume="Alin";
		assertNotEquals("Radu",s.nume);
	}
	
	@Test
	public void test2(){
		Sofer s = new Sofer();
		s.varsta=33;
		assertNotEquals(31,s.varsta);
	}
	
	@Test
	public void test3(){
		Sofer s = new Sofer();
		s.domiciliu="Iasi";
		assertNotEquals("Cluj",s.domiciliu);
	}
	
	@Test
	public void test4(){
		Sofer s = new Sofer();
		s.experienta="4 ani";
		assertNotEquals("5 ani",s.experienta);
	}
}
