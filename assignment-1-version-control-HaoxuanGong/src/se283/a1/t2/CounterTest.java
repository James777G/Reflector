/**
 * 
 */
package se283.a1.t2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import se283.a1.t1.Counter;

/**
 * Test class for Counter class
 * 
 * @author [YourName]
 * @version [Current Date]
 *
 */
class CounterTest {

	/**
	 * Test method for {@link se283.a1.t1.Counter#increment()}. The output should be
	 * 4 as suggested by incrementing 4 times
	 */
	@Test
	void testIncrement() {
		Counter counter = new Counter();
		for (int i = 0; i < 4; i++) {
			counter.increment();
		}
		assertEquals(4, counter._ctr);
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#decrement()}. The output should be
	 * -4 as suggested by decrementing 4 times
	 */
	@Test
	void testDecrement() {
		Counter counter = new Counter();
		for (int i = 0; i < 4; i++) {
			counter.decrement();
		}
		assertEquals(-4, counter._ctr);
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#reset()}. The output should be
	 * zero as suggested by reset method.
	 */
	@Test
	void testReset() {
		Counter counter = new Counter();
		counter.reset();
		assertEquals(0, counter._ctr);
	}

	/**
	 * Test method for {@link se283.a1.t1.Counter#multiplyBy(int)}. The output
	 * should be 5 as suggested by having a multiplier of 5 and times 1 by 5.
	 */
	@Test
	void testMultiplyBy() {
		Counter counter = new Counter();
		counter._ctr = 1;
		counter.multiplyBy(5);
		assertEquals(5, counter._ctr);
		assertEquals(5, counter._multiplier);

	}

}
