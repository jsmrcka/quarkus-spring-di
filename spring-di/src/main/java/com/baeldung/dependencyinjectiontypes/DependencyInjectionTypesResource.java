package com.baeldung.dependencyinjectiontypes;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dependencyInjectionTypes")
public class DependencyInjectionTypesResource {

    @Autowired
    ArticleWithConstructorInjection articleWithConstructorInjection;

    @Autowired
    ArticleWithSetterInjection articleWithSetterInjection;

    @POST
    @Path("/constructor")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String formatArticleWithConstructorInjection(String inputText) {
        return articleWithConstructorInjection.format(inputText);
    }

    @POST
    @Path("/setter")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String formatArticleWithSetterInjection(String inputText) {
        return articleWithSetterInjection.format(inputText);
    }
}
