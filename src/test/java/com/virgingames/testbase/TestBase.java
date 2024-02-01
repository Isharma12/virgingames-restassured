package com.virgingames.testbase;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;

public class TestBase {

    @BeforeClass
    public void inIt() {

        RestAssured.baseURI = "https://www.virgingames.com";
        RestAssured.basePath = "/api/jackpots/bingo/";

    }
}
