package com.aktie.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PixDTO {

    private String id;

    private BigDecimal amount; // Valor

    private String email;

    private String description;

    private String emv; // código qr_code do pix

    private String base64; // código qr_code em base64 (img) do pix

    private LocalDateTime expiration; // Tempo de expiração do PIX

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmv() {
        return emv;
    }

    public void setEmv(String emv) {
        this.emv = emv;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDateTime expiration) {
        this.expiration = expiration;
    }

}
