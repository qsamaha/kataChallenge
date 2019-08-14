import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KataConverterTest {
	KataConverter kataConvert;

	@BeforeEach
	void setUp() throws Exception {
		kataConvert = new KataConverter();
	}

	
	@Test
	void test() {
		
		String expected = "zero";
		String actual = kataConvert.convert(0);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test1() {
		
		String expected = "one";
		String actual = kataConvert.convert(1);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test2() {
		
		String expected = "two";
		String actual = kataConvert.convert(2);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test3() {
		
		String expected = "three";
		String actual = kataConvert.convert(3);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test4() {
		
		String expected = "four";
		String actual = kataConvert.convert(4);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test5() {
		
		String expected = "five";
		String actual = kataConvert.convert(5);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test6() {
		
		String expected = "six";
		String actual = kataConvert.convert(6);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test7() {
		
		String expected = "seven";
		String actual = kataConvert.convert(7);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test8() {
		
		String expected = "eight";
		String actual = kataConvert.convert(8);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test9() {
		
		String expected = "nine";
		String actual = kataConvert.convert(9);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test10() {
		
		String expected = "ten";
		String actual = kataConvert.convert(10);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test20() {
		
		String expected = "twenty";
		String actual = kataConvert.convert(20);
		
		assertEquals(expected,actual);
		
	}
	@Test
	void test22() {
		
		String expected = "twenty two";
		String actual = kataConvert.convert(22);
		
		assertEquals(expected,actual);
		
	}
}


