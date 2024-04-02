package q1;

//R/BCA-22-243

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testPerson {
	static Person ob;
	String expected,results;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		ob = new Person("Ray",21);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		results=ob.getData();
		expected="Name: Ray, Age: 21";
		assertEquals(results,expected);
	}

}
