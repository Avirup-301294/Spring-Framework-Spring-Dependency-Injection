package com.spring.sfgdi.controllers;

import avirup.spring.sfgdi.controllers.SetterInjectedController;
import avirup.spring.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}