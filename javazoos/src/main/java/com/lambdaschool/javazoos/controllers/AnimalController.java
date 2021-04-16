package com.lambdaschool.javazoos.controllers;

import com.lambdaschool.javazoos.services.AnimalService;
import com.lambdaschool.javazoos.views.ZooCount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @GetMapping(value = "/count", produces = "application/json")
    public ResponseEntity<?> getZooCounts() {
        List<ZooCount> zooCounts = animalService.getZooCounts();
        return new ResponseEntity<>(zooCounts, HttpStatus.OK);
    }
}

