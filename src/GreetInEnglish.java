import org.springframework.stereotype.Component;

@Component
public class GreetInEnglish implements GreetingService{

    public void greet(String name){
        System.out.println("Hello " + name);
    }
}
