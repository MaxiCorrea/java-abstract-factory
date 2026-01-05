package adapter.bank;

import java.util.EnumMap;
import java.util.function.Supplier;

import adapter.bank.galicia.BankGaliciaFactory;
import adapter.bank.nacion.BankNacionFactory;
import domain.BankFactory;
import domain.BankFactoryType;

public class DefaultBankAbstractFactory {

	private final EnumMap<BankFactoryType, Supplier<BankFactory>> factories;
	
	public DefaultBankAbstractFactory() {
		factories = new EnumMap<>(BankFactoryType.class);
		factories.put(BankFactoryType.GALICIA, BankGaliciaFactory::new);
		factories.put(BankFactoryType.NACION, BankNacionFactory::new);
	}
	
	public BankFactory getFactory(
			final BankFactoryType type) {
		Supplier<BankFactory> supplier = factories.get(type);
		if(supplier == null)
			throw new IllegalArgumentException();
		return supplier.get();
	}

}
