import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestInsti {
	YearUtilities year=new YearUtilities();
	
	public TestInsti() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	System.out.println("Inicio pruebas");
	System.out.println("-----------------------------------------------------");
	}
	
	@AfterClass
	public static void tearDownClass() {
	System.out.println("------------------------------------------------");
	System.out.println("Fin pruebas");
	}
	
	@Before
	public void setUp()
	{
	System.out.println("Comienza el test");
	}
	@After
	public void tearDown()
	{
	System.out.println("Termina el test");
	}

	@Test
	public void test() {
		assertEquals(3,year.isLeap(1005));	
	}
	@Test
	public void test2() {
		assertEquals(3,year.isLeap(-2000));	
	}
	@Test
	public void test3() {
		assertEquals(-2,year.isLeap(0));	
	}
	@Test
	public void test4() {
		assertEquals(3,year.isLeap(4000));	
	}


}

	


