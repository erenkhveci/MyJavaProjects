package insuranceCompany;

import java.util.Date;

public class HealthInsurance extends Insurance{
    int insurancePrice;

    public HealthInsurance(Date insuranceDate) {
        super("Sağlık Sigortası", insuranceDate);
        insurancePrice=calculate();

    }


    public int calculate() {
        return 0;


    }
}
