package org.tests.api;

import com.google.gson.JsonObject;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AddUser extends APIBaseTest{
    final String Add_User_End_Point="/users";
    Map<String,String> map;
    @Test
    public void addUser(){
        map= new HashMap<>();
        map.put("name","Test user");
        map.put("email","testuser15@example.com");
        map.put("gender","male");
        map.put("status","active");
        Response resp=given()
            .contentType(ContentType.JSON)
            .auth().oauth2(bearer)
            .body(map).when()
            .post(Add_User_End_Point)
            .then()
            .extract().response();
            resp.then().assertThat().statusCode(201);
            resp.then().assertThat().body("name",equalTo("Test user"));
            resp.then().assertThat().body("email",equalTo("testuser15@example.com"));
            resp.then().assertThat().body("gender",equalTo("male"));
            resp.then().assertThat().body("status",equalTo("active"));

    }
}
