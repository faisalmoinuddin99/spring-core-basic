public class Main {
    public static void main(String[] args) {

        GreetingServiceFactory greetingServiceFactory = new GreetingServiceFactory() ;
        GreetingService greetingService = greetingServiceFactory.getGreetingService("french") ;
        greetingService.greet("faisal");

    }
}