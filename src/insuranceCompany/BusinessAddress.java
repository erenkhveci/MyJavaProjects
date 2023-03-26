package insuranceCompany;

public class BusinessAddress implements Address {
    private String adress;

    public BusinessAddress(String adress){
        this.adress=adress;
    }
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
