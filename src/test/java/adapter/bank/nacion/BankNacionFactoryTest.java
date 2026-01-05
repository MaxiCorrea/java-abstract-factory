package adapter.bank.nacion;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import domain.BankFactory;

class BankNacionFactoryTest {

	@Test
	void shouldCreateConsistentFamily() {
		BankFactory factory = new BankNacionFactory();
		assertTrue(factory.createFeeCalculator() instanceof FixedFeeCalculator);
		assertTrue(factory.createPaymentProcessor() instanceof SoapPaymentProcessor);
		assertTrue(factory.createReportGenerator() instanceof XmlReportGenerator);
	}

}
