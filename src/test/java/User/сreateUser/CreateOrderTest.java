package User.сreateUser;

import dto.UserOrder;
import org.junit.jupiter.api.Test;
import services.UserOrderApi;

import static org.hamcrest.Matchers.equalTo;

public class CreateOrderTest {

    @Test
    public void checkCreateStore(){
        UserOrderApi userApi = new UserOrderApi();
        UserOrder user = UserOrder.builder()
                .id(1)
                .petId(2)
                .quantity(3)
                .shipDate("2022-10-13T16:02:12")
                .status("placed")
                .complete(true)
                .build();

        userApi.createOrder(user)
                .statusCode(200)
                .body("id",equalTo(1))
                .body("petId",equalTo(2))
                .body("quantity",equalTo(3))
                .body("status", equalTo("placed"))
                .body("complete",equalTo(true))
                .body("shipDate", equalTo("2022-10-13T16:02:12.000+0000"));


    }
}