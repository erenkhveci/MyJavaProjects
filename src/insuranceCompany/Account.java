package insuranceCompany;

import java.util.ArrayList;

public abstract class Account implements Comparable{
    User user ;
    ArrayList<Insurance> usersInsurances= new ArrayList<>();
    AuthenticationStatus authenticationStatus;

    public Account(User user, Insurance usersInsurances) {
        this.user = user;
        this.usersInsurances.add(usersInsurances) ;
    }

    public final void showUserInfo(){

        System.out.println("HEHEHEHEYY"+AuthenticationStatus.SUCCESS.toString());
        System.out.println("----MÜŞTERİ BİLGİLERİ----");
        System.out.println("İsim Soyisim : "+user.getIsim()+" "+user.getSoyisim());
        System.out.println("Yaş : "+user.getAge());
        System.out.println("Meslek :"+user.getMeslek());
        System.out.println("Email : "+user.getEmail());
        System.out.println("Sisteme son giriş : "+user.getDeadlineLogin().toString());
    }
    public abstract void addInsurance();

    public void loginTransactions(String email,String password) throws InvalidAuthenticationException {
        if(user.getEmail().equals(email)){
            if(user.getPassword().equals(password)){
                System.out.println("Hesabınıza Başarıyla Giriş Yaptınız :)");
                authenticationStatus=AuthenticationStatus.SUCCESS;
            }else {
                authenticationStatus=AuthenticationStatus.FAIL;
                throw new InvalidAuthenticationException();
            }
        }else {
            authenticationStatus=AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException();
        }
    }

    public void AddAdress(Address address){
        AddressManager.addAddress(user,address);
    }
    public void removeAdress(Address address){
        AddressManager.deleteAdress(user,address);
    }
    public AuthenticationStatus userStatus(){
        return authenticationStatus;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
