package insuranceCompany;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private int insurancePrice;
    private Date insuranceDate ;
    public Insurance(String insuranceName,Date insuranceDate){
        this.insuranceDate=insuranceDate;
        this.insuranceName=insuranceName;
        this.insurancePrice=insurancePrice;
        insurancePrice=calculate();
    }


    public  abstract int calculate();
    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public int getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(int insurancePrice) {
        this.insurancePrice = insurancePrice;
    }

    public Date getInsuranceDate() {
        return insuranceDate;
    }

    public void setInsuranceDate(Date insuranceDate) {
        this.insuranceDate = insuranceDate;
    }
}
