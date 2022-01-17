package core;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class BaseClient {
    private String BASE_URL = "http://localhost:8080";
    private RequestSpecification client;

    public BaseClient() {
        this.client = RestAssured
                .given().baseUri(BASE_URL)
                .filter(new RequestLoggingFilter())
                .filter(new ResponseLoggingFilter())
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON).log().body();
    }

   public RequestSpecification getClient() {
      return client;
   }
}
