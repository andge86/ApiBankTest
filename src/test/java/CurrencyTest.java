import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CurrencyTest extends BaseTest{



  //  Current average CHF exchange rate
  //  http://api.nbp.pl/api/exchangerates/rates/a/chf/

    @Test(dataProvider = "CurrencyCodes", dataProviderClass = DataProviderClass.class)
    public void CurrencyConversionTest(String currency, String code) throws IOException {

        Response response =
        given().log().all().param("?format=json")
                .when().get(ENDPOINT + "/api/exchangerates/rates/a/"+code+"/");


        response.then().statusCode(200);

             //   .then().statusCode(200).assertThat()
             //   .body("code", equalTo("CHF"))
             //   .body("rates.no", equalTo("221/A/NBP/2018"));
        ObjectMapper objectMapper = new ObjectMapper();

        System.out.println("");
        //convert json string to object
        System.out.println(response.getBody().asString());
        System.out.println("");
        CurrentAverageExchangeRate currentAverageExchangeRate = objectMapper.readValue(response.getBody().asString(), CurrentAverageExchangeRate.class);

     //   Assert.assertEquals(currentAverageExchangeRate.getCurrency(), currency);

     //   System.out.println(currentAverageExchangeRate.toString());
List<Rates> rates = currentAverageExchangeRate.getRates();
rates.get(0).getNo();
        System.out.println("Index --> "+rates.get(0).getNo());

    }

    @Test(dataProvider = "ErrorCurrencyCodes", dataProviderClass = DataProviderClass.class)
    public void Return404Test(String code){

        Response response =
                given().log().all().param("?format=json")
                        .when().get(ENDPOINT + "/api/exchangerates/rates/a/"+code+"/");

        System.out.println(response.statusCode());
        response.then().statusCode(404);

    }


    @BeforeSuite
    public void setup() {
     //   RestAssured.baseURI = ENDPOINT;
      //  RestAssured.port = 443;
    }

}
