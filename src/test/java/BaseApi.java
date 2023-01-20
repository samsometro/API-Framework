import io.restassured.RestAssured;
import io.restassured.authentication.BasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public abstract class BaseApi {

    @Before
    public void srtUp() {
        RestAssured.requestSpecification = requestSpec();
    }

    protected static RequestSpecification requestSpec() {

        return new RequestSpecBuilder()
                .setBaseUri("http://192.168.68.185:3000/api/")
                .setAuth(setBasicAuthScheme())
                .build();

    }


    private static BasicAuthScheme setBasicAuthScheme() {

        final BasicAuthScheme authScheme = new BasicAuthScheme();

        authScheme.setUserName("admin");

        authScheme.setPassword("password");

        return authScheme;

    }
}
