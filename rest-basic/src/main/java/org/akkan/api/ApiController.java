package org.akkan.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by chethan on 8/24/17.
 */

@RestController
public class ApiController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}