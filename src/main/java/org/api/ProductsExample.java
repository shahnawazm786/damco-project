package org.api;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ProductsExample {
    @Test
    public void getProducts(){
        RestAssured.baseURI="https://fakestoreapi.com/";
        Response resp = given()
                .when()
                .get("/products")
                .then()
                .extract().response();
        String data= resp.asPrettyString();
        JsonPath path=new JsonPath(data);
        //String a=path.get("[0].title");
        //System.out.println(a);
        List<HashMap<String,String>> array=path.get();
        System.out.println(array.size());
        for(Map<String,String> a:array){
            System.out.println(String.valueOf(a.get("id")));
        }
    }
}
