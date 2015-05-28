package testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import command.Stoc;

import singleton.Sofer;

public class StocTest {
	
	@Test
	public void test(){
		Stoc s = new Stoc();
		s.nume="Fasole";
		assertNotEquals("Grau",s.nume);
	}

	@Test
	public void test2(){
		Stoc s = new Stoc();
		s.cantitate=300;
		assertNotEquals(400,s.cantitate);
	}

	
}
