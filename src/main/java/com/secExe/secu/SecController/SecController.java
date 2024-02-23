package com.secExe.secu.SecController;

import com.secExe.secu.SecEntity.SecEntity;
import com.secExe.secu.SecService.SecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entities")
public class SecController {

    private final SecService service;

    @Autowired
    public SecController (SecService service) {
        this.service = service;
    }

    @GetMapping
    public List<SecEntity> getAll(){
        return service.getAll();
    }

    @PostMapping
    public ResponseEntity<SecEntity> create(@RequestBody SecEntity ent){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(ent));
    }
}
