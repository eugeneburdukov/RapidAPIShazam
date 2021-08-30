package tests;

import io.restassured.response.Response;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static logic.common.AuthData.BASIC_USER;
import static logic.common.EndPoints.GET_SHAZAM;
import static logic.constants.HeadersLabels.*;
import static logic.constants.ShazamParams.*;

public class ShazamGetTest {

    @BeforeClass
    public void install(){

    }

    @AfterClass
    public void clean(){

    }

    @Test
    public void test01Get(){

        // С набором валидных данных
        Map<String, String> headers = new HashMap<>();
        headers.put(RAPIDAPI_HOST.getLabel(), BASIC_USER.getHost());
        headers.put(RAPIDAPI_KEY.getLabel(), BASIC_USER.getKey());


        Map<String, String> queryParams = new HashMap<>();
        queryParams.put(TERM.getParam(), TERM.getParamValue());
        queryParams.put(LOCALE.getParam(), LOCALE.getParamValue());
        queryParams.put(OFFSET.getParam(), OFFSET.getParamValue());
        queryParams.put(LIMIT.getParam(), LIMIT.getParamValue());

        Response response = given()
                .headers(headers)
                .queryParams(queryParams)
                .log().all()
                .when()
                .get(GET_SHAZAM.getURI())
                .then()
                .log().all()
                .extract().response();

    }
}
