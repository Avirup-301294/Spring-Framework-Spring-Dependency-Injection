package avirup.spring.sfgdi.config;

import avirup.spring.sfgdi.services.*;
import com.spring.pets.PetService;
import com.spring.pets.PetServiceFactory;
import avirup.spring.sfgdi.repositories.EnglishGreetingRepository;
import avirup.spring.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import avirup.spring.sfgdi.services.*;
import org.springframework.context.annotation.*;


@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {
    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService DogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory().getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService CatPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory().getPetService("cat");
    }

    @Profile({"ES", "default"}) @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN") @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

//    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}
