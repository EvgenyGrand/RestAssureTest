package Tests;

import dto.OrderId;
import dto.UserOrder;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.junit.jupiter.api.Test;
import services.OrderIdApi;
import services.UserOrderApi;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToObject;

public class FindOrderTest {

    @Test
    public void checkFindOrder() {
        OrderIdApi OrderApi = new OrderIdApi();
         OrderId id = OrderId.builder()
                .id(1)
                .build();

        OrderApi.findIdOrder(id)
            .statusCode(200)
                .contentType(ContentType.JSON)
                .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema/FindOrder.json"))
                .body("orderId",equalTo(1));



    }
}