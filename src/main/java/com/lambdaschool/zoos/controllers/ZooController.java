package com.lambdaschool.zoos.controllers;


import com.lambdaschool.zoos.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public class ZooController extends CrudRepository<Zoo, Long> {
    Zoo findZoosBy(String zooname);
}
