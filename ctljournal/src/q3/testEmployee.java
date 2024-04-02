package q3;

//R/BCA-22-243

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import q2.Dog;

class testEmployee {

	static Employee ob;
	double expected,results;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ob=new Employee("Sam","Manager",50000);
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
		results=ob.calculateSalary();
		expected=5000;
		assertEquals(results,expected);
		
	}

}
