package com.aktie.infra.mercadopago.dto;

import java.math.BigDecimal;

import jakarta.json.bind.annotation.JsonbProperty;

public class MpPixDTO {

    private String description;

    private MpPixPayerDTO payer;

    @JsonbProperty("payment_method_id")
    private String paymentMethodId;

    @JsonbProperty("transaction_amount")
    private BigDecimal amount;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MpPixPayerDTO getPayer() {
        return payer;
    }

    public void setPayer(MpPixPayerDTO payer) {
        this.payer = payer;
    }

    public String getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(String paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
