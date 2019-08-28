package com.asygnata.it.catalogue.services;

import com.asygnata.it.catalogue.dto.ComputerDto;
import com.asygnata.it.catalogue.model.ComputerModel;
import com.asygnata.it.catalogue.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

import static com.asygnata.it.catalogue.mapper.ComputerMapper.toEntity;

public class ComputerServices {
    private ComputerRepository computerRepository;

    @Autowired
    public ComputerServices(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Transactional
    public List<ComputerModel> findAll() {
        return this.computerRepository.findAll();
    }

    @Transactional
    public ComputerModel findById(Long id) {
        return this.computerRepository.findById(id).get();
    }

    @Transactional
    public void addComputer(ComputerDto computerDto){
        this.computerRepository.save(toEntity(computerDto));
    }

    @Transactional
    public void deleteById(Long id){
        this.computerRepository.deleteById(id);
    }
}
