package com.aktie.controllers;

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

    @POST
    @Path("/pix")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

}
