/**
 * 
 */
package org.escoladeltreball.helloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw46490689
 *
 */
public class MainTest {

	static Main main;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in setUpBeforeClass");
		main = new Main();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in tearDownAfterClass");
		main = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("in setUp");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown");
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#findSmallest(int[])}.
	 */
	@Test
	public final void testFindSmallest() {
		assertEquals(1, main.findSmallest(new int[] {1,2,3,4,5}));
		assertEquals(1, main.findSmallest(new int[] {4,3,6,1,94,5}));
		assertEquals(-3, main.findSmallest(new int[] {1,-3,3,6}));
		assertEquals(3, main.findSmallest(new int[] {3}));
		assertEquals(1, main.findSmallest(new int[] {1,1,1}));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#sum(int[])}.
	 */
	@Test
	public final void testSum() {
		assertEquals(15, main.sum(new int[] {1,2,3,4,5}));
		assertEquals(28, main.sum(new int[] {4,3,6,1,9,5}));
		assertEquals(7, main.sum(new int[] {1,-3,3,6}));
		assertEquals(3, main.sum(new int[] {3}));
		assertEquals(3, main.sum(new int[] {1,1,1}));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequency(int[], int)}.
	 */
	@Test
	public final void testFrequency() {
		assertEquals(2, main.frequency(new int[] {1,2,3,4,5,5},5));
		assertEquals(0, main.frequency(new int[] {4,3,6,1,9},5));
		assertEquals(1, main.frequency(new int[] {1,-3,3,6},-3));
		assertEquals(1, main.frequency(new int[] {3},3));
		assertEquals(3, main.frequency(new int[] {1,1,1},1));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequencyPercentage(int[], int)}.
	 */
	@Ignore("El tractarem mes tard")
	@Test
	public final void testFrequencyPercentage() {
	}

}
