package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static java.awt.SystemColor.text;

class MobileBankPostmanTest {
    @Test
    void ShowTextInTheFieldData() {
        // Given - When - Then
        String text = "Hello";
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body(text) // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo(text))
        ;
    }
}
