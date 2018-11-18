import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GoldPriceTest extends  BaseTest{


    @Test
    public void CurrencyConversionTest() throws IOException {

        Response response =
                given().log().all().param("?format=json")
                        .when().get(ENDPOINT + "/api/cenyzlota/");


     //   response.then().statusCode(200);
        System.out.println(response.statusCode());
Assert.assertEquals(response.statusCode(), 200);
        //   .then().statusCode(200).assertThat()
        //   .body("code", equalTo("CHF"))
        //   .body("rates.no", equalTo("221/A/NBP/2018"));
   //     ObjectMapper objectMapper = new ObjectMapper();

   //     System.out.println("");
        //convert json string to object
   //     System.out.println(response.getBody().asString());
   //     System.out.println("");
   //     GoldRates goldRates = objectMapper.readValue(response.getBody().asString(), GoldRates.class);

    //    System.out.println(goldRates.getData());
    //    System.out.println(goldRates.getCena());

     //   Assert.assertEquals(goldRates.getData(), currency);
     //   Assert.assertEquals(goldRates.getCena(), currency);



    }


}
