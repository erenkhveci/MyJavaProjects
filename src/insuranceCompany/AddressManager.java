package insuranceCompany;

public class AddressManager {


    public static void addAddress(User user, Address address){
            user.getAdress().add(address);
    }
    public static void deleteAdress(User user, Address address){
                user.getAdress().remove(address);
    }
}
