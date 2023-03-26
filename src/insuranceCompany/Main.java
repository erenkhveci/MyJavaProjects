package insuranceCompany;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Address address= new BusinessAddress("KolaMahallesi");
        User user1 = new User("Eren","Kahveci","eren","eren","Komi","16",address);
        User user2 = new User("Eren","Kahveci","erenn","eren","Komi","16",address);
        User use3 = new User("Eren","Kahveci","erennn","eren","Komi","16",address);
        User user4 = new User("Eren","Kahveci","erennnn","eren","Komi","16",address);
        User user5 = new User("Eren","Kahveci","erennnnn","eren","Komi","16",address);
        User user6 = new User("Eren","Kahveci","erennnnnn","eren","Komi","16",address);
        Date insuranceDate = new Date(2024, Calendar.NOVEMBER,30);

        ResidenceInsurance residenceinsurance=new ResidenceInsurance(insuranceDate);
        HealthInsurance healthinsurance=new HealthInsurance(insuranceDate);
        Enterprise enterprise= new Enterprise(user1,residenceinsurance);
        Individual individual= new Individual(user2,healthinsurance);


        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen mailinizi giriniz ! : ");
        String email = sc.nextLine();
        System.out.print("Lütfen Şifrenizi giriniz ! : ");
        String password =sc.nextLine();
        AccountManager.login(email,password);
    }



}
