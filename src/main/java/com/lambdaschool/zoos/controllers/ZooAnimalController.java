package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.models.ZooAnimals;
import org.springframework.data.repository.CrudRepository;

public class ZooAnimalController extends CrudRepository<ZooAnimals, Long> {

}
