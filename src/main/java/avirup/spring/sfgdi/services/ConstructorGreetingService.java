package avirup.spring.sfgdi.services;

// @Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
    
}
