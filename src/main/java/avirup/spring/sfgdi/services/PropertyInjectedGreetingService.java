package avirup.spring.sfgdi.services;

// @Service
public class PropertyInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}

