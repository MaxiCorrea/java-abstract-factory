package domain;

public interface BankFactory {

	PaymentProcessor createPaymentProcessor();

	FeeCalculator createFeeCalculator();

	ReportGenerator createReportGenerator();

}
