public class GreetInFrench implements GreetingService{

    @Override
    public void greet(String name) {
        System.out.println("Bonjour " + name);
    }
}
