package lab1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook g1;
	GradeBook a;
	GradeBook b;
	@BeforeEach
	void setUp() throws Exception {
		 a = new GradeBook(5);
		 b = new GradeBook(5);
		 g1 = new GradeBook(5);
		 g1.addScore(50);
		 g1.addScore(75);
		 
	}

	@AfterEach
	void tearDown() throws Exception {
		a=null;
		b=null;
		g1=null;
	}

	@Test
	void testAddScore() {
		a.addScore(1);
		a.addScore(2);
		b.addScore(3);
		b.addScore(4);
		assertTrue(a.toString().equals("1 2"));
		assertTrue(b.toString().equals("3 4"));
		assertEquals(a.getScoreSize(),2);
		assertEquals(b.getScoreSize(),2);
	}

	@Test
	void testSum() {
		assertEquals(3,a.sum(),.01);
		assertEquals(7,b.sum(),.01);
		assertEquals(125,g1.sum(),.0001);
		
		
	}

	@Test
	void testMinimum() {
		assertEquals(1,a.minimum(),.01);
		assertEquals(3,b.minimum(),.01);
		assertEquals(50,g1.minimum(),.0001);
		
	}

	@Test
	void addScoreTest() {
		assertTrue(g1.toString().equals("50.0 75.0"));
		
	}

	@Test
	void testFinalScore() {
		assertEquals(2,a.finalScore(),.02);
		assertEquals(4,b.finalScore(),.04);
		
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
