package TestCases;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ModelTest {
	@Test
	public void test_model_Vehicle_6() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/6/").
		then().
			assertThat().
			body("model", equalTo("T-16 skyhopper"));
	}

	@Test
	public void test_model_Vehicle_24() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/24/").
		then().
			assertThat().
			body("model", equalTo("Modified Luxury Sail Barge"));
	}

	@Test
	public void test_model_Vehicle_35() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/35/").
		then().
			assertThat().
			body("model", equalTo("Armoured Assault Tank"));
	}
}
