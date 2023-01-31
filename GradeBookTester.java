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
		 a.addScore(1);
		 a.addScore(2);
		 b.addScore(3);
		 b.addScore(4);
	}

	@AfterEach
	void tearDown() throws Exception {
		a=null;
		b=null;
		g1=null;
	}

	@Test
	void testAddScore() {
		
		assertTrue(a.toString().equals("1.0 2.0"));
		assertTrue(b.toString().equals("3.0 4.0"));
		assertTrue(g1.toString().equals("50.0 75.0"));
		
		assertEquals(2,a.getScoreSize(),.0001);
		assertEquals(2,b.getScoreSize(),.0001);
		assertEquals(2,g1.getScoreSize(),.0001);
	}

	@Test
	void testSum() {
		assertEquals(3.0,a.sum(),.0001);
		assertEquals(7.0,b.sum(),.0001);
		assertEquals(125,g1.sum(),.0001);
		
		
	}

	@Test
	void testMinimum() {
		assertEquals(1.0,a.minimum(),.001);
		assertEquals(3.0,b.minimum(),.001);
		assertEquals(50,g1.minimum(),.0001);
		
	}

	@Test
	void testFinalScore() {
		assertEquals(2.0,a.finalScore(),.0001);
		assertEquals(4.0,b.finalScore(),.0001);
		
	}

	

}
