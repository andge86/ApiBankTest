public class Rates {


        String no;
        String effectiveDate;
        float mid;

        public String getNo() {
            return no;
        }

        public String getEffectiveDate() {
            return effectiveDate;
        }

        public float getMid() {
            return mid;
        }

        @Override
        public String toString() {
            return "Rates \n" +
                    "no: " + no + "\n" +
                    "effectiveDate: " + effectiveDate + "\n" +
                    "mid: " + mid ;
        }

}
