package Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class BaseRequest {

    public Response post(String path, JSONObject model) {
        return RestAssured.given()
                .body(model)
                .when()
                .post(path)
                .then()
                .extract().response();
    }

    public Response put(String path, JSONObject model) {
        return RestAssured.given()
                .body(model)
                .when()
                .put(path)
                .then()
                .extract().response();
    }

    public Response get(String path) {
        return RestAssured.given()
                .when()
                .get(path)
                .then()
                .extract().response();
    }

    public Response delete(String path) {
        return RestAssured.given()
                .when()
                .delete(path)
                .then()
                .extract().response();
    }
}
