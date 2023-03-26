package insuranceCompany;

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String isim;
    private String soyisim;
    private String email;
    private String password;
    private String meslek;
    private String age;
    private ArrayList<Address> addresses=new ArrayList<>();
    private Date deadlineLogin;

    public User(String isim, String soyisim, String email, String password, String meslek, String age, Address addresses) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.password = password;
        this.meslek = meslek;
        this.age = age;
        this.addresses.add(addresses) ;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ArrayList<Address> getAdress() {
        return addresses;
    }

    public void setAdress(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public Date getDeadlineLogin() {
        return deadlineLogin;
    }

    public void setDeadlineLogin(Date deadlineLogin) {
        this.deadlineLogin = deadlineLogin;
    }
}
