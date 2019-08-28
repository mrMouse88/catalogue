package com.asygnata.it.catalogue.controllers;

import com.asygnata.it.catalogue.model.ComputerModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ComputerModel test(){
        return new ComputerModel("123","comp model", "memory", "storage", "os");
    }
}
