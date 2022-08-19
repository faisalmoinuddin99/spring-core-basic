
public class GreetingServiceFactory {

    public GreetingService getGreetingService(String language) {
        if (language.equals("english")){
            return new GreetInEnglish() ;
        }else if (language.equals("french")){
            return new GreetInFrench() ;
        }else {
            throw new RuntimeException("Service not available") ;
        }
    }
}
