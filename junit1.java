package HaydenPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junit1 {

	@Test
	void testbasic_case() {
		assertEquals("Test LCA", findlca(4,5), 2);
		fail("Not yet implemented");
	}
	
	void testsamebranch() {
		assertEquals("Test same branch LCA", findlca(2,4), 2);
		fail("Should result in 2");
	}

}
