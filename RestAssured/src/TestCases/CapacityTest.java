package TestCases;

import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class CapacityTest {

	@Test
	public void test_capacity_Vehicle_7() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/7/").
		then().
			assertThat().
			body("length", equalTo("3.4")).
			body("crew", equalTo("1")).
			body("passengers", equalTo("1")).
			body("cargo_capacity", equalTo("5"));
	}
	
	@Test
	public void test_stats_vehicle_18() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/18/").
		then().
			assertThat().
			body("length", equalTo("20")).
			body("crew", equalTo("5")).
			body("passengers", equalTo("40")).
			body("cargo_capacity", equalTo("1000"));
	}
	
	@Test
	public void test_stats_vehicle_38() {
		given().
		when().
			get("https://www.swapi.co/api/vehicles/38/").
		then().
			assertThat().
			body("length", equalTo("15")).
			body("crew", equalTo("1")).
			body("passengers", equalTo("2")).
			body("cargo_capacity", equalTo("1600"));
	}

}
