import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testaddTest() {
		myJunitClass junit = new myJunitClass();
		int result = junit.add(100,200);
		assertEquals(300, result);
	}
	

	@Test
	public void testZonaMaffetoneMin() {
		myJunitClass junit = new myJunitClass();
		int resultMin = junit.calcularMaffetoneMin(60);
		assertEquals(110, resultMin);
	}

	@Test
	public void testZonaMaffetoneMax() {
		myJunitClass junit = new myJunitClass();
		int resultMax = junit.calcularMaffetoneMax(60);
		assertEquals(120, resultMax);
	}
	
	@Test
	public void testZonaMaffetoneMinCasoA() {
		myJunitClass junit = new myJunitClass();
		int resultMin = junit.calcularMaffetoneMinCasoA(60);
		assertEquals(100, resultMin);
	}

	@Test
	public void testZonaMaffetoneMaxCasoA() {
		myJunitClass junit = new myJunitClass();
		int resultMax = junit.calcularMaffetoneMaxCasoA(60);
		assertEquals(110, resultMax);
	}
	
	@Test
	public void testZonaMaffetoneMinCasoB() {
		myJunitClass junit = new myJunitClass();
		int resultMin = junit.calcularMaffetoneMinCasoB(60);
		assertEquals(105, resultMin);
	}

	@Test
	public void testZonaMaffetoneMaxCasoB() {
		myJunitClass junit = new myJunitClass();
		int resultMax = junit.calcularMaffetoneMaxCasoB(60);
		assertEquals(115, resultMax);
	}
	
	@Test
	public void testFrielZona1() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielZona1(200);
		assertEquals(170, result, 0);
	}
	
	@Test
	public void testFrielZona2() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielZona2(200);
		assertEquals(178, result, 0);
	}
	
	@Test
	public void testFrielZona3() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielZona3(200);
		assertEquals(188, result, 0);
	}
	
	@Test
	public void testFrielZona4() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielZona4(200);
		assertEquals(198, result, 0);
	}
	
	@Test
	public void testFrielZona5a() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielZona5a(200);
		assertEquals(204, result, 0);
	}
	
	@Test
	public void testFrielZona5b() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielZona5b(200);
		assertEquals(212, result, 0);
	}
	
	@Test
	public void testFrielZona5c() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielZona5c(200);
		assertEquals(212, result, 0);
	}
	
	//bike
	@Test
	public void testFrielBikeZona1() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielBikeZona1(200);
		assertEquals(162, result, 0);
	}
	
	@Test
	public void testFrielBikeZona2() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielBikeZona2(200);
		assertEquals(178, result, 0);
	}
	
	@Test
	public void testFrielBikeZona3() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielBikeZona3(200);
		assertEquals(186, result, 0);
	}
	
	@Test
	public void testFrielBikeZona4() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielBikeZona4(200);
		assertEquals(198, result, 0);
	}
	
	@Test
	public void testFrielBikeZona5a() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielBikeZona5a(200);
		assertEquals(204, result, 0);
	}
	
	@Test
	public void testFrielBikeZona5b() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielBikeZona5b(200);
		assertEquals(212, result, 0);
	}
	
	@Test
	public void testFrielBikeZona5c() {
		myJunitClass junit = new myJunitClass();
		double result = junit.calcularFrielBikeZona5c(200);
		assertEquals(212, result, 0);
	}
}
