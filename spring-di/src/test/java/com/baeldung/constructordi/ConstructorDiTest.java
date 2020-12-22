package com.baeldung.constructordi;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ConstructorDiTest {

    @Test
    public void testConstructorDi() {
        given()
            .when().get("/constructorDi")
            .then()
                .statusCode(200)
                .body(is("Engine: v8 5 Transmission: sliding"));
    }

}
