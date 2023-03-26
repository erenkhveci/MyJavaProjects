package insuranceCompany;

public class Enterprise extends Account{

    public Enterprise(User user, Insurance usersInsurances){
        super(user,usersInsurances);
        AccountManager.accountTreeSet.add(this);
    }
    @Override

    public void addInsurance() {

    }


}
