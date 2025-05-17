package org.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;

public class GetExample {

    @BeforeTest
    public void set(){

    }
    @BeforeMethod
    public void setup(){
        System.out.println("Method");
    }
    @Test
    public void getPostById(){
        RestAssured.baseURI="https://jsonplaceholder.typicode.com";
        ExtractableResponse<Response> resp = given()
                .get("/posts/1")
                .then()
                .statusCode(200).log().all().extract();
//                .contentType(ContentType.JSON)
//                .body("userId",equalTo(1))
//                .body("Id",equalTo(1))
//                .body("title",notNullValue());
        String response=resp.asPrettyString();
        System.out.println(response);
        JsonPath path=new JsonPath(response);
        System.out.println(path.getString("title"));
        System.out.println(path.getString("id"));
        System.out.println(path.getString("userId"));
        System.out.println(path.getString("body"));
    }
}
