package com.virgingames.testsuite;

import com.virgingames.testbase.TestBase;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class VirginGamesGetTest extends TestBase {

    @Test
    public void getTestForGBP() {
        Response response = given()
            .when()
            .get("https://www.virgingames.com/api/jackpots/bingo?currency=EUR");
    response.then().statusCode(200);
    response.prettyPrint();
    assertEquals(response.statusCode(), 200, "Unexpected Code");
}
@Test
    public void getTestForEur(){
            Response response = given()
                    .when()
                    .get("https://www.virgingames.com/api/jackpots/bingo?currency=GBP");
            response.then().statusCode(200);
            response.prettyPrint();
            assertEquals(response.statusCode(), 200, "Unexpected Code");
}

@Test
    public void getTestForSEK(){
        Response response = given()
                .when()
                .get("https://www.virgingames.com/api/jackpots/bingo?currency=SEK");
        response.then().statusCode(200);
        response.prettyPrint();
        assertEquals(response.statusCode(), 200, "Unexpected Code");
}
}