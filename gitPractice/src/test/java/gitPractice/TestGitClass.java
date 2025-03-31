package gitPractice;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class TestGitClass {

	@Test
	void rest() {
		given().when().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
	}

}
