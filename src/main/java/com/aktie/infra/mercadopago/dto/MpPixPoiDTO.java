package com.aktie.infra.mercadopago.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class MpPixPoiDTO {

    @JsonbProperty("transaction_data")
    private MpPixResponseTrxData trxData;

    // public MpPixPoiDTO(MpPixResponseTrxData trxData) {
    // this.trxData = trxData;
    // }

    public MpPixResponseTrxData getTrxData() {
        return trxData;
    }

    public void setTrxData(MpPixResponseTrxData trxData) {
        this.trxData = trxData;
    }

}
