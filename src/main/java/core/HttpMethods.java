package core;

import io.restassured.response.Response;

public class HttpMethods {
    private BaseClient baseClient = new BaseClient();

    public Response get(String path) {
        return baseClient.getClient().get(path);
    }

    public Response post(String path, String requestBody) {
        return baseClient.getClient().body(requestBody).post(path);
    }

    public Response put(String path, String requestBody) {
        return baseClient.getClient().body(requestBody).put(path);
    }

    public Response delete(String path) {
        return baseClient.getClient().delete(path);
    }
}
