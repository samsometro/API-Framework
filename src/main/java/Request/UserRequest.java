package request;

import org.json.simple.JSONObject;
import response.UserResponse;

public class UserRequest extends Request.BaseRequest {
    private final static String PATH = "users";

    public UserResponse createUser(JSONObject jsonObject) {
        return post(PATH, jsonObject).as(UserResponse.class);
    }

    public UserResponse updateUser(JSONObject jsonObject) {
        return put(PATH, jsonObject).as(UserResponse.class);
    }

    public UserResponse getUserById(int id){
        return get(PATH + "/" + id).as(UserResponse.class);
    }
    public UserResponse[] getUsers(){
        return get(PATH).as(UserResponse[].class);
    }

    public UserResponse deleteUser(int id) {
        return delete(PATH + "/" + id).as(UserResponse.class);
    }
}
