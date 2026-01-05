package adapter.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import adapter.bank.galicia.BankGaliciaFactory;
import adapter.bank.nacion.BankNacionFactory;
import domain.BankFactory;
import domain.BankFactoryType;

class DefaultBankAbstractFactoryTest {

	private DefaultBankAbstractFactory factories;
	
	@BeforeEach
	void setup() {
		factories = new DefaultBankAbstractFactory();
	}
	
	@Test
	void shouldReturnNacionFactory() {
		BankFactory factory = factories.getFactory(BankFactoryType.NACION);
		assertTrue(factory instanceof BankNacionFactory);
	}
	
	@Test
	void shouldReturnGaliciaFactory() {
		BankFactory factory = factories.getFactory(BankFactoryType.GALICIA);
		assertTrue(factory instanceof BankGaliciaFactory);
	}

	@Test
	void shouldThrowExceptionForUnknownBank() {
		assertThrows(IllegalArgumentException.class, () -> {
			factories.getFactory(BankFactoryType.NONE);
		});
	}
}




