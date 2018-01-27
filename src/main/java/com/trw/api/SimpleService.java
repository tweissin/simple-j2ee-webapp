package com.trw.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class SimpleService {

    @GET
    @Path("/simple")
    public String getSomething() {
        return "something";
    }
}
