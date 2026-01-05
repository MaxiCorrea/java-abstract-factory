package domain;

public interface PaymentProcessor {
	PaymentResult process(PaymentRequest request);
}
