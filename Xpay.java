// Xpay interface (Existing system)
public interface Xpay {
    String getCreditCardNo();      // Credit card number (String)
    String getCustomerName();      // Card holder name
    String getCardExpMonth();      // Expiry month
    String getCardExpYear();       // Expiry year
    Short getCardCVVNo();          // CVV as Short
    Double getAmount();            // Amount to be charged

    void setCreditCardNo(String creditCardNo);
    void setCustomerName(String customerName);
    void setCardExpMonth(String cardExpMonth);
    void setCardExpYear(String cardExpYear);
    void setCardCVVNo(Short cardCVVNo);
    void setAmount(Double amount);
}
