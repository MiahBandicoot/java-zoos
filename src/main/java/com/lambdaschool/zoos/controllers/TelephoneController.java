package com.lambdaschool.zoos.controllers;

import com.lambdaschool.zoos.models.Telephone;
import org.springframework.data.repository.CrudRepository;

public class TelephoneController extends CrudRepository<Telephone, Long> {
   Telephone findByType(String phonetype);
}
