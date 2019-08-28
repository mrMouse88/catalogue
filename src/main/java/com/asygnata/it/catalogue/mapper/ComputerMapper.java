package com.asygnata.it.catalogue.mapper;

import com.asygnata.it.catalogue.dto.ComputerDto;
import com.asygnata.it.catalogue.model.ComputerModel;

public class ComputerMapper {
    public static ComputerDto toDto(ComputerModel computerModel){
        ComputerDto computerDto = new ComputerDto();
        computerDto.setInventoryNumber(computerModel.getInventoryNumber());
        computerDto.setMemory(computerModel.getMemory());
        computerDto.setModel(computerModel.getModel());
        computerDto.setStorage(computerModel.getStorage());
        computerDto.setOs(computerModel.getOs());
        return computerDto;
    }

    public static ComputerModel toEntity(ComputerDto computerDto){
        ComputerModel computerModel = new ComputerModel();
        computerModel.setInventoryNumber(computerDto.getInventoryNumber());
        computerModel.setMemory(computerDto.getMemory());
        computerModel.setModel(computerDto.getModel());
        computerModel.setOs(computerDto.getOs());
        computerModel.setStorage(computerDto.getStorage());
        return computerModel;
    }
}
