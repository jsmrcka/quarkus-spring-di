package com.baeldung.dependency.exception;

import com.baeldung.dependency.exception.app.PurchaseDeptService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dependencyException")
public class DependencyExceptionResource {

    @Autowired
    PurchaseDeptService purchaseDeptService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getRepositoryType() {
        return purchaseDeptService.getRepositoryType();
    }
}
