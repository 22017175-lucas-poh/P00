import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name:lucas
 * Student ID: {22017175}
 * Class: {W65E}
 * Date/Time created: Wednesday 24-05-2023 11:35
 */

/**
 * @author lucas
 *
 */
class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public final void testAdd() {
//		fail("Not yet implemented");
		int a =1234;
		int b =8765;
		
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected =9999;
		assertEquals(expected,actual);
	
	
	}
	@Test
	public final void testSubstract() {
//		fail("Not yet implemented");

		int a =9876;
		int b =4321;
		
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected =5555;
		assertEquals(expected,actual);
	}
	@Test
	public final void testmultiplication() {
//		fail("Not yet implemented");

		int a =500;
		int b =10;
		
		
		Calculator cal = new Calculator();
		int actual = cal.multiplication(a, b);
		
		int expected =5000;
		assertEquals(expected,actual);
	}
	@Test
	public final void testdivision() {
//		fail("Not yet implemented");

		int a =500000;
		int b =100;
		
		
		Calculator cal = new Calculator();
		int actual = cal.division(a, b);
		
		int expected =5000;
		assertEquals(expected,actual);
	}
	
	


}
