package request;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

import java.util.HashMap;

public class BaseRequest {

    public static Response post(String path, HashMap<String, Object> model) {
        return RestAssured.given()
                .body(model)
                .when()
                .contentType(ContentType.JSON)
                .log().all()
                .post(path)
                .then()
                .log().all()
                .statusCode(201)
                .extract().response();
    }

    public static Response put(String path, JSONObject model) {
        return RestAssured.given()
                .body(model.toJSONString())
                .when()
                .contentType(ContentType.JSON)
                .put(path)
                .then()
                .extract().response();
    }

    public static Response get(String path) {
        return RestAssured.given()
                .when()
                .contentType(ContentType.JSON)
                .get(path)
                .then()
                .extract().response();
    }

    public static Response delete(String path) {
        return RestAssured.given()
                .when()
                .contentType(ContentType.JSON)
                .delete(path)
                .then()
                .extract().response();
    }
}
