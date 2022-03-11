package com.shikanga.betterbanking.transaction;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

public class TransactionComponentTest {

    @LocalServerPort
    private int port;

    @Test
    void testApplicationEndToEnd() {

        given().standaloneSetup(new TransactionController(new TransactionServiceImpl()))
        .when()
        .get(String.format("http://localhost:%s/api/v1/transactions/1234567", port))
        .then()
        .statusCode(Matchers.is(200));

    }
    
}
