import static org.junit.Assert.*;

import org.junit.Test;

import com.techchefs.assessment.MathCalculation;

public class MathCalculationTest {
	private MathCalculation m = new MathCalculation();

	@Test
	public void testCalculateSimpleInterest() {
		assertEquals(1350, m.calculateSimpleInterest(9000, 7.5, 2),0.01);
	}

	@Test
	public void testCalculateFact() {
		assertEquals(6, m.calculateFact(3));
	}

	@Test
	public void testCalculatePer() {
		assertEquals(30.0, m.calculatePer(30, 30, 30),0.01);
	}
}
