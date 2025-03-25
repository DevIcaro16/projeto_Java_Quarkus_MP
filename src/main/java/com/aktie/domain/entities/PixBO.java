package com.aktie.domain.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class PixBO { // Classe de Regra de Negócio da Aplicação

    private UUID id;

    private BigDecimal amount; // Valor

    private String email;

    private String description;

    private String emv; // código qr_code do pix

    private String base64; // código qr_code em base64 (img) do pix

    private LocalDateTime expiration; // Tempo de expiração do PIX

    // OBS: Esse tipo de class só possue Getters e um Método Construtor

    public PixBO(
            String id, BigDecimal amount, String email,
            String description, String emv, String base64,
            LocalDateTime expiration) {

        this.id = id != null ? UUID.fromString(id) : UUID.randomUUID();
        this.amount = amount;
        this.email = email;
        this.description = description;
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;

        validate();

    }

    public void validate() {

        // Validação, gera Exceção no caso de alguma invalidez

    }

    public void updateEmvData(String emv, String base64, LocalDateTime expiration) {
        this.emv = emv;
        this.base64 = base64;
        this.expiration = expiration;
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public String getEmv() {
        return emv;
    }

    public String getBase64() {
        return base64;
    }

    public LocalDateTime getExpiration() {
        return expiration;
    }

}
