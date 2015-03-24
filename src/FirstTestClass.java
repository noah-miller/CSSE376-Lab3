import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class FirstTestClass {

	private List<Integer> list(Integer...integers) {
		return Arrays.asList(integers);
	}
	
	@Test
	public void test1Empty() {
		assertEquals(list(), PrimeFactor.getPrimeFactors(1));
	}

}
