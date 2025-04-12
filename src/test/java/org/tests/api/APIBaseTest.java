package org.tests.api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.util.prop.PropertiesFile;

public class APIBaseTest {
    final String bearer="7309cfc5fb8dd08a46371028858a6e6643bbd343cd1391e4a14cbb6625dfaa5a";
    @BeforeClass
    public void setAPI() throws Exception {
        RestAssured.baseURI= PropertiesFile.get("apiURL");

    }
}
