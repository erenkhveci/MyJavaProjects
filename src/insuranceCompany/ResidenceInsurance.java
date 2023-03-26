package insuranceCompany;

import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public ResidenceInsurance( Date insuranceDate) {
        super("Konut Sigortası", insuranceDate);
    }

    @Override
    public  int calculate() {
        return 0;
    }
}
