import com.example.variant1.Variant1Application;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;


import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = Variant1Application.class)
class ControllerTest {
@LocalServerPort
private int port;
@BeforeEach
public void setup(){
    RestAssured.port=port;
}
    @Test
    void getFactorials() {
    given()
            .when()
            .get("/api/factorials/5")
            .then()
            .statusCode(200)
            .body("$",hasSize(5))
            .body("[0]",equalTo(1))
            .body("[4]",equalTo(120));
    }
}