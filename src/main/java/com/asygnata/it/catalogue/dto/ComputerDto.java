package com.asygnata.it.catalogue.dto;

import javax.validation.constraints.NotEmpty;

public class ComputerDto {

    private Long id;

    @NotEmpty
    private String inventoryNumber;

    @NotEmpty
    private String model;

    @NotEmpty
    private String memory;

    @NotEmpty
    private String storage;

    @NotEmpty
    private String os;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
