import java.util.ArrayList;
import java.util.List;

public class CurrentAverageExchangeRate {

String table;
String currency;
String code;
List<Rates> rates = new ArrayList();

    public String getTable() {
        return table; }

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public List<Rates> getRates() {
        return rates;
    }

@Override
    public String toString(){
        return "CurrentAverageExchangeRate \n table: "+table+" \n currency: "+ currency + "\n" + "code: " + code + "\n" + "rates: " + rates.toString();
    }

}



