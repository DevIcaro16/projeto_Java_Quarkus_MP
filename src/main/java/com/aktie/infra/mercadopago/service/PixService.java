package com.aktie.infra.mercadopago.service;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.usecases.CreatePix;
import com.aktie.infra.mercadopago.repository.MpPixRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PixService {

    @Inject
    MpPixRepository mpPixRepository;

    public PixDTO gerarPix(PixDTO dto) {

        CreatePix createPix = new CreatePix(mpPixRepository);

        dto = createPix.execute(dto);

        return dto;
    }

}
