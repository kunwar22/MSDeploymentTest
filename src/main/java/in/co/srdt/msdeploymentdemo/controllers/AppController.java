package in.co.srdt.msdeploymentdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/gethello")
    public String hello() {
        return "Hello World !";
    }
}
