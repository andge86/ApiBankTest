import org.testng.annotations.DataProvider;

public class DataProviderClass {


    @DataProvider(name = "CurrencyCodes")
    public static Object[][] CurrencyCodes(){

        return new Object[][] {

                {"frank szwajcarski", "chf"},
                {"dolar amerykański", "usd"},
                {"rubel rosyjski", "rub"}

        };
    }


    @DataProvider(name = "ErrorCurrencyCodes")
    public static Object[][] ErrorCurrencyCodes(){

        return new Object[][] {

                {"ru"},
                {"rubb"},
                {"rux"}

        };
    }

}
