package TestCases;

import org.junit.Test;
import static io.restassured.RestAssured.*;

public class StatusCodeTest {

	@Test
	public void test_status_code() 
	{
		given().
		when().
			get("https://www.swapi.co/api/vehicles/").
		then().
			assertThat().statusCode(200);
	}

}