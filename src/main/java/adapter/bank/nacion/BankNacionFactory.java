package adapter.bank.nacion;

import domain.BankFactory;
import domain.FeeCalculator;
import domain.PaymentProcessor;
import domain.ReportGenerator;

public class BankNacionFactory implements BankFactory {

	@Override
	public PaymentProcessor createPaymentProcessor() {
		return new SoapPaymentProcessor();
	}

	@Override
	public FeeCalculator createFeeCalculator() {
		return new FixedFeeCalculator();
	}

	@Override
	public ReportGenerator createReportGenerator() {
		return new XmlReportGenerator();
	}

}
