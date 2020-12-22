package com.baeldung.dependencyinjectiontypes;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class DependencyInjectionTypesTest {

    private static final String SAMPLE_TEXT = "This is a text !";

    TextFormatter textFormatter = new TextFormatter();

    @Test
    public void testConstructorDI() {
        given()
            .contentType(ContentType.TEXT)
            .body(SAMPLE_TEXT)
            .when().post("/dependencyInjectionTypes/constructor")
            .then()
                .statusCode(HttpStatus.SC_OK)
                .and().body(is(textFormatter.format(SAMPLE_TEXT)));
    }

    @Test
    public void testSetterDI() {
        given()
            .contentType(ContentType.TEXT)
            .body(SAMPLE_TEXT)
            .when().post("/dependencyInjectionTypes/setter")
            .then()
                .statusCode(HttpStatus.SC_OK)
                .and().body(is(textFormatter.format(SAMPLE_TEXT)));
    }
}
