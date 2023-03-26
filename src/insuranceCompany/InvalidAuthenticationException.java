package insuranceCompany;

public class InvalidAuthenticationException extends Exception{
   public InvalidAuthenticationException(){
       super("Email veya Şifreniz Hatalı");
   }
}
