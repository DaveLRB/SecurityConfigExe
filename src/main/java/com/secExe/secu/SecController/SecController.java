package com.secExe.secu.SecController;

import com.secExe.secu.SecService.SecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SecController {

    private final SecService service;

    @Autowired
    public SecController (SecService service) {
        this.service = service;
    }
}
