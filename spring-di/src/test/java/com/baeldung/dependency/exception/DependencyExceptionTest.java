package com.baeldung.dependency.exception;

import com.baeldung.dependency.exception.repository.DressRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class DependencyExceptionTest {

    @Test
    public void testConstructorDi() {
        given()
            .when().get("/dependencyException")
            .then()
                .statusCode(200)
                .body(is(DressRepository.class.getName()));
    }

}
