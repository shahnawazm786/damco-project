package org.tests.api;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUser extends APIBaseTest{
    final String Delete_End_point="/users/7814497";
    @Test
    public void deleteUser(){
        Response resp=given().contentType(ContentType.JSON)
                .auth().oauth2(bearer)
                .when()
                .delete(Delete_End_point)
                .then().extract().response();
        resp.then().assertThat().statusCode(204);
    }
}
