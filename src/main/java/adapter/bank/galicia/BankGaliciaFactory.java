package adapter.bank.galicia;

import domain.BankFactory;
import domain.FeeCalculator;
import domain.PaymentProcessor;
import domain.ReportGenerator;

public class BankGaliciaFactory implements BankFactory {

	@Override
	public PaymentProcessor createPaymentProcessor() {
		return new RestPaymentProcessor();
	}

	@Override
	public FeeCalculator createFeeCalculator() {
		return new VariableFeeCalculator();
	}

	@Override
	public ReportGenerator createReportGenerator() {
		return new JsonReportGenerator();
	}

}
