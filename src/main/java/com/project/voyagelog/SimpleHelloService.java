package com.project.voyagelog;

import org.springframework.stereotype.Component;

import java.util.Objects;

@MyComponent
public class SimpleHelloService implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
