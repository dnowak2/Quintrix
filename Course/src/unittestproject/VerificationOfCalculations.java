package unittestproject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerificationOfCalculations {
	final Calculator calculator = new Calculator();
	
	@Test
	void testCalculate() {
		assertEquals(3.0, calculator.calculate(12, '/', 4));
	}
}