package com.baeldung.constructordi;

import com.baeldung.constructordi.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/constructorDi")
public class ConstructorDiResource {

    @Autowired
    Car car;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getCar() {
        return car.toString();
    }

}
