package insuranceCompany;

public class Individual extends Account{
    public Individual(User user, Insurance insurances){
        super(user,insurances);
        AccountManager.accountTreeSet.add(this);
    }
    @Override
    public void addInsurance() {

    }
}
