package com.aktie.domain.usecases;

import com.aktie.domain.dto.PixDTO;
import com.aktie.domain.entities.PixBO;
import com.aktie.domain.repositories.IPixRepository;
import com.aktie.mappers.PixMapper;

public class CreatePix {

    private IPixRepository pixRepo;

    public CreatePix(IPixRepository pixRepo) {
        this.pixRepo = pixRepo;
    }

    public PixDTO execute(PixDTO pixDTO) {

        PixBO bo = PixMapper.toBO(pixDTO);

        PixDTO createdPix = pixRepo.create(pixDTO);

        bo.updateEmvData(createdPix.getEmv(), createdPix.getBase64(), createdPix.getExpiration());

        return createdPix;

    }

}
