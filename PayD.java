// PayD interface (Target system we want to adapt to)
public interface PayD {
    long getCreditCardNo();          // Credit card number (long)
    String getCardOwnerName();       // Card holder name
    String getCardExpMonthYear();    // Expiry in MM/YY format
    Integer getCVVNo();              // CVV as Integer
    Double getTotalAmount();         // Amount

    void setCreditCardNo(long creditCardNo);
    void setCardOwnerName(String cardOwnerName);
    void setCardExpMonthYear(String cardExpMonthYear);
    void setCVVNo(Integer cVVNo);
    void setTotalAmount(Double totalAmount);
}
