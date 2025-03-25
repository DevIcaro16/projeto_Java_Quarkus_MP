package com.aktie.infra.mercadopago.repository;

import java.util.UUID;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.repositories.IPixRepository;
import com.aktie.infra.mercadopago.dto.MpPixDTO;
import com.aktie.infra.mercadopago.dto.MpPixPayerDTO;
import com.aktie.infra.mercadopago.dto.MpPixResponse;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MpPixRepository implements IPixRepository {

    @Inject
    @RestClient
    RestClientMp restClient;

    @Override
    public PixDTO create(PixDTO dto) {
        // return new PixDTO();
        // throw new UnsupportedOperationException("Método Create não Implementado");

        String token = "Bearer TEST-XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        String idempotencykey = UUID.randomUUID().toString();

        MpPixPayerDTO payerDTO = new MpPixPayerDTO();
        MpPixDTO pixDTO = new MpPixDTO();

        pixDTO.setDescription(dto.getDescription());
        payerDTO.setEmail(dto.getEmail());
        // pixDTO.setPaymentMethodId("pix");
        pixDTO.setPaymentMethodId("pix");
        pixDTO.setAmount(dto.getAmount());
        pixDTO.setPayer(payerDTO);

        MpPixResponse response = restClient.createPix(
                token,
                idempotencykey,
                pixDTO);

        dto.setEmv(response.getPoi().getTrxData().getEmv());
        dto.setBase64(response.getPoi().getTrxData().getBase64());

        return dto;

    }

}
