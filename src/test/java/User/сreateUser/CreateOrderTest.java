package User.сreateUser;

import dto.UserOrder;
import org.junit.jupiter.api.Test;
import services.UserOrderApi;

public class CreateOrderTest {

    @Test
    public void checkCreateStore(){
        UserOrderApi userApi = new UserOrderApi();
        UserOrder user = UserOrder.builder()
                .id(1)
                .petId(2)
                .quantity(3)
                .shipDate("2022-10-13T16:02:12.698Z")
                .status("placed")
                .complete(true)
                .build();

        userApi.createOrder(user)
                .statusCode(200);







    }
}