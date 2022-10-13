package services;

import dto.UserOrder;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class UserOrderApi {
    private static final String BASE_URI = "https://petstore.swagger.io/v2/";
    private RequestSpecification spec;
    private static final String USER = "/store/order";
    public UserOrderApi(){
        spec=given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .log().all();
    }

    public ValidatableResponse createOrder(UserOrder user){

        return   given(spec)
                .body(user)
                .when()
                .post(USER)
                .then()
                .log().all();


    }

}

