package mavenJunit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Calculator Test Suite")
class MainTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}
	
	@Nested
	@DisplayName("Nested Calculator Test")
	class NestedTest {
		@Test
		@DisplayName("Nested Addition Test")
		void givenTwoNumberProvideSum() {
			Main main = new Main();
			int actual = main.add(100, 500);
			assertEquals(600 , actual);
		}
	}
	@Test
	@DisplayName("Addition Tests")
	void givenTwoNumberProvideSum() {
		Main main = new Main();
		int actual = main.add(2, 5);
		assertEquals(7 , actual);
	}
	
	@Test
	@DisplayName("Test Objects")
	void providedTwoObjectsCompare() {
		List<Integer> exectedList = new ArrayList<>();
		exectedList.add(10);
		
		
		List<Integer> actualList = new ArrayList<>();
		actualList.add(10);
		actualList.add(35);
		
		Assert.assertEquals(exectedList, actualList);
	}

}