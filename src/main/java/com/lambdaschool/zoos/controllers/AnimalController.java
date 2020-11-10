package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class AnimalController {
    @Autowired
    AnimalService animalService;
    @GetMapping(value = "/animals/count")
    public ResponseEntity<?> get
}
