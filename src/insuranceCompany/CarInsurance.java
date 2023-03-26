package insuranceCompany;

import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance( Date insuranceDate) {
        super("Araç Sigortası",  insuranceDate);
    }

    @Override
    public int calculate() {
        return 0;
    }
}
