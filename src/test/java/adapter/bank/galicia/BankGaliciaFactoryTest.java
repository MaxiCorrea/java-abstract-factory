package adapter.bank.galicia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import domain.BankFactory;

class BankGaliciaFactoryTest {

	@Test
	void shouldCreateConsistentFamily() {
		BankFactory factory = new BankGaliciaFactory();
		assertTrue(factory.createFeeCalculator() instanceof VariableFeeCalculator);
		assertTrue(factory.createPaymentProcessor() instanceof RestPaymentProcessor);
		assertTrue(factory.createReportGenerator() instanceof JsonReportGenerator);
	}

}
