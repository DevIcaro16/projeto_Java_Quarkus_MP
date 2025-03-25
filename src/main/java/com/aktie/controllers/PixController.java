package com.aktie.controllers;

import com.aktie.domain.dto.PixDTO;
import com.aktie.infra.mercadopago.service.PixService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

// @Path("/hello")
@Path("/v1")
public class PixController {

    // @GET
    // @Produces(MediaType.TEXT_PLAIN)
    // public String hello() {
    // return "Hello RESTEasy";
    // }

    @Inject
    PixService service;

    @POST
    @Path("/pix")
    @Produces(MediaType.APPLICATION_JSON)
    public PixDTO create(PixDTO dto) {

        PixDTO pixGerado = service.gerarPix(dto);

        return pixGerado;

    }

}
