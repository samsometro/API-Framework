import org.json.simple.JSONObject;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import request.User;
import request.UserRequest;
import response.UserResponse;

import java.util.HashMap;

public class TestApi extends BaseApi {

    @BeforeClass
    public static void createUser() {

//        User u = User.builder().name("Vova").build();

//        new User("And", 12);

//        HashMap<String, Object> hashMap = new HashMap<>();
//        hashMap.put("name", 12);
//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("name", "Andii");
//        jsonObject.put("age", 12);

//        UserRequest.createUser();
    }

    @AfterClass
    public static void deleteUser() {
        UserRequest.deleteUser(6);
    }

    @Test
    public void firstTest() {
        UserResponse users = UserRequest.getUserById(6);

        assert users.getName().equals("Andii");
        assert users.getAge() == 12;
    }

}
