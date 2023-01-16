package com.bala.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
public class HelloController {
    @GetMapping("/hello")
            public String SayHello(){
                return "Hello From App";
            }
    @RequestMapping("/request/hello")
    public String requesthello(){
        return "Hello from Request mapping";
    }
}
