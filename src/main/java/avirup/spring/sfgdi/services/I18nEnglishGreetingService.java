package avirup.spring.sfgdi.services;

import avirup.spring.sfgdi.repositories.EnglishGreetingRepository;

//@Profile("EN") // Default profile don't need to explicitly mentioned in application.properties
//@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        //  return "Hello World - EN";
        return englishGreetingRepository.getGreeting();
    }

    
}
