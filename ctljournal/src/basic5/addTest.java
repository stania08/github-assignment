package basic5;

//R/BCA-22-243

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	add ob = new add();
	@Test
	void test() {
		int results=ob.add(5, 7);
		
		assertEquals(12,results);
	}

}
