package com.spring.sfgdi.services;

import com.spring.sfgdi.repositories.EnglishGreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

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
