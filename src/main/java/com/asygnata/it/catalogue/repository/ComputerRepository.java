package com.asygnata.it.catalogue.repository;

import com.asygnata.it.catalogue.model.ComputerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<ComputerModel, Long> {
}
