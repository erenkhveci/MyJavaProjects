package insuranceCompany;

import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance( Date insuranceDate) {
        super("Seyahat Sigortası", insuranceDate);
    }

    @Override
    public int calculate() {
        return 0;
    }
}
