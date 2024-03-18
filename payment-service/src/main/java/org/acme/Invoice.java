package org.acme;


public class Invoice {
    private String cardNumber;
    private String value;
    private boolean paid;
    
    
    public Invoice(){}
    

    public Invoice(String cardNumber, String value, boolean paid) {
        this.cardNumber = cardNumber;
        this.value = value;
        this.paid = paid;
    }


    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public boolean isPaid() {
        return paid;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    
}
