package org.tests.api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetUsers extends APIBaseTest {
    final String UserEndpoint="/users";
    JsonPath path;
    @Test
    public void getUsers(){
        Response res=given()
                .when()
                .get(UserEndpoint)
                .then().extract().response();
        res.then().assertThat().statusCode(200);
        path=res.jsonPath();
        List<String> all_ids=path.getList("id");
        List<String> all_names=path.getList("name");
        List<String> all_emails=path.getList("email");
         System.out.println("All ids\t" + all_ids);
        System.out.println("All names \t" + all_names);
        System.out.println("All emails\t" + all_emails);
        List<Object> active_status = path.getList("findAll{it.status=='active'}");
        active_status.stream().forEach(data->{
            System.out.println(data);
        });
    }
}
