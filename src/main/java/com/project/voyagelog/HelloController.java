package com.project.voyagelog;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;



//@RequestMapping RestController를 붙이면 RequestMapping을 붙이지 않아도 디스패쳐 서블렛이 정보가 여기에 들어 있을 것이라고 판단한다.


@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) { //helloService를 멤버변수로 받아 사용
        this.helloService = helloService;

    }

    @GetMapping("/hello")
    public String sayHello(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        return helloService.sayHello(name);
    }

}
