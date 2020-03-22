package TestCases;


import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Vehicle7Test {
	@Test
	public void test_Vehicle_7() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/7/").
		then().
			assertThat().
			body("name", equalTo("X-34 landspeeder")).
			body("model", equalTo("X-34 landspeeder")).
			body("manufacturer", equalTo("SoroSuub Corporation")).
			body("cost_in_credits", equalTo("10550")).
			body("length", equalTo("3.4")).
			body("max_atmosphering_speed", equalTo("250")).
			body("crew", equalTo("1")).
			body("passengers", equalTo("1")).
			body("cargo_capacity", equalTo("5")).
			body("consumables", equalTo("unknown")).
			body("vehicle_class", equalTo("repulsorcraft"));
	}
}