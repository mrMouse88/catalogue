package com.asygnata.it.catalogue.controllers;

import com.asygnata.it.catalogue.dto.ComputerDto;
import com.asygnata.it.catalogue.model.ComputerModel;
import com.asygnata.it.catalogue.services.ComputerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ComputerController {
    private ComputerServices computerServices;

    @Autowired
    public ComputerController(ComputerServices computerServices) {
        this.computerServices = computerServices;
    }

    @RequestMapping(value = "/computer", method = RequestMethod.GET)
    public List<ComputerModel> findAll(){
        return this.computerServices.findAll();
    }

    @RequestMapping(value = "/computer/{id}", method = RequestMethod.GET)
    public ComputerModel findById(@PathVariable Long id){
        return computerServices.findById(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/computer", method = RequestMethod.POST)
    public void addComputer(@RequestBody @Valid ComputerDto computerDto){
        this.computerServices.addComputer(computerDto);
    }

    @RequestMapping(value = "/computer", method = RequestMethod.PUT)
    public void updateComputer(@RequestBody @Valid ComputerDto computerDto){
        this.computerServices.addComputer(computerDto);
    }

    @RequestMapping(value = "/computer/{id}", method = RequestMethod.DELETE)
    public void deleteComputerById(@PathVariable Long id){
        this.computerServices.deleteById(id);
    }
}
