package services;

import dto.OrderId;
import dto.UserOrder;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class OrderIdApi {
    private static final String BASE_URI = "https://petstore.swagger.io/v2/";
    private RequestSpecification spec;
    private static final String USER = "/store/order";
    public OrderIdApi(){
        spec=given()
                .baseUri(BASE_URI)
                .contentType(ContentType.JSON)
                .log().all();
    }

    public ValidatableResponse findIdOrder(OrderId id){

        return   given(spec)
                .queryParam("orderId", 1)
                .when()
                .get(USER)
                .then()
                .log().all();


    }

}
