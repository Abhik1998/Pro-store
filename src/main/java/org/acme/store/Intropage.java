package org.acme.store;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class Intropage {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "About store";
    }
}