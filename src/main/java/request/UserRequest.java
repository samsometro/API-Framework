package request;

import org.json.simple.JSONObject;
import response.UserResponse;

import java.util.HashMap;
import java.util.Objects;

public class UserRequest extends request.BaseRequest {

    private final static String PATH = "users";

    public static void createUser(HashMap<String, Object> jsonObject) {
        post(PATH, jsonObject);
    }

    public static UserResponse updateUser(JSONObject jsonObject) {
        return put(PATH, jsonObject).as(UserResponse.class);
    }

    public static UserResponse getUserById(int id) {
        return get(PATH + "/" + id).as(UserResponse.class);
    }

    public static UserResponse[] getUsers() {
        return get(PATH).as(UserResponse[].class);
    }

    public static UserResponse deleteUser(int id) {
        return delete(PATH + "/" + id).as(UserResponse.class);
    }
}
